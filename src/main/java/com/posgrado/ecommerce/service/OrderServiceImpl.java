package com.posgrado.ecommerce.service;

import com.posgrado.ecommerce.dto.OrderDto;
import com.posgrado.ecommerce.entity.Order;
import com.posgrado.ecommerce.entity.OrderItem;
import com.posgrado.ecommerce.repository.OrderRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

  private OrderRepository orderRepository;
  private ProductService productService;

  @Override
  public String save(OrderDto orderDto) {

    Order order = new Order();
    order.setComment(orderDto.getComment());

    List<OrderItem> items = orderDto.getItems().stream().map(item -> {
      OrderItem orderItem = new OrderItem();
      orderItem.setOrder(order);
      orderItem.setQuantity(item.getQuantity());
      orderItem.setProduct(productService.getById(item.getProductId()));
      return orderItem;
    }).toList();

    order.setItems(items);

    orderRepository.save(order);
    return "Order saved successfully";
  }
}
