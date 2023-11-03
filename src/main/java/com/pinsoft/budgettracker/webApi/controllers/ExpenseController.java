package com.pinsoft.budgettracker.webApi.controllers;

import com.pinsoft.budgettracker.business.abstracts.ExpenseService;
import com.pinsoft.budgettracker.business.requests.CreateExpenseRequest;
import com.pinsoft.budgettracker.business.requests.UpdateExpenseRequest;
import com.pinsoft.budgettracker.business.responses.GetAllExpensesResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@AllArgsConstructor
public class ExpenseController {
    private ExpenseService expenseService;

    @GetMapping()
    public List<GetAllExpensesResponse> getAll(){
        return expenseService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateExpenseRequest createExpenseRequest){
        this.expenseService.add(createExpenseRequest);
    }

    @PutMapping
    public void update(@RequestBody() UpdateExpenseRequest updateExpenseRequest) {
        this.expenseService.update(updateExpenseRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.expenseService.delete(id);
    }
}
