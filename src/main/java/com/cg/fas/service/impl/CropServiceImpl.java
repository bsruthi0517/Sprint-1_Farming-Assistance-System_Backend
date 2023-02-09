package com.cg.fas.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fas.dto.CropDTO;
import com.cg.fas.entity.Crop;
import com.cg.fas.repository.CropRepository;
import com.cg.fas.service.CropService;

@Service

public class CropServiceImpl  implements CropService{
	@Autowired
	private CropRepository repository;
	@Override
	public CropDTO addCrop(CropDTO cropDTO) {
	Crop crop = new Crop();
	BeanUtils.copyProperties(cropDTO, crop);
	repository.save(crop);
	return cropDTO;
}
	@Override
	public CropDTO updateCrop(CropDTO cropDTO) {
	Crop crop = new Crop();
	BeanUtils.copyProperties(cropDTO, crop);
	repository.save(crop);
	return cropDTO;
}
	@Override
	public Boolean deleteCrop(CropDTO cropDTO) {
	Crop crop = new Crop();
	BeanUtils.copyProperties(cropDTO, crop);
	repository.delete(crop);
	return true;
}

	@Override
	 public List<CropDTO> viewAllCropDetails() {
	 Iterable<Crop> list = repository.findAll();
	 List<CropDTO> dtos = new ArrayList<>();
	 for (Crop crop : list) {
	 CropDTO dto = new CropDTO();
	 BeanUtils.copyProperties(crop, dto);
	 dtos.add(dto);
	 }
	 return dtos;
}
	@Override
	public CropDTO getByCropId(Integer cropId) {
		// TODO Auto-generated method stub
		return null;
	}
}
