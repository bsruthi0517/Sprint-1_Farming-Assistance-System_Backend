package com.cg.fas.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 

@Entity
@Table(name="login")
public class Login {
	  @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int id;
	    private String password;
	    public Login(String password) {
	        super();
	        this.password=password;
	    }
	    public Login() {
	        // TODO Auto-generated constructor stub
	    }
	    @Override
	    public String toString() {
	        return "Login [id=" + id + ", password=" + password + "]";
	    }
	    public int getId() {
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
