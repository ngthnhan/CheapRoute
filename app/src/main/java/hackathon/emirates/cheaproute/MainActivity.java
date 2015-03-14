package hackathon.emirates.cheaproute;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class CallAPI_1 extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            String resultToDisplay = "";
            List<NameValuePair> queryParams = new ArrayList<>();
            queryParams.add(new BasicNameValuePair("key", API_KEY));
            queryParams.add(new BasicNameValuePair("address", params[0]));

            String urlString = ROOT_URL + URLEncodedUtils.format(queryParams, "UTF-8");

            try {
                URL url = new URL(urlString);

                ObjectMapper mapper = new ObjectMapper();
                mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                LocationResponse response = mapper.readValue(url, LocationResponse.class);

                switch (response.getStatus()) {
                    case "OK":
                        LocationData location = response.getResults()[0]; // Take first one
                        // Only care about the first result
                        resultToDisplay = location.displayResult();
                        break;
                    default:
                        System.out.println("Status is not okay" + response.getStatus());
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return resultToDisplay;
        }

        @Override
        protected void onPostExecute(String result) {
            TextView resultView = (TextView) findViewById(R.id.resultStr);
            resultView.setText(result);
        }
    }
}
