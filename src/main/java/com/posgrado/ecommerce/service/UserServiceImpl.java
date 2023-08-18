package com.posgrado.ecommerce.service;

import com.posgrado.ecommerce.dto.UserDto;
import com.posgrado.ecommerce.entity.User;
import com.posgrado.ecommerce.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  @Override
  public UserDto getById(UUID id) {
    User user = userRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("User not found"));

    UserDto userDto = new UserDto();
    userDto.setId(user.getId());
    userDto.setFirstName(user.getFirstName());
    userDto.setLastName(user.getLastName());
    userDto.setAddress(user.getAddress());
    userDto.setEmail(user.getEmail());
    userDto.setRoleName(user.getRole().getName());
    return userDto;
  }

  @Override
  public boolean existByEmail(String email) {
    return userRepository.existsByEmail(email);
  }

  @Override
  public User save(User user) {
    return userRepository.save(user);
  }

  @Override
  public void enableUser(User user) {
    user.setEnable(true);
    userRepository.save(user);
  }
}
