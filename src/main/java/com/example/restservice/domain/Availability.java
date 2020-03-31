package com.example.restservice.domain;

public class Availability extends Object {
    // Properties
    private int availability_30;
    private int availability_60;
    private int availability_90;
    private int availability_365;

    public Availability() { }

    // Mutators
    public int getAvailability_30() { return this.availability_30; }
    public void setAvailability_30(int availability_30) { this.availability_30 = availability_30; }

    public int getAvailability_60() { return this.availability_60; }
    public void setAvailability_60(int availability_60) { this.availability_60 = availability_60; }

    public int getAvailability_90() { return this.availability_90; }
    public void setAvailability_90(int availability_90) { this.availability_90 = availability_90; }

    public int getAvailability_365() { return this.availability_365; }
    public void setAvailability_365(int availability_365) { this.availability_365 = availability_365; }


}
