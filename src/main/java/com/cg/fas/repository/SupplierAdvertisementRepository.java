package com.cg.fas.repository;
import java.util.Optional;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

 

import com.cg.fas.entity.SupplierAdvertisement;
@Repository
public interface SupplierAdvertisementRepository extends CrudRepository<SupplierAdvertisement, Integer>{

 

    Optional<SupplierAdvertisement> findById(Integer id);

 

}
