package com.cg.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fas.dto.ComplaintDtos;
import com.cg.fas.service.ComplaintService;

@RestController
@RequestMapping("/complaint")
public class ComplaintController {
	 @Autowired
	    private ComplaintService complaintService;

	 

	    // http://localhost:8585/complaint/addComplaint
	    @PostMapping("/addComplaint")
	    public ComplaintDtos addComplaint(@RequestBody ComplaintDtos complaintDtos) {
	        return complaintService.addComplaint(complaintDtos);
	    }

	 

	    // http://localhost:8585/complaint/deleteComplaint
	    @DeleteMapping("/deleteComplaint")
	    public Boolean deleteComplaint(@RequestBody ComplaintDtos complaintDtos) {
	        return complaintService.deleteComplaint(complaintDtos);
	    }

	 

	}
