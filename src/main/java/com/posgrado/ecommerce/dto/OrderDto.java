package com.posgrado.ecommerce.dto;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OrderDto {

  private String comment;
  List<OrderItemDto> items;

}
