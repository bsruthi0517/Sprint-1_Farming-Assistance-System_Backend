package com.cg.fas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.fas.entity.Complaint;


 

@Repository
public interface ComplaintRepository extends CrudRepository<Complaint, Integer> {

 

    void delete(Complaint complaint);

 

}