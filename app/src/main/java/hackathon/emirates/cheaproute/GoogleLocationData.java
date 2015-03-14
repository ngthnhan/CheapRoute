package hackathon.emirates.cheaproute;

/**
 * Created by nhan on 3/14/15.
 */
public class GoogleLocationData {
    private GoogleGeometryInfo geometry;
    private String formatted_address;

    public GoogleLocationData() {
    }

    public GoogleGeometryInfo getGeometry() {
        return geometry;
    }

    public void setGeometry(GoogleGeometryInfo geometry) {
        this.geometry = geometry;
    }

    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }
}
