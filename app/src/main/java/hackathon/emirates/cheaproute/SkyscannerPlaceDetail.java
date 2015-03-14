package hackathon.emirates.cheaproute;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by nhan on 3/14/15.
 */
public class SkyscannerPlaceDetail {
    @JsonProperty("PlaceId")
    private String PlaceId;

    @JsonProperty("PlaceName")
    private String PlaceName;

    @JsonProperty("CountryId")
    private String CountryId;

    @JsonProperty("RegionId")
    private String RegionId;

    @JsonProperty("CityId")
    private String CityId;

    @JsonProperty("CountryName")
    private String CountryName;

    public SkyscannerPlaceDetail() {
    }

    public String getPlaceId() {
        return PlaceId;
    }

    public void setPlaceId(String placeId) {
        PlaceId = placeId;
    }

    public String getPlaceName() {
        return PlaceName;
    }

    public void setPlaceName(String placeName) {
        PlaceName = placeName;
    }

    public String getCountryId() {
        return CountryId;
    }

    public void setCountryId(String countryId) {
        CountryId = countryId;
    }

    public String getRegionId() {
        return RegionId;
    }

    public void setRegionId(String regionId) {
        RegionId = regionId;
    }

    public String getCityId() {
        return CityId;
    }

    public void setCityId(String cityId) {
        CityId = cityId;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    @Override
    public String toString() {
        return PlaceName + ", " + CountryName;
    }
}
