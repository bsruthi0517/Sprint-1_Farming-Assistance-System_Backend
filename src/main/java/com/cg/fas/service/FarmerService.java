package com.cg.fas.service;

 

import java.util.List;

 

import com.cg.fas.dto.FarmerDTO;

 


public interface FarmerService {

     public FarmerDTO saveFarmer(FarmerDTO farmerDTO);

        public FarmerDTO updateFarmer(FarmerDTO farmerDTO);

        public boolean deleteFarmer(FarmerDTO farmerDTO);

        public FarmerDTO getByFarmerId(Integer FarmerId);

        public List<FarmerDTO> viewAllFarmerDetails();

}