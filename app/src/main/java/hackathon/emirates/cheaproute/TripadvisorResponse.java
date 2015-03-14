package hackathon.emirates.cheaproute;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by nhan on 3/14/15.
 */
public class TripadvisorResponse {
    public TripadvisorPlace[] data;

    public TripadvisorPlace[] getData() {
        return data;
    }

    public void setData(TripadvisorPlace[] data) {
        this.data = data;
    }

    @JsonCreator
    public TripadvisorResponse(@JsonProperty("data") TripadvisorPlace[] data) {

        this.data = data;
    }
}
