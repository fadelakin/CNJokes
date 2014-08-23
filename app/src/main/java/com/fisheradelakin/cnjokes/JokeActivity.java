package com.fisheradelakin.cnjokes;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.json.JSONObject;

/**
 * Created by Fisher on 8/22/14.
 *
 * An app that tells you a random Chuck Norris Joke every time you hit a button.
 */

public class JokeActivity extends Activity {

    static String url = "http://api.icndb.com/jokes/random";

    TextView jokeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        // final TextView jokeText = (TextView) findViewById(R.id.jokeText);
        Button jokeButton = (Button) findViewById(R.id.showJokeButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new JSONParse().execute();
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
            JSONObject json = jParser.getJsonFromUrl(url);
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
                jokeText.setText(joke);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.joke, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
