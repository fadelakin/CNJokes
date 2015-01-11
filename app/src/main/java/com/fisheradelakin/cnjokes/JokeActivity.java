package com.fisheradelakin.cnjokes;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.json.JSONObject;

/**
 * Created by Fisher on 8/22/14.
 *
 * An app that tells you a random Chuck Norris Joke every time you hit a button.
 */

public class JokeActivity extends Activity {

    public static final String URL = "http://api.icndb.com/jokes/random";
    TextView mJokeText;
    Colors mColor = new Colors();

    private OfflineJokes mOfflineJokes = new OfflineJokes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);
        final Button jokeButton = (Button) findViewById(R.id.showJokeButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isNetworkAvailable()) {
                    new JSONParse().execute();
                    int color = mColor.getColor();
                    layout.setBackgroundColor(color);
                    jokeButton.setTextColor(color);
                } else {
                    final TextView jokeText= (TextView) findViewById(R.id.jokeText);
                    String joke = mOfflineJokes.getJoke();
                    jokeText.setText(joke);
                    int color = mColor.getColor();
                    layout.setBackgroundColor(color);
                    jokeButton.setTextColor(color);
                }
            }
        };
        jokeButton.setOnClickListener(listener);
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager manager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();

        boolean isAvailable = false;
        if(networkInfo != null && networkInfo.isConnected()) {
            isAvailable = true;
        }

        return isAvailable;
    }

    private class JSONParse extends AsyncTask<String, String, JSONObject> {
        private ProgressDialog pDialog;
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(JokeActivity.this);
            pDialog.setMessage("Getting Joke ...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();
        }
        @Override
        protected JSONObject doInBackground(String... args) {
            JSONParser jParser = new JSONParser();
            // Getting JSON from URL
            JSONObject json = jParser.getJsonFromUrl(URL);
            return json;
        }
        @Override
        protected void onPostExecute(JSONObject json) {
        pDialog.dismiss();
            try {
                // getting json from url
                JSONObject c = json.getJSONObject("value");
                // store json item
                String joke = c.getString("joke");
                // set json data in textview
                mJokeText = (TextView) findViewById(R.id.jokeText);
                mJokeText.setText(joke.replace("&quot;", "\"").replace("&amp;", "&").replace("&#39;", "\'"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
