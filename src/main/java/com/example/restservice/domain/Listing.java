package com.example.restservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.Date;

@Document (collection = "listingsAndReviews")
public class Listing {
    // Primitive Properties
    @Id
    private String id;
    private String listing_url;
    private String name;
    private String summary;
    private String space;
    private String description;
    private String neighborhood_overview;
    private String notes;
    private String transit;
    private String access;
    private String interaction;
    private String house_rules;
    @Field("property_type")
    private String propertyType;
    private String room_type;
    private String bed_type;
    private String minimum_nights;
    private String maximum_nights;
    private String cancellation_policy;
    private Date last_scraped;
    private Date calendar_last_scraped;
    private Date first_review;
    private Date last_review;
    private int accommodates;
    private int bedrooms;
    private int beds;
    private int number_of_reviews;
    private double bathrooms;
    private double price;
    private double security_deposit;
    private double cleaning_fee;
    private double extra_people;
    private double guests_included;
    private ArrayList<String> amenities;

    // Object Properties
    private Images images;
    private Host host;
    private Address address;
    private Availability availability;
    private ReviewScores review_scores;
    private ArrayList<Review> reviews;


    public Listing() { }

    // Primitive Mutators
    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }

    public String getListing_url() { return this.listing_url; }
    public void setListing_url(String listing_url) { this.listing_url = listing_url; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public String getSummary() { return this.summary; }
    public void setSummary(String summary) { this.summary = summary; }

    public String getSpace() { return this.space; }
    public void setSpace(String space) { this.space = space; }

    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public String getNeighborhood_overview() { return this.neighborhood_overview; }
    public void setNeighborhood_overview(String neighborhood_overview) { this.neighborhood_overview = neighborhood_overview; }

    public String getNotes() { return this.notes; }
    public void setNotes(String notes) { this.notes = notes; }

    public String getTransit() { return this.transit; }
    public void setTransit(String transit) { this.transit = transit; }

    public String getAccess() { return this.access; }
    public void setAccess(String access) { this.access = access; }

    public String getInteraction() { return this.interaction; }
    public void setInteraction(String interaction) { this.interaction = interaction; }

    public String getHouse_rules() { return this.house_rules; }
    public void setHouse_rules(String house_rules) { this.house_rules = house_rules; }

    public String getProperty_type() { return this.propertyType; }
    public void setProperty_type(String property_type) { this.propertyType = property_type; }

    public String getRoom_type() { return this.room_type; }
    public void setRoom_type(String room_type) { this.room_type = room_type; }

    public String getBed_type() { return this.bed_type; }
    public void setBed_type(String bed_type) { this.bed_type = bed_type; }

    public String getMinimum_nights() { return this.minimum_nights; }
    public void setMinimum_nights(String minimum_nights) { this.minimum_nights = minimum_nights; }

    public String getMaximum_nights() { return this.maximum_nights; }
    public void setMaximum_nights(String maximum_nights) { this.maximum_nights = maximum_nights; }

    public String getCancellation_policy() { return this.cancellation_policy; }
    public void setCancellation_policy(String cancellation_policy) { this.cancellation_policy = cancellation_policy; }

    public Date getLast_scraped() { return this.last_scraped; }
    public void setLast_scraped(Date last_scraped) { this.last_scraped = last_scraped; }

    public Date getCalendar_last_scraped() { return this.calendar_last_scraped; }
    public void setCalendar_last_scraped(Date calendar_last_scraped) { this.calendar_last_scraped = calendar_last_scraped; }

    public Date getFirst_review() { return this.first_review; }
    public void setFirst_review(Date first_review) { this.first_review = first_review; }

    public Date getLast_review() { return this.last_review; }
    public void setLast_review(Date last_review) { this.last_review = last_review; }

    public int getAccommodates() { return this.accommodates; }
    public void setAccommodates(int accommodates) { this.accommodates = accommodates; }

    public int getBedrooms() { return this.bedrooms; }
    public void setBedrooms(int bedrooms) { this.bedrooms = bedrooms; }

    public int getBeds() { return this.beds; }
    public void setBeds(int beds) { this.beds = beds; }

    public int getNumber_of_reviews() { return this.number_of_reviews; }
    public void setNumber_of_reviews(int number_of_reviews) { this.number_of_reviews = number_of_reviews; }

    public double getBathrooms() { return this.bathrooms; }
    public void setBathrooms(double bathrooms) { this.bathrooms = bathrooms; }

    public double getPrice() { return this.price; }
    public void setPrice(double price) { this.price = price; }

    public double getSecurity_deposit() { return this.security_deposit; }
    public void setSecurity_deposit(double security_deposit) { this.security_deposit = security_deposit; }

    public double getCleaning_fee() { return this.cleaning_fee; }
    public void setCleaning_fee(double cleaning_fee) { this.cleaning_fee = cleaning_fee; }

    public double getExtra_people() { return this.extra_people; }
    public void setExtra_people(double extra_people) { this.extra_people = extra_people; }

    public double getGuests_included() { return this.guests_included; }
    public void setGuests_included(double guests_included) { this.guests_included = guests_included; }

    public ArrayList<String> getAmenities() { return this.amenities; }
    public void setAmenities(ArrayList<String> amenities) { this.amenities = amenities; }

    // Object Mutators
    public Images getImages() { return this.images; }
    public void setImages(Images images) { this.images = images; }

    public Host getHost() { return this.host; }
    public void setHost(Host host) { this.host = host; }

    public Address getAddress() { return this.address; }
    public void setAddress(Address address) { this.address = address; }

    public Availability getAvailability() { return this.availability; }
    public void setAvailability(Availability availability) { this.availability = availability; }

    public ReviewScores getReview_scores() { return this.review_scores; }
    public void setReview_scores(ReviewScores review_scores) { this.review_scores = review_scores; }

    public ArrayList<Review> getReviews() { return this.reviews; }
    public void setReviews(ArrayList<Review> reviews) { this.reviews = reviews; }


    @Override
    public String toString() {
        return "Listing [id=" + id + ", property_type=" + propertyType + "]";
    }


}
