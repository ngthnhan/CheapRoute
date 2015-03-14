package hackathon.emirates.cheaproute;

/**
 * Created by nhan on 3/14/15.
 */
public class Trip {
    private String startDate;
    private String endDate;
    private String home;
    private CityLeg[] cityLegs;

    public Trip(String startDate, String endDate, String home, CityLeg[] cityLegs) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.home = home;
        this.cityLegs = cityLegs;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public CityLeg[] getCityLegs() {
        return cityLegs;
    }

    public void setCityLegs(CityLeg[] cityLegs) {
        this.cityLegs = cityLegs;
    }
}
