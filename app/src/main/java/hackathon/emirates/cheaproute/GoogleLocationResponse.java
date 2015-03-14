package hackathon.emirates.cheaproute;

/**
 * Created by nhan on 3/14/15.
 */
public class GoogleLocationResponse {
    private GoogleLocationData[] results;
    private String status;

    public GoogleLocationResponse() {
    }

    public GoogleLocationData[] getResults() {
        return results;
    }

    public void setResults(GoogleLocationData[] results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
