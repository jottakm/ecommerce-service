package com.posgrado.ecommerce.controller;

import com.posgrado.ecommerce.dto.OrderDto;
import com.posgrado.ecommerce.service.OrderService;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
@AllArgsConstructor
public class OrderController {

  private OrderService orderService;

  @PostMapping
  private ResponseEntity<String> save(@RequestBody OrderDto dto) {
    String message = orderService.save(dto);
    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(message);
  }

  /*
  @GetMapping("/{id}/price/total")
  public String getTotalPrice (@PathVariable UUID id){
    //query nativa
    double total = orderRepository.getTotalPriceByOrderId(id.toString());
    //jpql
     double total2 = orderRepository.getTotalPrice(id);

     return "Query Nativa: " + total + "JQPL: " + total2;
  }*/

  @GetMapping("/{id}")
  public ResponseEntity<OrderDto> getById(@PathVariable UUID id) {
    OrderDto orderDto = orderService.getById(id);
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(orderDto);
  }

}
