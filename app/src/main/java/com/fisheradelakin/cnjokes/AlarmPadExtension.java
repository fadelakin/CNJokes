package com.fisheradelakin.cnjokes;

import java.util.Locale;

import org.json.JSONObject;

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;

import com.mindmeapp.extensions.ExtensionData;
import com.mindmeapp.extensions.MindMeExtension;

public class AlarmPadExtension extends MindMeExtension {

	public static final String LOG_TAG = "AlarmPadExtension";
	
	public static final String SHARED_PREFERENCES = "cn_prefs";
	public static final String PREF_JOKE = "pref_joke";
	
	@Override
	protected void onUpdateData(int arg0) {

		JSONParser jParser = new JSONParser();
		JSONObject json = null;
		String joke = "";
		try {
			json = jParser.getJsonFromUrl(JokeActivity.URL);
			JSONObject c = json.getJSONObject("value");
            joke = c.getString("joke");
		} catch (Exception e) {
			Log.e(LOG_TAG, "Error fetching joke");
			joke = getCachedJoke();
		}
		
		if (json == null || TextUtils.isEmpty(joke)) {
			joke = getCachedJoke();
		} else {
			//Cache joke in case later calls fail
			SharedPreferences.Editor editor = getSharedPreferences(SHARED_PREFERENCES, Activity.MODE_PRIVATE).edit();
			editor.putString(PREF_JOKE, joke);
			editor.commit();
		}

		// Update RemoteViews layout with the fetched joke
		RemoteViews rv = new RemoteViews(this.getPackageName(),
				R.layout.alarmpad_view);

		rv.setTextViewText(R.id.jokeText, joke);

		// Sets up the data to publish
		ExtensionData data = new ExtensionData()
				.visible(true)
				.icon(R.drawable.ic_launcher)
				.statusToDisplay(joke)
				.statusToSpeak(getString(R.string.did_you_know) + " " + joke)
				.languageToSpeak(Locale.US)
				.viewsToDisplay(rv);

		// Publish the extension data update
		publishUpdate(data);

	}

	private String getCachedJoke() {
		SharedPreferences prefs = getSharedPreferences(SHARED_PREFERENCES, Activity.MODE_PRIVATE);
		return prefs.getString(PREF_JOKE, getString(R.string.no_joke));
	}

}
