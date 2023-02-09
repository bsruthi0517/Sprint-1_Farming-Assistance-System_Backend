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

 

import com.cg.fas.dto.FarmerDTO;
import com.cg.fas.exception.FarmerNotFoundException;
import com.cg.fas.service.FarmerService;

 

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/farmer")
public class FarmerController {
    @Autowired
    private FarmerService farmerService;

 

    @PostMapping("/addfarmer")
    public ResponseEntity<FarmerDTO> saveFarmer(@RequestBody FarmerDTO farmerDTO) {

 

        FarmerDTO farmer = farmerService.saveFarmer(farmerDTO);
        return ResponseEntity.ok(farmer);

 

    }

 

    @GetMapping("/fetchByfarmerId/{farmerId}")
    public ResponseEntity<FarmerDTO> getFarmerById(@PathVariable int farmerId) {
        FarmerDTO FarmerDTO = farmerService.getByFarmerId(farmerId);
        return new ResponseEntity<FarmerDTO>(FarmerDTO, HttpStatus.FOUND);

 

    }

 

    @PutMapping("/updateFarmer")
    public ResponseEntity<FarmerDTO> updateFarmer(@RequestBody FarmerDTO farmerDTO) {

 

        FarmerDTO farmer = farmerService.updateFarmer(farmerDTO);
        return ResponseEntity.ok(farmer);
    }

 

    @DeleteMapping("/deleteByFarmertId/{farmerId}")
    public ResponseEntity<Boolean> deleteFarmerById(@PathVariable Integer farmerId) {
        FarmerDTO FarmerDTO = farmerService.getByFarmerId(farmerId);
        if (FarmerDTO != null) {
            farmerService.deleteFarmer(FarmerDTO);
            return new ResponseEntity<Boolean>(true, HttpStatus.ACCEPTED);
        }
        throw new FarmerNotFoundException("Payment with id" + farmerId + "doesn't exist");

 

    }

 

    @GetMapping("/fetchAllValues")
    public ResponseEntity<List<FarmerDTO>> getAllFarmerDetails() {
        List<FarmerDTO> list = farmerService.viewAllFarmerDetails();
        return ResponseEntity.ok(list);
    }

 

}