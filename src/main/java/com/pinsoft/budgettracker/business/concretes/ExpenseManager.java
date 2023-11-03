package com.pinsoft.budgettracker.business.concretes;

import com.pinsoft.budgettracker.business.abstracts.ExpenseService;
import com.pinsoft.budgettracker.business.requests.CreateExpenseRequest;
import com.pinsoft.budgettracker.business.requests.UpdateExpenseRequest;
import com.pinsoft.budgettracker.business.responses.GetAllExpensesResponse;
import com.pinsoft.budgettracker.core.utilities.mappers.ModelMapperService;
import com.pinsoft.budgettracker.dataAccess.abstracts.ExpenseRepository;
import com.pinsoft.budgettracker.entities.concretes.Expense;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ExpenseManager implements ExpenseService {

    private ExpenseRepository expenseRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllExpensesResponse> getAll() {
        List<Expense> expenses = expenseRepository.findAll();

        List<GetAllExpensesResponse> expensesResponse = expenses.stream()
                .map(expense -> this.modelMapperService.forResponse()
                        .map(expense, GetAllExpensesResponse.class)).collect(Collectors.toList());
        return expensesResponse;
    }

    @Override
    public void add(CreateExpenseRequest createExpenseRequest) {
        Expense expense = this.modelMapperService.forRequest().map(createExpenseRequest, Expense.class);
        this.expenseRepository.save(expense);
    }

    @Override
    public void update(UpdateExpenseRequest updateExpenseRequest) {
        Expense expense = this.modelMapperService.forRequest().map(updateExpenseRequest, Expense.class);
        this.expenseRepository.save(expense);
    }

    @Override
    public void delete(int id) {
        this.expenseRepository.deleteById(id);
    }
}
