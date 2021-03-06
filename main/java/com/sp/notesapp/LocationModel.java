package com.sp.notesapp;

public class LocationModel {

    private String title, description, nearestMrt;
    private String image;
    private double lat,lon;

    public LocationModel(String title,String description, String nearestMrt, String image, double lat, double lon) {
        this.title = title;
        this.description = description;
        this.nearestMrt = nearestMrt;
        this.image = image;
        this.lat = lat;
        this.lon = lon;
    }

    public LocationModel() {

    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getNearestMrt() {
        return nearestMrt;
    }

    public String getImage() {
        return image;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }
}
