package com.posgrado.ecommerce.exception;

import com.posgrado.ecommerce.exception.response.ErrorResponse;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {


  @ExceptionHandler(EntityNotFoundException.class)
  public ResponseEntity<ErrorResponse> handleEntityNotFoundException(Exception ex) {
    HttpStatus status = HttpStatus.NOT_FOUND;
    ErrorResponse error = ErrorResponse.builder()
        .code(status.value())
        .error(status.name())
        .message(ex.getMessage())
        .build();
    return ResponseEntity
        .status(status)
        .body(error);
  }

  @ExceptionHandler(EmailAlreadyTaken.class)
  public ResponseEntity<ErrorResponse> handleEmailAlreadyTaken(Exception ex) {
    HttpStatus status = HttpStatus.CONFLICT;
    ErrorResponse error = ErrorResponse.builder()
        .code(status.value())
        .error(status.name())
        .message(ex.getMessage())
        .build();
    return ResponseEntity
        .status(status)
        .body(error);
  }

}
