package com.Business.Money.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document
public class Business {

  private String idBusiness;
  private String nameBusiness;
  private int yearsOfFoundation;
}
