package hackathon.emirates.cheaproute;

/**
 * Created by nhan on 3/14/15.
 https://developer-tripadvisor.com/content-api/documentation/location-attractions/
 */
public class TripadvisorAttractionDetail {
    private String see_all_photos;
    private TripadvisorAttractionType[] attraction_types;
    private String web_url;
    private int percent_recommended;
    private String location_string;
    private String location_id;
    private String write_review;
//    private String api_detail_url;
    private TripadvisorAddressDetail address_obj;
    private String wikipedia_info;
    private TripadvisorCategoryDetail category;
    private TripadvisorAwardDetail[] awards;
    private String num_reviews;
    private String rating_image_url;
    private String name;
    private String longitude;
    private String latitude;
    private String rating;
    private TripadvisorAncestorDetail ancestors;
    private TripadvisorRankingDetail ranking_data;

    public TripadvisorAttractionDetail(String see_all_photos, TripadvisorAttractionType[] attraction_types, String web_url, int percent_recommended, String location_string, String location_id, String write_review, TripadvisorAddressDetail address_obj, String wikipedia_info, TripadvisorCategoryDetail category, TripadvisorAwardDetail[] awards, String num_reviews, String rating_image_url, String name, String longitude, String latitude, String rating, TripadvisorAncestorDetail ancestors, TripadvisorRankingDetail ranking_data) {
        this.see_all_photos = see_all_photos;
        this.attraction_types = attraction_types;
        this.web_url = web_url;
        this.percent_recommended = percent_recommended;
        this.location_string = location_string;
        this.location_id = location_id;
        this.write_review = write_review;
        this.address_obj = address_obj;
        this.wikipedia_info = wikipedia_info;
        this.category = category;
        this.awards = awards;
        this.num_reviews = num_reviews;
        this.rating_image_url = rating_image_url;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.rating = rating;
        this.ancestors = ancestors;
        this.ranking_data = ranking_data;
    }

    public String getSee_all_photos() {
        return see_all_photos;
    }

    public void setSee_all_photos(String see_all_photos) {
        this.see_all_photos = see_all_photos;
    }

    public TripadvisorAttractionType[] getAttraction_types() {
        return attraction_types;
    }

    public void setAttraction_types(TripadvisorAttractionType[] attraction_types) {
        this.attraction_types = attraction_types;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public int getPercent_recommended() {
        return percent_recommended;
    }

    public void setPercent_recommended(int percent_recommended) {
        this.percent_recommended = percent_recommended;
    }

    public String getLocation_string() {
        return location_string;
    }

    public void setLocation_string(String location_string) {
        this.location_string = location_string;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    public String getWrite_review() {
        return write_review;
    }

    public void setWrite_review(String write_review) {
        this.write_review = write_review;
    }

    public TripadvisorAddressDetail getAddress_obj() {
        return address_obj;
    }

    public void setAddress_obj(TripadvisorAddressDetail address_obj) {
        this.address_obj = address_obj;
    }

    public String getWikipedia_info() {
        return wikipedia_info;
    }

    public void setWikipedia_info(String wikipedia_info) {
        this.wikipedia_info = wikipedia_info;
    }

    public TripadvisorCategoryDetail getCategory() {
        return category;
    }

    public void setCategory(TripadvisorCategoryDetail category) {
        this.category = category;
    }

    public TripadvisorAwardDetail[] getAwards() {
        return awards;
    }

    public void setAwards(TripadvisorAwardDetail[] awards) {
        this.awards = awards;
    }

    public String getNum_reviews() {
        return num_reviews;
    }

    public void setNum_reviews(String num_reviews) {
        this.num_reviews = num_reviews;
    }

    public String getRating_image_url() {
        return rating_image_url;
    }

    public void setRating_image_url(String rating_image_url) {
        this.rating_image_url = rating_image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public TripadvisorAncestorDetail getAncestors() {
        return ancestors;
    }

    public void setAncestors(TripadvisorAncestorDetail ancestors) {
        this.ancestors = ancestors;
    }

    public TripadvisorRankingDetail getRanking_data() {
        return ranking_data;
    }

    public void setRanking_data(TripadvisorRankingDetail ranking_data) {
        this.ranking_data = ranking_data;
    }
}
