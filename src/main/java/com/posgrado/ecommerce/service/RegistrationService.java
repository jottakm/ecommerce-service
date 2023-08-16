package com.posgrado.ecommerce.service;

import com.posgrado.ecommerce.dto.UserDto;
import com.posgrado.ecommerce.entity.ConfirmationToken;
import com.posgrado.ecommerce.entity.User;
import com.posgrado.ecommerce.exception.EmailAlreadyTaken;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

  private UserService userService;
  private ConfirmationTokenService confirmationTokenService;

  public String register(UserDto userDto) {
    boolean existsEmail = userService.existByEmail(userDto.getEmail());
    if (existsEmail) {
      throw new EmailAlreadyTaken(userDto.getEmail());
    }
    // TODO: Encrypt password
    User user = new User();
    user.setFirstName(userDto.getFirstName());
    user.setLastName(userDto.getLastName());
    user.setAddress(userDto.getAddress());
    user.setEmail(userDto.getEmail());
    user.setPassword(userDto.getPassword());

    User userSaved = userService.save(user);

    String token = UUID.randomUUID().toString();
    confirmationTokenService.save(
        new ConfirmationToken(
            token,
            LocalDateTime.now().plusMinutes(15),
            userSaved
        ));
    // TODO: Send email with confirmation token
    return "User registered successfully with id: " + userSaved.getId();
  }

}
