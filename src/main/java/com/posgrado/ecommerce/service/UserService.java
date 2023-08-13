package com.posgrado.ecommerce.service;

import com.posgrado.ecommerce.dto.UserDto;
import java.util.UUID;

public interface UserService {

  UserDto getById(UUID id);

}
