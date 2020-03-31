package com.example.restservice.domain;

public class Location extends Object {
    // Properties
    private String type;
    private double[] coordinates;
    private boolean is_location_exact;


    public Location() { }

    // Mutators
    public String getType() { return this.type; }
    public void setType(String type) { this.type = type; }

    public double[] getCoordinates() { return this.coordinates; }
    public void setCoordinates(double[] coordinates) { this.coordinates = coordinates; }

    public boolean getIs_location_exact() { return this.is_location_exact; }
    public void setIs_location_exact(boolean is_location_exact) { this.is_location_exact = is_location_exact; }

}
