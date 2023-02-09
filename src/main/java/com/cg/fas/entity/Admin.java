package com.cg.fas.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Admin")
public class Admin implements Serializable{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String username;
private String password;
private Boolean loggedIn;
	public Admin() {
		super();
// TODO Auto-generated constructor stub
}
public Admin(String username, String password, Boolean loggedIn) {
super();
this.username = username;
this.password = password;
this.loggedIn = loggedIn;
// this.complaintList = complaintList;
}public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
@Override
public String toString() {
return "Admin [id=" + id + ", username=" + username + ", password=" + password + ", loggedIn=" + loggedIn + "]";
}
public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
public Boolean getLoggedIn() {
return loggedIn;
}
public void setLoggedIn(Boolean loggedIn) {
this.loggedIn = loggedIn;
}
}
