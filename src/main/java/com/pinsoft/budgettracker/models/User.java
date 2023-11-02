package com.pinsoft.budgettracker.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("user")
public class User {
  @Id
  private Integer id;
  @Column("username")
  private  String username;

  @Column("password")
  private  String password;
}
