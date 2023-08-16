package com.posgrado.ecommerce.repository;

import com.posgrado.ecommerce.entity.ConfirmationToken;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, UUID> {

}
