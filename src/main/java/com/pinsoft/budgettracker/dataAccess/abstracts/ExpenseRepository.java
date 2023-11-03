package com.pinsoft.budgettracker.dataAccess.abstracts;

import com.pinsoft.budgettracker.entities.concretes.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

}
