package com.posgrado.ecommerce.exception.response;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ValidationErrorResponse {

  private int code;
  private String error;
  private List<FieldErrorModel> errors;

}
