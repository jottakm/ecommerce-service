package com.posgrado.ecommerce.controller;

import com.posgrado.ecommerce.dto.UserDto;
import com.posgrado.ecommerce.service.UserService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
@AllArgsConstructor
public class UserController {

  private UserService userService;

  @GetMapping("/{id}")
  @SecurityRequirement(name = "bearerAuth")
  public ResponseEntity<UserDto> getById(@PathVariable UUID id) {
    UserDto userFound = userService.getById(id);
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(userFound);
  }

}
