package com.cg.fas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.fas.entity.Farmer;

@Repository
public interface FarmerRepository extends CrudRepository<Farmer, Integer> {

    

 


}