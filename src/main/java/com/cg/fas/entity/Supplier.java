package com.cg.fas.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 

import org.springframework.lang.NonNull;

 

@Entity
@Table(name="supplier")

public class Supplier {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    @NonNull
	    private String name;
	    private String address;
	    @NonNull
	    private String password;
	    @NonNull
	    private String email;
	    @NonNull
	    private String phoneNumber;


	    public Supplier(String name, String address, String password, String email, String phoneNumber) {
	        super();
	        this.name = name;
	        this.address = address;
	        this.password = password;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	    }

	 

	    public Supplier() {
	        // TODO Auto-generated constructor stub
	    }

	 

	    @Override
	    public String toString() {
	        return "Supplier [id=" + id + ", name=" + name + ", address=" + address + ", password=" + password + ", email="
	                + email + ", phoneNumber=" + phoneNumber + "]";
	    }

	 

	    public long getId() {
	        return id;
	    }

	 

	    public void setId(long id) {
	        this.id = id;
	    }

	 

	    public String getName() {
	        return name;
	    }

	 

	    public void setName(String name) {
	        this.name = name;
	    }

	 

	    public String getAddress() {
	        return address;
	    }

	 

	    public void setAddress(String address) {
	        this.address = address;
	    }

	 

	    public String getPassword() {
	        return password;
	    }

	 

	    public void setPassword(String password) {
	        this.password = password;
	    }

	 

	    public String getEmail() {
	        return email;
	    }

	 

	    public void setEmail(String email) {
	        this.email = email;
	    }

	 

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	 

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	 

	    public static boolean isPresent() {
	        // TODO Auto-generated method stub
	        return false;
	    }

	 

	    public static Object get() {
	        // TODO Auto-generated method stub
	        return null;
	    }


	  }
