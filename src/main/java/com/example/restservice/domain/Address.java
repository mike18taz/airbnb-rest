package com.example.restservice.domain;

public class Address extends Object {
    // Properties
    private String street;
    private String suburb;
    private String government_area;
    private String market;
    private String country;
    private String country_code;
    private Location location;

    public Address() { }

    // Mutators
    public String getStreet() { return this.street; }
    public void setStreet(String street) { this.street = street; }

    public String getSuburb() { return this.suburb; }
    public void setSuburb(String suburb) { this.suburb = suburb; }

    public String getGovernment_area() { return this.government_area; }
    public void setGovernment_area(String government_area) { this.government_area = government_area; }

    public String getMarket() { return this.market; }
    public void setMarket(String market) { this.market = market; }

    public String getCountry() { return this.country; }
    public void setCountry(String country) { this.country = country; }

    public String getCountry_code() { return this.country_code; }
    public void setCountry_code(String country_code) { this.country_code = country_code; }

    public Location getLocation() { return this.location; }
    public void setLocation(Location location) { this.location = location; }

}
