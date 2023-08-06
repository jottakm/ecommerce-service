package com.posgrado.ecommerce.service;

import com.posgrado.ecommerce.dto.ProductDto;
import com.posgrado.ecommerce.entity.Product;
import java.util.UUID;

public interface ProductService {

  Product save(ProductDto product);

  Product getById(UUID id);
}
