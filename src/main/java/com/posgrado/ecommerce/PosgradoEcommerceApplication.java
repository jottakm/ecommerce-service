package com.posgrado.ecommerce;

import com.posgrado.ecommerce.entity.Category;
import com.posgrado.ecommerce.entity.Product;
import com.posgrado.ecommerce.entity.Role;
import com.posgrado.ecommerce.repository.CategoryRepository;
import com.posgrado.ecommerce.repository.ProductRepository;
import com.posgrado.ecommerce.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PosgradoEcommerceApplication {

  public static void main(String[] args) {
    SpringApplication.run(PosgradoEcommerceApplication.class, args);
  }

  @Bean
  public CommandLineRunner setData(
      CategoryRepository categoryRepository,
      ProductRepository productRepository,
      RoleRepository roleRepository
  ) {
    return arg -> {
      Category category = new Category();
      category.setName("TRAVEL");
      category.setDescription("Mochillas para viajar");

      Category category2 = new Category();
      category2.setName("SPORT");
      category2.setDescription("Mochillas para futbolistas");

      categoryRepository.save(category);
      categoryRepository.save(category2);

      Product product = new Product();
      product.setName("Producto Z");
      product.setDescription("Descripcion");
      product.setStock(100);
      product.setPrice(195.99);
      product.setImageUrl("http://image.png");
      product.setActive(true);
      product.setCategory(category2);

      productRepository.save(product);

      Role role = new Role();
      role.setName("USER");
      role.setDescription("This is a user");

      Role roleAdmin = new Role();
      roleAdmin.setName("ADMIN");
      roleAdmin.setDescription("This is a admin");

      roleRepository.save(role);
      roleRepository.save(roleAdmin);
    };
  }

}
