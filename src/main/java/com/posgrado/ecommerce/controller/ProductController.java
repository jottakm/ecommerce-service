package com.posgrado.ecommerce.controller;

import com.posgrado.ecommerce.dto.ProductDto;
import com.posgrado.ecommerce.entity.Product;
import com.posgrado.ecommerce.service.ProductService;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("products")
public class ProductController {

  private ProductService productService;

  @PostMapping
  public ResponseEntity<Product> save(@RequestBody ProductDto dto) {
    Product productSaved = productService.save(dto);
    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(productSaved);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Product> getById(@PathVariable UUID id) {
    Product productFound = productService.getById(id);
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(productFound);
  }

  @GetMapping("/pageable")
  public ResponseEntity<Page<Product>> getProductsPageable(@RequestParam int page, @RequestParam int size) {
    Pageable pageable = PageRequest.of(page, size);
    Page<Product> productPage = productService.getProduct(pageable);
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(productPage);

  }

  @GetMapping
  public ResponseEntity<Page<Product>> getProductsFiltered(
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "20") int size,
      @RequestParam(required = false) Double minPrice,
      @RequestParam(required = false) Double maxPrice,
      @RequestParam(defaultValue = "id") String sortField,
      @RequestParam(defaultValue = "asc") String sortOrder
  ) {

    if(minPrice == null) {
      minPrice = Double.MIN_VALUE;
    }

    if(maxPrice == null) {
      maxPrice = Double.MAX_VALUE;
    }

    Sort sort = Sort.by(Sort.Direction.fromString(sortOrder), sortField);
    Pageable pageable = PageRequest.of(page, size, sort);

    Page<Product> productPage = productService.getProductsFiltered(minPrice, maxPrice, pageable);
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(productPage);

  }

}
