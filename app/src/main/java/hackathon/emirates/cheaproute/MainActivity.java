package hackathon.emirates.cheaproute;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    private static final String API_KEY = "ah808014181908229612229724880308";
    private static final String ROOT_URL = "http://partners.api.skyscanner.net/apiservices/pricing/v1.0";
    private static final String Currency = "GBP";
    private static final String Country = "GB";
    private static final String Locale = "en-GB";
    private static final Integer Adult = 1;
    private static final String OriginPlace = "11235";
    private static final String DestinationPlace = "13554";
    private static final String OutboundDate = "2015-03-21";
    private static final String InboundDate = "2015-03-28";

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

    public void callAPI_1(View view) {

        // Now call the API

        new CallAPI_1().execute();
    }

    private class CallAPI_1 extends AsyncTask<String, Void, String> {



        @Override
        protected String doInBackground(String... params) {
            String resultToDisplay = "";
            List<NameValuePair> queryParams = new ArrayList<>();
            queryParams.add(new BasicNameValuePair("apiKey", API_KEY));
            queryParams.add(new BasicNameValuePair("country", Country));
            queryParams.add(new BasicNameValuePair("currency", Currency));
            queryParams.add(new BasicNameValuePair("locale", Locale));
            queryParams.add(new BasicNameValuePair("originplace", OriginPlace));
            queryParams.add(new BasicNameValuePair("destinationplace", DestinationPlace));
            queryParams.add(new BasicNameValuePair("outbounddate", OutboundDate));
            queryParams.add(new BasicNameValuePair("inbounddate", InboundDate));
            queryParams.add(new BasicNameValuePair("adults", Adult.toString()));

            String urlString = ROOT_URL + URLEncodedUtils.format(queryParams, "UTF-8");
            try {
                URL url = new URL(urlString);

                ObjectMapper mapper = new ObjectMapper();
                mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                SkyscannerFlights response = mapper.readValue(url, SkyscannerFlights.class);

                switch (response.getStatus()) {
                    case "OK":
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
