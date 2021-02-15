package com.Business.Money.Service.Implementation;

import com.Business.Money.Model.Business;
import com.Business.Money.Repository.BusinessRepository;
import com.Business.Money.Service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessServiceImplementation implements BusinessService {

    @Autowired
    BusinessRepository BusinessLRepository;

    @Override
    public List<Business> getAllBusiness() {
        return BusinessLRepository.findAll();
    }

    @Override
    public Optional<Business> getBusinessById(String idBusiness) {
        return BusinessLRepository.findById(idBusiness);
    }

    @Override
    public String saveBusiness(Business businessP) {
        BusinessLRepository.save(businessP);
        return "Business saved";
    }
}
