package com.cg.fas.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cg.fas.entity.Login;
import com.cg.fas.entity.Supplier;

public interface SupplierRepository extends CrudRepository<Supplier, Long>{

 

    void save(Login login);

 

    Optional<Supplier> findById(Long id);

}