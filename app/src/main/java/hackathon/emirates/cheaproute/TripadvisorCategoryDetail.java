package hackathon.emirates.cheaproute;

/**
 * Created by nhan on 3/14/15.
 */
public class TripadvisorCategoryDetail {
    private String name;
    private String localized_string;

    public TripadvisorCategoryDetail(String name, String localized_string) {
        this.name = name;
        this.localized_string = localized_string;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalized_string() {
        return localized_string;
    }

    public void setLocalized_string(String localized_string) {
        this.localized_string = localized_string;
    }
}
