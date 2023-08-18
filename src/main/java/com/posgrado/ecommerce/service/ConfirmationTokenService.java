package com.posgrado.ecommerce.service;

import com.posgrado.ecommerce.entity.ConfirmationToken;

public interface ConfirmationTokenService {

  void save(ConfirmationToken confirmationToken);

  ConfirmationToken getByToken(String token);

  void setConfirmedAt(ConfirmationToken confirmationToken);

}
