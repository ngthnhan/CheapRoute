package hackathon.emirates.cheaproute;

/**
 * Created by nhan on 3/14/15.
 "attraction_types": [
 {
 "localized_name": "Tours",
 "name": "tours"
 }
 ],
 */
public class TripadvisorAttractionType {
    public String localized_name;
    public String name;

    public TripadvisorAttractionType(String localized_name, String name) {
        this.localized_name = localized_name;
        this.name = name;
    }

    public TripadvisorAttractionType() {
    }

    public String getLocalized_name() {
        return localized_name;
    }

    public void setLocalized_name(String localized_name) {
        this.localized_name = localized_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
