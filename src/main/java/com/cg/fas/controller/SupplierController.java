package com.cg.fas.controller;
import java.util.List;




import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fas.dto.LoginDto;
import com.cg.fas.dto.SupplierDto;
import com.cg.fas.exception.SupplierNotFoundException;
import com.cg.fas.service.SupplierService;

 



 

@RestController
@RequestMapping(name = "/supplier")
public class SupplierController {
	  @Autowired(required=false)
	    private SupplierService supplierService;

	    // http://localhost:8181/supplier/login
	    @PostMapping("/login")
	    public LoginDto login(@RequestBody LoginDto loginDto) {
	        return supplierService.login(loginDto);
	    }

	 

	    // http://localhost:8181/supplier/updateSupplier
	    @PutMapping("/updateSupplier")
	    public SupplierDto updateSupplier(@RequestBody SupplierDto supplierDto) {
	        return supplierService.updateSupplier(supplierDto);
	    }

	    // http://localhost:8181/supplier/addSupplier
	    @PostMapping("/addSupplier")
	    public SupplierDto addSupplier(@RequestBody SupplierDto supplierDto)
	    {
	        return supplierService.addSupplier(supplierDto);
	    }
	    // http://localhost:8181/supplier/getAllSupplierDetails
	    @GetMapping("/fetchAllValues")
	    public ResponseEntity<List<SupplierDto>> getAllSupplierDetails() {
	        List<SupplierDto> list = supplierService.viewAllSupplierDetails();
	        return ResponseEntity.ok(list);
	    }
	    // http://localhost:8181/supplier/getSupplierById
	    @GetMapping("/getSupplierById/{supplierId}")
	    public ResponseEntity<SupplierDto> getSupplierById(@PathVariable long supplierId) {
	        SupplierDto supplierDto = supplierService.getSupplierById(supplierId);
	        return new ResponseEntity<SupplierDto>(supplierDto, HttpStatus.FOUND);

	 

	    }

	    // http://localhost:8181/supplier/deleteSupplierById
	    @DeleteMapping("/deleteSupplierById/{supplierId}")
	        public ResponseEntity<Boolean> deleteSupplierById(@PathVariable Long supplierId) {
	        SupplierDto supplierDto = supplierService.getSupplierById(supplierId);
	        if (supplierDto != null) {
	           supplierService.deleteSupplier(supplierDto);
	            return new ResponseEntity<Boolean>(true, HttpStatus.ACCEPTED);
	        }
	        throw new SupplierNotFoundException("Supplier with id" + supplierId + "doesn't exist");

	 


	    }

	}
