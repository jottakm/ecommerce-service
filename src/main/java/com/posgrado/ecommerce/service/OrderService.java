package com.posgrado.ecommerce.service;

import com.posgrado.ecommerce.dto.OrderDto;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

  String save(OrderDto orderDto);
}
