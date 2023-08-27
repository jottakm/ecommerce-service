package com.posgrado.ecommerce.controller;

import com.posgrado.ecommerce.entity.Role;
import com.posgrado.ecommerce.service.RoleService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("roles")
public class RoleController {

  private RoleService roleService;

  @GetMapping("/name/{name}")
  @SecurityRequirement(name = "bearerAuth")
  public ResponseEntity<Role> getByName(@PathVariable String name) {
    Role roleFound = roleService.getByName(name);
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(roleFound);
  }

}
