package com.cg.fas.dto;

 

public class FarmerDTO {
    private int farmerId;
    private String username;
    private String firstName;
    private String lastName;
    private int pincode;
    private int phoneNo;

    public int getFarmerId() {
        return farmerId;
    }
    public void setFarmerId(int farmerId) {
        this.farmerId = farmerId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    public int getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

}