package com.pinsoft.budgettracker.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllExpensesResponse {
    private int id;
    private String expenseName;
    private long amount;
    private Date date;
}
