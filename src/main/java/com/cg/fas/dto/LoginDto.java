package com.cg.fas.dto;

public class LoginDto {
	 private long id;
	    private String password;
	    public LoginDto(int id, String password) {

	        super();
	        this.id = id;
	        this.password = password;
	    }
	    @Override
	    public String toString() {
	        return "LoginDTO [id=" + id + ", password=" + password + "]";
	    }
	    public long getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
}
