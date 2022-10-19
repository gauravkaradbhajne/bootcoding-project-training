package com.online.restaurant;


public class Customer {
    private long customerId;
    private String name;
    private String adress;
    private long phoneNumber;
    private String city;
    private String state;
    private String  emailId;


    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    //getter start
    public String getName(){
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getEmailId() {
        return emailId;
    }


    //setter start
    public void setName(String name){
        this.name = name;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


}

