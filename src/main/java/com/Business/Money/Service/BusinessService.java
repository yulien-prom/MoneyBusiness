package com.Business.Money.Service;

import com.Business.Money.Model.Business;

import java.util.List;
import java.util.Optional;

public interface BusinessService {

    List<Business> getAllBusiness();

     Optional<Business> getBusinessById(String idBusiness);

     String saveBusiness(Business businessP);


}
