package hackathon.emirates.cheaproute;

import android.os.AsyncTask;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;


public class DetailsInputForm extends ActionBarActivity implements OnItemSelectedListener {

    Spinner days1, days2, days3, days4;

    private String[] days = {"1","2","3","4","5","6","7","8","9"};



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_input_form);
        System.out.println(days.length);



        final ArrayAdapter<SkyscannerPlaceDetail> adapter_1 = new ArrayAdapter<SkyscannerPlaceDetail>(this,
                android.R.layout.simple_dropdown_item_1line);
        AutoCompleteTextView cityView1 = (AutoCompleteTextView)
                findViewById(R.id.city1);

        cityView1.setAdapter(adapter_1);
        cityView1.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (s.length() >= 1) {
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
                                adapter_1.clear();
                                for (SkyscannerPlaceDetail place : places) {
                                    adapter_1.add(place);
                                    System.out.println(place);
                                }
                            }
                            adapter_1.notifyDataSetChanged();
                        }
                    }.execute(s.toString());
                }
            }
        });

        final ArrayAdapter<SkyscannerPlaceDetail> adapter_2 = new ArrayAdapter<SkyscannerPlaceDetail>(this,
                android.R.layout.simple_dropdown_item_1line);
        AutoCompleteTextView cityView2 = (AutoCompleteTextView) findViewById(R.id.city2);

        cityView2.setAdapter(adapter_2);
        cityView2.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (s.length() >= 1) {
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
                                adapter_2.clear();
                                for (SkyscannerPlaceDetail place : places) {
                                    adapter_2.add(place);
                                    System.out.println(place);
                                }
                            }
                            adapter_2.notifyDataSetChanged();
                        }
                    }.execute(s.toString());
                }
            }
        });

        final ArrayAdapter<SkyscannerPlaceDetail> adapter_3 = new ArrayAdapter<SkyscannerPlaceDetail>(this,
                android.R.layout.simple_dropdown_item_1line);
        AutoCompleteTextView cityView3 = (AutoCompleteTextView)
                findViewById(R.id.city3);

        cityView3.setAdapter(adapter_3);
        cityView3.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (s.length() >= 1) {
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
                                adapter_3.clear();
                                for (SkyscannerPlaceDetail place : places) {
                                    adapter_3.add(place);
                                    System.out.println(place);
                                }
                            }
                            adapter_3.notifyDataSetChanged();
                        }
                    }.execute(s.toString());
                }
            }
        });

        final ArrayAdapter<SkyscannerPlaceDetail> adapter_4 = new ArrayAdapter<SkyscannerPlaceDetail>(this,
                android.R.layout.simple_dropdown_item_1line);
        AutoCompleteTextView cityView4 = (AutoCompleteTextView)
                findViewById(R.id.city4);

        cityView4.setAdapter(adapter_4);
        cityView4.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (s.length() >= 1) {
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
                                adapter_4.clear();
                                for (SkyscannerPlaceDetail place : places) {
                                    adapter_4.add(place);
                                    System.out.println(place);
                                }
                            }
                            adapter_4.notifyDataSetChanged();
                        }
                    }.execute(s.toString());
                }
            }
        });


        days1 = (Spinner) findViewById(R.id.days1);
        days2 = (Spinner) findViewById(R.id.days2);
        days3 = (Spinner) findViewById(R.id.days3);
        days4 = (Spinner) findViewById(R.id.days4);

        ArrayAdapter<String> adapter_days= new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, days);
        adapter_days.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        days1.setAdapter(adapter_days);
        days1.setOnItemSelectedListener(this);
        days2.setAdapter(adapter_days);
        days2.setOnItemSelectedListener(this);
        days3.setAdapter(adapter_days);
        days3.setOnItemSelectedListener(this);
        days4.setAdapter(adapter_days);
        days4.setOnItemSelectedListener(this);

    }

    public void onItemSelected(AdapterView<?> parent, View view, int position,
            long id) {
        Spinner spin = (Spinner) parent;
        spin.setSelection(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
            // TODO Auto-generated method stub

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_details_input_form, menu);
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
