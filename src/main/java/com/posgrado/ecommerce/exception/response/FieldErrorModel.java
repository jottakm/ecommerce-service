package com.posgrado.ecommerce.exception.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class FieldErrorModel {

  private String field;
  private String message;
  private String code;

}
