package com.posgrado.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Types;
import java.util.UUID;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;

@Entity
@Data
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue
  @JdbcTypeCode(Types.VARCHAR)
  private UUID id;
  @Column(
      name = "first_name",
      nullable = false,
      length = 25
  )
  private String firstName;
  @Column(
      name = "last_name",
      nullable = false,
      length = 25
  )
  private String lastName;
  @Column(
      name = "email",
      nullable = false,
      unique = true,
      length = 25
  )
  private String email;
  @Column(
      nullable = false
  )
  private String password;
  private String address;

  private Boolean enable = false;

  @ManyToOne
  @JoinColumn(name = "role_id")
  private Role role;

}
