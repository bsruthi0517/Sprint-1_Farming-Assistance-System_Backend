package com.cg.fas.entity;

 

import java.io.Serializable;

 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 

@Entity
@Table(name = "farmer")
public class Farmer implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int farmerId;
    private String username;
    private String firstName;
    private String lastName;
    private int pincode;
    private int phoneNo;

    public Farmer() {

    }
    public Farmer(int farmerId, String username, String firstName, String lastName, int pincode, int phoneNo) {
        super();
        this.farmerId = farmerId;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pincode = pincode;
        this.phoneNo = phoneNo;
    }
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