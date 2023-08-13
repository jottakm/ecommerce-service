package com.posgrado.ecommerce.service;

import com.posgrado.ecommerce.dto.PageDto;
import com.posgrado.ecommerce.dto.ProductDto;
import com.posgrado.ecommerce.entity.Product;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {

  Product save(ProductDto product);

  Product getById(UUID id);

  Page<Product> getProduct(Pageable pageable);

  PageDto<Product> getProductsFiltered(Double minPrice, Double maxPrice, Pageable pageable);
}
