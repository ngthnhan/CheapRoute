package hackathon.emirates.cheaproute;

import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nhan on 3/14/15.
 */
public class FlightCalculator {
    public List<SkyscannerFlights> flightList;

    public FlightCalculator() {
        flightList = new ArrayList<SkyscannerFlights>();
    }

    private class fetchAPI extends AsyncTask<String, Void, SkyscannerFlights> {

        @Override
        /**
         * apiKey	        Yes	The API Key to identify the customer	String	Must be a valid API Key
         country	        Yes	The user’s market country	String	ISO country code, or specified location schema
         currency	        Yes	The user’s currency	String	ISO currency code
         locale	            Yes	The user’s localization preference	String	ISO locale code (language and country)
         originplace	    Yes	The origin city or airport	String	Specified location schema, or Skyscanner Rnid
         destinationplace	Yes	The destination city or airport	String	Specified location schema, or Skyscanner Rnid
         outbounddate	    Yes	The departure date	Date	Formatted as YYYY-mm-dd
         adults	            Yes	The number of adults	Int	Defaults to 1 if not specified. Maximum 8
         */
        protected SkyscannerFlights doInBackground(String... params) {
            // Search in the table if the flight is already searched

            return null;
        }

        @Override
        protected void onPostExecute(SkyscannerFlights flights) {

        }
    }
}
