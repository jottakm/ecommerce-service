package com.posgrado.ecommerce.service;

import com.posgrado.ecommerce.entity.ConfirmationToken;
import com.posgrado.ecommerce.repository.ConfirmationTokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConfirmationTokenServiceImpl implements ConfirmationTokenService {

  private ConfirmationTokenRepository confirmationTokenRepository;

  @Override
  public void save(ConfirmationToken confirmationToken) {
    confirmationTokenRepository.save(confirmationToken);
  }
}
