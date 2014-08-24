package com.fisheradelakin.cnjokes;

import android.app.Activity;
import android.app.ProgressDialog;
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
    TextView jokeText;
    Colors mColor = new Colors();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        // final TextView jokeText = (TextView) findViewById(R.id.jokeText);
        final Button jokeButton = (Button) findViewById(R.id.showJokeButton);
        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new JSONParse().execute();
                int color = mColor.getColor();
                layout.setBackgroundColor(color);
                jokeButton.setTextColor(color);
            }
        };
        jokeButton.setOnClickListener(listener);
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
                // jokes = json.getJSONArray(TAG_JOKE);
                // getting json from url
                JSONObject c = json.getJSONObject("value");
                // store json item
                String joke = c.getString("joke");
                // set json data in textview
                jokeText = (TextView) findViewById(R.id.jokeText);
                jokeText.setText(joke.replace("&quot;", "\"").replace("&amp;", "&").replace("&#39;", "\'"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
