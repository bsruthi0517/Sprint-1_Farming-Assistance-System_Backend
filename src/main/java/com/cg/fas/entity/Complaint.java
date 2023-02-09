package com.cg.fas.entity;
import java.io.Serializable;
import javax.persistence.*;

 

@Entity
@Table(name = "Complaint")
public class Complaint implements Serializable {

     private static final long serialVersionUID = 1L;

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

 

    private String complaintDescription;

 

    
    public Complaint() {
        super();
        // TODO Auto-generated constructor stub
    }

 

    public Complaint(String complaintDescription) {
        super();
        this.complaintDescription = complaintDescription;

 

    }

 

    public Long getId() {
        return id;
    }

 

    public void setId(Long id) {
        this.id = id;
    }

 

    public String getComplaintDescription() {
        return complaintDescription;
    }

 

    public void setComplaintDescription(String complaintDescription) {
        this.complaintDescription = complaintDescription;
    }

 

 

    @Override
    public String toString() {
        return "Complaint [id=" + id + ",  complaintDescription=" + complaintDescription
                +  "]";
    }

}
