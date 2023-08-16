package com.posgrado.ecommerce.service;

import com.posgrado.ecommerce.dto.OrderDto;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

  String save(OrderDto orderDto);

  OrderDto getById(UUID id);
}
