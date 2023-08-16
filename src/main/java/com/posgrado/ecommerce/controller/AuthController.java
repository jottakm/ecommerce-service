package com.posgrado.ecommerce.controller;

import com.posgrado.ecommerce.dto.UserDto;
import com.posgrado.ecommerce.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
@AllArgsConstructor
public class AuthController {

  private RegistrationService registrationService;

  @PostMapping("/register")
  public ResponseEntity<String> register(@RequestBody UserDto userDto) {
    String message = registrationService.register(userDto);
    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(message);
  }

}
