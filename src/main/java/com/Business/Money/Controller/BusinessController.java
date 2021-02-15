package com.Business.Money.Controller;

import com.Business.Money.Model.Business;
import com.Business.Money.Service.Implementation.BusinessServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/$$$")
public class BusinessController {

    @Autowired
    BusinessServiceImplementation businessWServiceImplementation;

    @GetMapping
    public List<Business> getAllBusiness() {
        return businessWServiceImplementation.getAllBusiness();
    }

    @GetMapping ("/{idBusiness}")
    public Optional<Business> getBusinessById(@PathVariable String IdBusiness){
        return businessWServiceImplementation.getBusinessById(IdBusiness);
    }
    @PostMapping
    public String saveBusiness(@RequestBody Business businessP){
        return businessWServiceImplementation.saveBusiness(businessP);

    }

}
