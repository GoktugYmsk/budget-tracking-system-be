package com.pinsoft.budgettracker;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BudgetTracker {
  public static void main(String[] args){
    SpringApplication.run(BudgetTracker.class,args);
  }
  @Bean
  public ModelMapper getModelMapper (){
    return new ModelMapper();
  }
}
