package com.cg.fas.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fas.dto.ComplaintDtos;
import com.cg.fas.entity.Complaint;
import com.cg.fas.repository.ComplaintRepository;
import com.cg.fas.service.ComplaintService;
 

@Service
public class ComplaintServiceImpl implements ComplaintService {

 

    @Autowired
    private ComplaintRepository repository;

 

    @Override
    public ComplaintDtos addComplaint(ComplaintDtos complaintDtos) {
        Complaint complaint = new Complaint();
        BeanUtils.copyProperties(complaintDtos, complaint);
        repository.save(complaint);
        return complaintDtos;
    }

    @Override
    public Boolean deleteComplaint(ComplaintDtos complaintDtos) {

 

        Complaint complaint = new Complaint();
        BeanUtils.copyProperties(complaintDtos, complaint);
        repository.delete(complaint);
        return true;
    }

 

}
