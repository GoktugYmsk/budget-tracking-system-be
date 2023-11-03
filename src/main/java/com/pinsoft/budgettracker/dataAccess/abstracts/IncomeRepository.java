package com.pinsoft.budgettracker.dataAccess.abstracts;

import com.pinsoft.budgettracker.entities.concretes.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Integer> {

}
