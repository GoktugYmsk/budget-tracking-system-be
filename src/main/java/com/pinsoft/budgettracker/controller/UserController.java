package com.pinsoft.budgettracker.controller;

import com.pinsoft.budgettracker.models.User;
import com.pinsoft.budgettracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private PasswordEncoder passwordEncoder;

  @GetMapping("/register")
  public String registrationForm() {
    return "registration";
  }

  @PostMapping("/register")
  public String processRegistration(User user) {
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    userRepository.save(user);
    return "redirect:/login";
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }
}
