package com.cg.fas.service;
import java.util.List;



import org.springframework.stereotype.Service;

 

import com.cg.fas.dto.SupplierAdvertisementDTO;

 

@Service
public interface SupplierAdvertisementService {
	public SupplierAdvertisementDTO addAdvertisement(SupplierAdvertisementDTO supplierAdvertisementDTO);

    public SupplierAdvertisementDTO updateAdvertisement(SupplierAdvertisementDTO supplierAdvertisementDTO);

 

    public List<SupplierAdvertisementDTO> viewAllAdvertisementDetails();

 


    SupplierAdvertisementDTO getByAdvertisementId(Integer Id);

 


    Boolean deleteAdvertisement(SupplierAdvertisementDTO supplierAdvertisementDTO);
}
