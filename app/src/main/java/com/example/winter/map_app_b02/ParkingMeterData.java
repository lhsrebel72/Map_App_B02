package com.example.winter.map_app_b02;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by WINTER on 11/6/2017.
 */

public class ParkingMeterData {
    /*
    Possible things to add:
    id
    isAvailable
    timeTillAvailable
    price
    timePerUse
    address

     */

    private int id;
    private boolean isAvailable;
    private int timeTillAvailble;    //In seconds
    private double price;       //price in USD to use the meter
    private int timePerUse;     //Time, in minutes, the meter is used for
    private LatLng latlng;      //Latitude, and Longitude of meter
    private String address;     //Gives the address in the format "LINE_1\nZIP\nCITY\nSTATE"

    public ParkingMeterData(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getTimeTillAvailble() {
        return timeTillAvailble;
    }

    public void setTimeTillAvailble(int timeTillAvailble) {
        this.timeTillAvailble = timeTillAvailble;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTimePerUse() {
        return timePerUse;
    }

    public void setTimePerUse(int timePerUse) {
        this.timePerUse = timePerUse;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LatLng getLatlng() {
        return latlng;
    }

    public void setLatlng(LatLng latlng) {
        this.latlng = latlng;
    }
}
