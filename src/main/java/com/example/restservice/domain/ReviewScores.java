package com.example.restservice.domain;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class ReviewScores extends Object {
    // Properties
    private int review_scores_accuracy;
    private int review_scores_cleanliness;
    private int review_scores_checkin;
    private int review_scores_communication;
    private int review_scores_location;
    private int review_scores_value;
    private int review_scores_rating;

    public ReviewScores() { }

    // Mutators
    public int getReview_scores_accuracy() { return this.review_scores_accuracy; }
    public void setReview_scores_accuracy(int review_scores_accuracy) { this.review_scores_accuracy = review_scores_accuracy; }

    public int getReview_scores_cleanliness() { return this.review_scores_cleanliness; }
    public void setReview_scores_cleanliness(int review_scores_cleanliness) { this.review_scores_cleanliness = review_scores_cleanliness; }

    public int getReview_scores_checkin() { return this.review_scores_checkin; }
    public void setReview_scores_checkin(int review_scores_checkin) { this.review_scores_checkin = review_scores_checkin; }

    public int getReview_scores_communication() { return this.review_scores_communication; }
    public void setReview_scores_communication(int review_scores_communication) { this.review_scores_communication = review_scores_communication; }

    public int getReview_scores_location() { return this.review_scores_location; }
    public void setReview_scores_location(int review_scores_location) { this.review_scores_location = review_scores_location; }

    public int getReview_scores_value() { return this.review_scores_value; }
    public void setReview_scores_value(int review_scores_value) { this.review_scores_value = review_scores_value; }

    public int getReview_scores_rating() { return this.review_scores_rating; }
    public void setReview_scores_rating(int review_scores_rating) { this.review_scores_rating = review_scores_rating; }

}
