package com.cg.fas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.fas.dto.CropDTO;

@Service
public interface CropService {
	public CropDTO addCrop(CropDTO cropDTO); 
	public CropDTO updateCrop(CropDTO cropDTO);
	public Boolean deleteCrop(CropDTO cropDTO);
	public List<CropDTO> viewAllCropDetails();
	public CropDTO getByCropId(Integer cropId);
}
