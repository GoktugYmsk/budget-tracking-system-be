package com.pinsoft.budgettracker.repository;

import com.pinsoft.budgettracker.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
  User findByUsername(String username);
}
