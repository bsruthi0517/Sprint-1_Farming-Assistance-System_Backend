package com.cg.fas.controller;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

import com.cg.fas.dto.SupplierAdvertisementDTO;
import com.cg.fas.exception.SupplierAdvertisementNotFoundException;
import com.cg.fas.service.SupplierAdvertisementService;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/supplierAdvertisement")
public class SupplierAdvertisementController {
	  @Autowired
	    private SupplierAdvertisementService supplierAdvertisementService;

	    // http://localhost:8080/supplierAdvertisement/addAdvertisement
	    @PostMapping("/addAdvertisement")
	    public SupplierAdvertisementDTO addAdvertisement(SupplierAdvertisementDTO supplierAdvertisementDTO)
	    {
	        return supplierAdvertisementService.addAdvertisement(supplierAdvertisementDTO);
	    }

	    // http://localhost:8080/supplierAdvertisement/updateAdvertisement
	    @PutMapping("/updateAdvertisement")
	    public ResponseEntity<SupplierAdvertisementDTO> updateAdvertisement(@RequestBody SupplierAdvertisementDTO SupplierAdvertisementDTO) {

	 

	 

	        SupplierAdvertisementDTO advertisement = supplierAdvertisementService.updateAdvertisement(SupplierAdvertisementDTO);
	        return ResponseEntity.ok(advertisement);
	    }

	    // http://localhost:8080/supplierAdvertisement/deleteByAdvertisementId
	    @DeleteMapping("/deleteByAdvertisementId/{supplierAdvertisementId}")
	    public ResponseEntity<Boolean> deleteByAdvertisementId(@PathVariable Integer supplierAdvertisementId) {
	        SupplierAdvertisementDTO supplierAdvertisementDTO = supplierAdvertisementService.getByAdvertisementId(supplierAdvertisementId);
	        if (supplierAdvertisementDTO != null) {
	            supplierAdvertisementService.deleteAdvertisement(supplierAdvertisementDTO);
	            return new ResponseEntity<Boolean>(true, HttpStatus.ACCEPTED);
	        }
	        throw new SupplierAdvertisementNotFoundException("SupplierAdvertisement with id" + supplierAdvertisementId + "doesn't exist");
	    }

	 

	         
	         @GetMapping("/fetchByAdvertisementId/{Id}")
	         public ResponseEntity<SupplierAdvertisementDTO> getByAdvertisementId(@PathVariable int Id) {
	             SupplierAdvertisementDTO SupplierAdvertisementDTO = supplierAdvertisementService.getByAdvertisementId(Id);
	             return new ResponseEntity<SupplierAdvertisementDTO>(SupplierAdvertisementDTO, HttpStatus.FOUND);

	 

	         }
	      // http://localhost:8080/supplierAdvertisement/fetchAllValues
	         @GetMapping("/fetchAllValues")
	         public ResponseEntity<List<SupplierAdvertisementDTO>> getAllAdvertisementDetails() {
	             List<SupplierAdvertisementDTO> list = supplierAdvertisementService.viewAllAdvertisementDetails();
	             return ResponseEntity.ok(list);
	         }
	}
