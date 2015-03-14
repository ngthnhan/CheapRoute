package hackathon.emirates.cheaproute;

/**
 * Created by nhan on 3/14/15.
 */
public class SkyscannerResponse {
    public SkyscannerFlights Flights;

    public SkyscannerResponse() {
    }

    public SkyscannerFlights getFlights() {
        return Flights;
    }

    public void setFlights(SkyscannerFlights flights) {
        Flights = flights;
    }
}

