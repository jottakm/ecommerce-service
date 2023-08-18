package com.posgrado.ecommerce.controller;

import com.posgrado.ecommerce.dto.EmailNotification;
import com.posgrado.ecommerce.dto.UserDto;
import com.posgrado.ecommerce.service.EmailService;
import com.posgrado.ecommerce.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
@AllArgsConstructor
public class AuthController {

  private RegistrationService registrationService;
  private EmailService emailService;

  @PostMapping("/register")
  public ResponseEntity<String> register(@RequestBody UserDto userDto) {
    String message = registrationService.register(userDto);
    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(message);
  }

  @PostMapping("/email")
  public String sendEmail() {
    EmailNotification email1 = EmailNotification.builder()
        .to("renederum@gmail.com")
        .subject("TEST")
        .body("Mensaje en texto plano")
        .hasTemplate(false)
        .build();

    EmailNotification email2 = EmailNotification.builder()
        .to("renederum@gmail.com")
        .subject("TEST CON TEMPLATE")
        .body("<h1>Contenido de email</h1>")
        .hasTemplate(true)
        .build();

    emailService.send(email1);
    emailService.send(email2);

    return "Messages sent successfully";

  }


  @GetMapping("/confirm")
  public ResponseEntity<String> confirm(@RequestParam String token) {
    String message = registrationService.confirm(token);
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(message);
  }


}
