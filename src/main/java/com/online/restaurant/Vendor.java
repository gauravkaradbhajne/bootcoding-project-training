package com.online.restaurant;

public class Vendor {
    private String name;
    private String address;
    private long PhoneNumber;

    private String city;
    private String state;

    private String category;
    private double rating;


    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }



    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }



    public String getCategory() {
        return category;
    }

    public double getRating() {
        return rating;
    }





    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(long PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }





}
