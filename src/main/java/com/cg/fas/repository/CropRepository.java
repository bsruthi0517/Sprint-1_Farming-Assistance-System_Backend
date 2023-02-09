package com.cg.fas.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.fas.entity.Crop;
@Repository
public interface CropRepository extends CrudRepository<Crop, Integer>{
	 Optional<Crop> findById(Integer cropId);
}
