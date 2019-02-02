package com.example.android.quakereport;

public class Earthquake {

    private double magnitude;
    private String place;
    private String date;

    public Earthquake(double magnitude,String place,String date) {
        this.magnitude = magnitude;
        this.place = place;
        this.date = date;
    }

    public double getMagnitude() { return magnitude;}
    public String getPlace() { return place;}
    public String getDate() { return date;}
}
