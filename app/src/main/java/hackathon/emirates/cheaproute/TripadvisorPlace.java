package hackathon.emirates.cheaproute;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Created by nhan on 3/14/15.
 https://developer-tripadvisor.com/content-api/documentation/location-attractions/
 */
public class TripadvisorPlace {
    public String see_all_photos;
    public TripadvisorAttractionType[] attraction_types;
    public String web_url;
    public int percent_recommended;
    public String location_string;
    public String location_id;
    public String write_review;
//    public String api_detail_url;
    public TripadvisorAddressDetail address_obj;
    public String wikipedia_info;
    public TripadvisorCategoryDetail category;
    public TripadvisorAwardDetail[] awards;
    public String num_reviews;
    public TripadvisorSubcategoryDetail[] subcategory;
    public String rating_image_url;
    public String name;
    public String longitude;
    public String latitude;
    public String rating;
    public TripadvisorAncestorDetail[] ancestors;
    public TripadvisorRankingDetail ranking_data;


    public TripadvisorPlace() {
    }

    public TripadvisorSubcategoryDetail[] getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(TripadvisorSubcategoryDetail[] subcategory) {
        this.subcategory = subcategory;
    }

    public TripadvisorAncestorDetail[] getAncestors() {
        return ancestors;
    }

    public void setAncestors(TripadvisorAncestorDetail[] ancestors) {
        this.ancestors = ancestors;
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

    public TripadvisorRankingDetail getRanking_data() {
        return ranking_data;
    }

    public void setRanking_data(TripadvisorRankingDetail ranking_data) {
        this.ranking_data = ranking_data;
    }
}
