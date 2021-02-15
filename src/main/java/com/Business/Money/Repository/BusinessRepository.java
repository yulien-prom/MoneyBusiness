package com.Business.Money.Repository;

import com.Business.Money.Model.Business;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepository extends MongoRepository<Business,String> {
}
