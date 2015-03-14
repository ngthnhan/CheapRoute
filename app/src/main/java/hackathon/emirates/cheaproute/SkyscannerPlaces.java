package hackathon.emirates.cheaproute;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by nhan on 3/14/15.
 */
public class SkyscannerPlaces {
    @JsonProperty("Places")
    private SkyscannerPlaceDetail[] Places;

    public SkyscannerPlaces() {
    }

    public SkyscannerPlaceDetail[] getPlaces() {
        return Places;
    }

    public void setPlaces(SkyscannerPlaceDetail[] places) {
        Places = places;
    }
}
