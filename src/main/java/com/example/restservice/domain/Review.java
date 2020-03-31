package com.example.restservice.domain;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Review extends Object {
    // Properties
    @Id
    private String id;
    private Date date;
    private String listing_id;
    private String reviewer_id;
    private String reviewer_name;
    private String comments;

    public Review() { }

    // Mutators
    public String getId() { return this.id; }
    public void setId(String _id) { this.id = _id; }

    public Date getDate() { return this.date; }
    public void setDate(Date date) { this.date = date; }

    public String getListing_id() { return this.listing_id; }
    public void setListing_id(String listing_id) { this.listing_id = listing_id; }

    public String getReviewer_id() { return this.reviewer_id; }
    public void setReviewer_id(String reviewer_id) { this.reviewer_id = reviewer_id; }

    public String getReviewer_name() { return this.reviewer_name; }
    public void setReviewer_name(String reviewer_name) { this.reviewer_name = reviewer_name; }

    public String getComments() { return this.comments; }
    public void setComments(String comments) { this.comments = comments; }
}
