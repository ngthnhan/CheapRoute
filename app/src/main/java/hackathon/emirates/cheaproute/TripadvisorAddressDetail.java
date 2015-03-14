package hackathon.emirates.cheaproute;

/**
 * Created by nhan on 3/14/15.
 */

/**
 *  "address_obj": {
 "street1": "Boston Common",
 "street2": "Park & Tremont St.",
 "city": "Boston",
 "state": "Massachusetts",
 "country": "United States",
 "postalcode": "02108",
 "address_string": "Boston Common Park & Tremont St., Boston, MA 02108"
 }
 */
public class TripadvisorAddressDetail {
    public String street1;
    public String street2;
    public String city;
    public String state;
    public String country;
    public String postalcode;
    public String address_string;

    public TripadvisorAddressDetail() {
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getAddress_string() {
        return address_string;
    }

    public void setAddress_string(String address_string) {
        this.address_string = address_string;
    }
}
