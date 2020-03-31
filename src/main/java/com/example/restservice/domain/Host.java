package com.example.restservice.domain;

import java.util.ArrayList;

public class Host extends Object {
    private String host_id;
    private String host_url;
    private String host_name;
    private String host_location;
    private String host_about;
    private String host_response_time;
    private String host_thumbnail_url;
    private String host_picture_url;
    private String host_neighbourhood;
    private int host_response_rate;
    private boolean host_is_superhost;
    private boolean host_has_profile_pic;
    private boolean host_identity_verified;
    private int host_listings_count;
    private int host_total_listings_count;
    private ArrayList<String> host_verifications;

    public Host() { }

    // Mutators
    public String getHost_id() { return this.host_id; }
    public void setHost_id(String host_id) { this.host_id = host_id; }

    public String getHost_url() { return this.host_url; }
    public void setHost_url(String host_url) { this.host_url = host_url; }

    public String getHost_name() { return this.host_name; }
    public void setHost_name(String host_name) { this.host_name = host_name; }

    public String getHost_location() { return this.host_location; }
    public void setHost_location(String host_location) { this.host_location = host_location; }

    public String getHost_about() { return this.host_about; }
    public void setHost_about(String host_about) { this.host_about = host_about; }

    public String getHost_response_time() { return this.host_response_time; }
    public void setHost_response_time(String host_response_time) { this.host_response_time = host_response_time; }

    public String getHost_thumbnail_url() { return this.host_thumbnail_url; }
    public void setHost_thumbnail_url(String host_thumbnail_url) { this.host_thumbnail_url = host_thumbnail_url; }

    public String getHost_picture_url() { return this.host_picture_url; }
    public void setHost_picture_url(String host_picture_url) { this.host_picture_url = host_picture_url; }

    public String getHost_neighbourhood() { return this.host_neighbourhood; }
    public void setHost_neighbourhood(String host_neighbourhood) { this.host_neighbourhood = host_neighbourhood; }

    public int getHost_response_rate() { return this.host_response_rate; }
    public void setHost_response_rate(int host_response_rate) { this.host_response_rate = host_response_rate; }

    public boolean getHost_is_superhost() { return this.host_is_superhost; }
    public void setHost_is_superhost(boolean host_is_superhost) { this.host_is_superhost = host_is_superhost; }

    public boolean getHost_has_profile_pic() { return this.host_has_profile_pic; }
    public void setHost_has_profile_pic(boolean host_has_profile_pic) { this.host_has_profile_pic = host_has_profile_pic; }

    public boolean getHost_identity_verified() { return this.host_identity_verified; }
    public void setHost_identity_verified(boolean host_identity_verified) { this.host_identity_verified = host_identity_verified; }

    public int getHost_listings_count() { return this.host_listings_count; }
    public void setHost_listings_count(int host_listings_count) { this.host_listings_count = host_listings_count; }

    public int getHost_total_listings_count() { return this.host_total_listings_count; }
    public void setHost_total_listings_count(int host_total_listings_count) { this.host_total_listings_count = host_total_listings_count; }

    public ArrayList<String> getHost_verifications() { return this.host_verifications; }
    public void setHost_verifications(ArrayList<String> host_verifications) { this.host_verifications = host_verifications; }

}
