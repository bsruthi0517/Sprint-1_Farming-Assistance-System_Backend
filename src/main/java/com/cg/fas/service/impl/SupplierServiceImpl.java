package com.cg.fas.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

 

import org.springframework.beans.BeanUtils;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.fas.dto.LoginDto;
import com.cg.fas.dto.SupplierDto;
import com.cg.fas.entity.Login;
import com.cg.fas.entity.Supplier;
import com.cg.fas.exception.SupplierNotFoundException;
import com.cg.fas.repository.SupplierRepository;
import com.cg.fas.service.SupplierService;

 



 

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepository repository;
    @Override
    public LoginDto login(LoginDto loginDto) {
        Login login = new Login();
        BeanUtils.copyProperties(loginDto, login);
        repository.save(login);
        return loginDto;
    }

 

    @Override
    public SupplierDto addSupplier(SupplierDto supplierDto) {
        Supplier supplier = new Supplier();
        BeanUtils.copyProperties(supplierDto, supplier);
        repository.save(supplier);
        return supplierDto;
    }

 

    @Override
    public SupplierDto updateSupplier(SupplierDto supplierDto) {
        Supplier supplier = new Supplier();
        BeanUtils.copyProperties(supplierDto, supplier);
        repository.save(supplier);
        return supplierDto;

    }
    @Override
    public List<SupplierDto> viewAllSupplierDetails() {
        Iterable<Supplier> list = repository.findAll();
        List<SupplierDto> dtos = new ArrayList<>();
        for (Supplier supplier : list) {
            SupplierDto dto = new SupplierDto();
            BeanUtils.copyProperties(supplier, dto);
            dtos.add(dto);
        }
        return dtos;
    }

    @Override
    public SupplierDto getSupplierById(Long supplierId) {
        Optional<Supplier> supplier = repository.findById(supplierId);
        if (supplier.isPresent()) {
            SupplierDto dto = new SupplierDto();
            BeanUtils.copyProperties(supplier.get(), dto);
            return dto;
            }
        throw new SupplierNotFoundException("supplier with id" + supplierId + "doesn't exist");
    }

    @Override
    public Boolean deleteSupplier(SupplierDto supplierDto) {
        Supplier supplier = new Supplier();
        BeanUtils.copyProperties(supplierDto, supplier);
        repository.delete(supplier);
        return true;
    }
}
