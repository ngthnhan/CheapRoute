package hackathon.emirates.cheaproute;

/**
 * Created by nhan on 3/14/15.
 *         {
 "award_type": "Certificate of Excellence",
 "year": "2014",
 "images": {
 "small": "http://www.tripadvisor.com/img/cdsi/img2/awards/CERTIFICATE_OF_EXCELLENCE_small-MCID-5.jpg",
 "large": "http://www.tripadvisor.com/img/cdsi/img2/awards/CERTIFICATE_OF_EXCELLENCE_2014_en_US_large-MCID-5.jpg"
 },
 "categories": [],
 "display_name": "Certificate of Excellence 2014"
 }
 */
public class TripadvisorAwardDetail {
    public String award_type;
    public String year;
    public String display_name;

    public TripadvisorAwardDetail() {
    }

    public String getAward_type() {
        return award_type;
    }

    public void setAward_type(String award_type) {
        this.award_type = award_type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }
}
