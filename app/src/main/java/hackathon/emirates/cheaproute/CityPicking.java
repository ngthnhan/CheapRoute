package hackathon.emirates.cheaproute;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class CityPicking extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_picking);

        final ArrayAdapter<SkyscannerPlaceDetail> adapter = new ArrayAdapter<SkyscannerPlaceDetail>(this,
                android.R.layout.simple_dropdown_item_1line);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.countries);

        textView.setAdapter(adapter);

        textView.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (s.length() >= 3) {
                    new AsyncTask<String, Void, SkyscannerPlaceDetail[]>(){

                        @Override
                        protected SkyscannerPlaceDetail[] doInBackground(String... params) {
                            // Fetch from API
                            String url_root = String.format(
                                    "http://partners.api.skyscanner.net/apiservices/autosuggest/v1.0/" +
                                            "%s/" + // {market}
                                            "%s/" + // {currency}
                                            "%s/?query=" + // {locale}
                                            "%s&apiKey=" + // {query}
                                            "%s",
                                            AppSettings.Skyscanner_Market,
                                            AppSettings.Skyscanner_Currency,
                                            AppSettings.Skyscanner_Locale,
                                            params[0],
                                            AppSettings.Skyscanner_Key);


                            ObjectMapper mapper = new ObjectMapper();
                            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                            SkyscannerPlaces places = null;
                            try {
                                places = mapper.readValue(new URL(url_root),
                                        SkyscannerPlaces.class);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                            return places != null ? places.getPlaces() : null;
                        }

                        @Override
                        protected void onPostExecute(SkyscannerPlaceDetail[] places) {

                            if (places != null) {
                                adapter.clear();
                                for (SkyscannerPlaceDetail place : places) {
                                    adapter.add(place);

                                }
                            }
                            adapter.notifyDataSetChanged();
                        }
                    }.execute(s.toString());
                }
            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_city_picking, menu);
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
}
