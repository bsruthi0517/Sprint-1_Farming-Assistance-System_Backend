package com.cg.fas.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

 

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

import com.cg.fas.dto.SupplierAdvertisementDTO;
import com.cg.fas.entity.SupplierAdvertisement;
import com.cg.fas.exception.SupplierAdvertisementNotFoundException;
import com.cg.fas.repository.SupplierAdvertisementRepository;
import com.cg.fas.service.SupplierAdvertisementService;

 

@Service
public class SupplierAdvertisementServiceImpl  implements SupplierAdvertisementService  {

 

    @Autowired
    private SupplierAdvertisementRepository repository;

        @Override
        public SupplierAdvertisementDTO addAdvertisement(SupplierAdvertisementDTO supplierAdvertisementDTO) {

            SupplierAdvertisement supplierAdvertisement = new SupplierAdvertisement();
            BeanUtils.copyProperties(supplierAdvertisementDTO, supplierAdvertisement);
            repository.save(supplierAdvertisement);
            return supplierAdvertisementDTO;
        }

 

        @Override
        public SupplierAdvertisementDTO updateAdvertisement(SupplierAdvertisementDTO supplierAdvertisementDTO) {
            SupplierAdvertisement supplierAdvertisement = new SupplierAdvertisement();
            BeanUtils.copyProperties(supplierAdvertisementDTO, supplierAdvertisement);
            repository.save(supplierAdvertisement);
            return supplierAdvertisementDTO;

        }

 

        @Override
        public Boolean deleteAdvertisement(SupplierAdvertisementDTO supplierAdvertisementDTO) {
            SupplierAdvertisement supplierAdvertisement = new SupplierAdvertisement();
            BeanUtils.copyProperties(supplierAdvertisementDTO, supplierAdvertisement);
            repository.delete(supplierAdvertisement);
            return true;

        }

 

        @Override
        public SupplierAdvertisementDTO getByAdvertisementId(Integer Id) {
            Optional<SupplierAdvertisement> advertisement = repository.findById(Id);
            if (advertisement.isPresent()) {
                SupplierAdvertisementDTO dto = new SupplierAdvertisementDTO();
                BeanUtils.copyProperties(advertisement.get(), dto);
                return dto;
                }
            throw new SupplierAdvertisementNotFoundException("Payment with id" + Id + "doesn't exist");
        }

 

            @Override
            public List<SupplierAdvertisementDTO> viewAllAdvertisementDetails() {
                Iterable<SupplierAdvertisement> list = repository.findAll();
                List<SupplierAdvertisementDTO> dtos = new ArrayList<>();
                for (SupplierAdvertisement advertisement : list) {
                    SupplierAdvertisementDTO dto = new SupplierAdvertisementDTO();
                    BeanUtils.copyProperties(advertisement, dto);
                    dtos.add(dto);
                }
                return dtos;
            }
}
