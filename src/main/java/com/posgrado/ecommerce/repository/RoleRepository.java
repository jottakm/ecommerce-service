package com.posgrado.ecommerce.repository;

import com.posgrado.ecommerce.entity.Role;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, UUID> {
  /*
  @Query(
      value = "SELECT * FROM roles WHERE name = ?1",
      nativeQuery = true
  )
  Optional<Role> findRoleByName(String name);

  @Query(
      value = "SELECT r FROM Role r WHERE r.name = ?1"
  )
  Optional<Role> getRoleByName(String name);
  */

  Optional<Role> findByName(String name);
}
