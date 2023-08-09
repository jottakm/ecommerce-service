package com.posgrado.ecommerce.service;

import com.posgrado.ecommerce.dto.ProductDto;
import com.posgrado.ecommerce.entity.Category;
import com.posgrado.ecommerce.entity.Product;
import com.posgrado.ecommerce.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

  private ProductRepository productRepository;
  private CategoryService categoryService;

  @Override
  public Product save(ProductDto dto) {
    Category category = categoryService.getById(dto.getCategoryId());

    Product product = new Product();
    product.setName(dto.getName());
    product.setDescription(dto.getDescription());
    product.setPrice(dto.getPrice());
    product.setStock(dto.getStock());
    product.setActive(dto.isActive());
    product.setImageUrl(dto.getImageUrl());
    product.setCategory(category);

    return productRepository.save(product);
  }

  @Override
  public Product getById(UUID id) {
    return productRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Product not found"));
  }

  @Override
  public Page<Product> getProduct(Pageable pageable) {
    return productRepository.findAll(pageable);
  }

  @Override
  public Page<Product> getProductsFiltered(Double minPrice, Double maxPrice, Pageable pageable) {
    return productRepository.findByPriceBetween(minPrice, maxPrice, pageable);
  }

}
