package com.pinsoft.budgettracker.business.abstracts;

import com.pinsoft.budgettracker.business.requests.CreateExpenseRequest;
import com.pinsoft.budgettracker.business.requests.UpdateExpenseRequest;
import com.pinsoft.budgettracker.business.responses.GetAllExpensesResponse;

import java.util.List;

public interface ExpenseService {
    List<GetAllExpensesResponse> getAll();
    void add (CreateExpenseRequest createExpenseRequest);
    void update (UpdateExpenseRequest updateExpenseRequest);
    void delete (int id);

}
