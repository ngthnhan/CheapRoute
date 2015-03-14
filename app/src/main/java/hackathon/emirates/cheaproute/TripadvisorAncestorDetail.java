package hackathon.emirates.cheaproute;

/**
 * Created by nhan on 3/14/15.
 *
 {
 "abbrv": null,
 "level": "City",
 "name": "Boston",
 "location_id": "60745"
 }
 */
public class TripadvisorAncestorDetail {
    public String abbrv;
    public String level;
    public String name;
    public String location_id;

    public TripadvisorAncestorDetail() {
    }

    public String getAbbrv() {
        return abbrv;
    }

    public void setAbbrv(String abbrv) {
        this.abbrv = abbrv;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }
}
