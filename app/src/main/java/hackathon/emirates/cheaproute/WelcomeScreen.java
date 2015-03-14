package hackathon.emirates.cheaproute;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;


public class WelcomeScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome_screen, menu);
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

    public void planTrip(View view) {
        new CallAPI().execute();
    }

    private class CallAPI extends AsyncTask<Void, Void, String> {

        private final String ROOT_URL = "http://partners.api.skyscanner.net/apiservices/pricing/v1.0/";
        private String POLL_URL;
        private final String API_KEY = "ah808014181908229612229724880308";
        private final String Currency = "GBP";
        private final String Country = "GB";
        private final String Locale = "en-GB";
        private final Integer Adult = 1;
        private final String OriginPlace = "11235";
        private final String DestinationPlace = "13554";
        private final String OutboundDate = "2015-03-21";
        private final String InboundDate = "2015-03-28";

        @Override
        protected String doInBackground(Void... params) {
            String resultToDisplay = "";

            HttpClient client = new DefaultHttpClient();
            HttpPost post = new HttpPost(ROOT_URL);
            try {
                List<NameValuePair> queryParams = new ArrayList<NameValuePair>();
                queryParams.add(new BasicNameValuePair("apiKey", API_KEY));
                queryParams.add(new BasicNameValuePair("country", Country));
                queryParams.add(new BasicNameValuePair("currency", Currency));
                queryParams.add(new BasicNameValuePair("locale", Locale));
                queryParams.add(new BasicNameValuePair("originplace", OriginPlace));
                queryParams.add(new BasicNameValuePair("destinationplace", DestinationPlace));
                queryParams.add(new BasicNameValuePair("outbounddate", OutboundDate));
                queryParams.add(new BasicNameValuePair("inbounddate", InboundDate));
                queryParams.add(new BasicNameValuePair("adults", Adult.toString()));
                post.setEntity(new UrlEncodedFormEntity(queryParams));
                post.setHeader("Content-Type", "application/x-www-form-urlencoded");
                post.setHeader("Accept", "application/json");

                HttpResponse response = client.execute(post);
                Header header = response.getHeaders("Location")[0];
                POLL_URL = header.getValue() + '?';

                Thread.sleep(1);

                // Making API poll
                queryParams = new ArrayList<NameValuePair>();
                queryParams.add(new BasicNameValuePair(("apiKey"), API_KEY));
                String urlString = header.getValue() + '?' + URLEncodedUtils.format(queryParams, "UTF-8");

                ObjectMapper mapper = new ObjectMapper();
                mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                SkyscannerFlights flights = mapper.readValue(new URL(urlString), SkyscannerFlights.class);

                System.out.println(flights.getStatus());



            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "Done!";
        }

        @Override
        protected void onPostExecute(String result) {
            System.out.println("Hello" + result);
        }
    }

}
