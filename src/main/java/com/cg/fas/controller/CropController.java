package com.cg.fas.controller;
import java.util.List;
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
import com.cg.fas.dto.CropDTO;
import com.cg.fas.service.CropService;
@RestController
@RequestMapping("/crop")
public class CropController {
	@Autowired
private CropService cropService;
	// http://localhost:9090/crop/addCrop
@PostMapping("/addCrop")
public CropDTO addCrop(@RequestBody CropDTO cropDTO) {
return cropService.addCrop(cropDTO);
}
// http://localhost:9090/crop/updateCrop
@PutMapping("/updateCrop")
public CropDTO updatecrop(@RequestBody CropDTO cropDTO) {
return cropService.updateCrop(cropDTO);
}
@DeleteMapping("/deleteCropById/{cropId}")
public ResponseEntity<Boolean> deleteCropById(@PathVariable Integer cropId) {
CropDTO cropDTO = cropService.getByCropId(cropId);
if (cropDTO != null) {
cropService.deleteCrop(cropDTO);
return new ResponseEntity<Boolean>(true, HttpStatus.ACCEPTED);
}
return null;
}
@GetMapping("/getAllCropDetails")
public ResponseEntity<List<CropDTO>> getAllCropDetails() {
List<CropDTO> list = cropService.viewAllCropDetails();
return ResponseEntity.ok(list);
}
@GetMapping("/getCropById/{cropId}")
public ResponseEntity<CropDTO> getCropById(@PathVariable int cropId) {
CropDTO cropDTO = cropService.getByCropId(cropId);
return new ResponseEntity<CropDTO>(cropDTO, HttpStatus.FOUND);
}
}