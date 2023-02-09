package com.cg.fas.service;
import java.util.List;



import org.springframework.stereotype.Service;

import com.cg.fas.dto.LoginDto;
import com.cg.fas.dto.SupplierDto;

 


 

@Service
public interface SupplierService {
	  public LoginDto login(LoginDto loginDto);

	    public SupplierDto addSupplier(SupplierDto supplierDto);

	    public SupplierDto updateSupplier(SupplierDto supplierDto);

	 

	    public List<SupplierDto> viewAllSupplierDetails();

	 

	    SupplierDto getSupplierById(Long supplierId);

	 

	    Boolean deleteSupplier(SupplierDto supplierDto);

	 

//	    public void deleteSupplier(SupplierDto supplierDto);

	 


	}
