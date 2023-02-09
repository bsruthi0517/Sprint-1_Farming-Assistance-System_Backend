package com.cg.fas.dto;



import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
public class SupplierDto {
	 private long id;
	    @NotBlank(message="The name could not be blank or null")
	    private String name;
	    private String address;
	    @NotBlank(message="The password could not be blank or null")
	    @Size(min=4,max=10)
	    private String password;
	    @NotBlank(message="The email could not be blank or null")
	    @Email(message="Please enter the valid email id",regexp="^[a-zA-Z0-9._-]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9.]{2,5}")
	    private String email;
	    @NotBlank(message="The phoneNumber could not be blank or null")
	    private String phoneNumber;

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


	 

	}
