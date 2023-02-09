package com.cg.fas.service.impl;

 

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

 

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

import com.cg.fas.dto.FarmerDTO;
import com.cg.fas.exception.FarmerNotFoundException;
import com.cg.fas.entity.Farmer;
import com.cg.fas.repository.FarmerRepository;
import com.cg.fas.service.FarmerService;

 

@Service
public class FarmerServiceImpl implements FarmerService {

 

    @Autowired
    private FarmerRepository farmerRepository;

 

    @Override
    public FarmerDTO saveFarmer(FarmerDTO farmerDTO) {
        Farmer farmer = new Farmer();
        BeanUtils.copyProperties(farmerDTO, farmer);
        farmerRepository.save(farmer);
        return farmerDTO;

 

    }

 

    @Override
    public FarmerDTO updateFarmer(FarmerDTO farmerDTO) {
        Farmer farmer = new Farmer();
        BeanUtils.copyProperties(farmerDTO, farmer);
        farmerRepository.save(farmer);
        return farmerDTO;
    }

 

    @Override
    public boolean deleteFarmer(FarmerDTO farmerDTO) {
        Farmer farmer = new Farmer();
        BeanUtils.copyProperties(farmerDTO, farmer);
        farmerRepository.delete(farmer);

 

        return true;
    }

 

    @Override
    public FarmerDTO getByFarmerId(Integer farmerId) {
        Optional<Farmer> farmer = farmerRepository.findById(farmerId);
        if (farmer.isPresent()) {
            FarmerDTO dto = new FarmerDTO();
            BeanUtils.copyProperties(farmer.get(), dto);
            return dto;

 

        }
        throw new FarmerNotFoundException("Payment with id" + farmerId + "doesn't exist");
        // return null;

 

    }

 

    @Override
    public List<FarmerDTO> viewAllFarmerDetails() {
        Iterable<Farmer> list = farmerRepository.findAll();
        List<FarmerDTO> dtos = new ArrayList<>();
        for (Farmer farmer : list) {
            FarmerDTO dto = new FarmerDTO();
            BeanUtils.copyProperties(farmer, dto);
            dtos.add(dto);
        }
        return dtos;
    }
}