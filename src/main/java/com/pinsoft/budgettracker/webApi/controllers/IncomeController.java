package com.pinsoft.budgettracker.webApi.controllers;


import com.pinsoft.budgettracker.business.abstracts.IncomeService;
import com.pinsoft.budgettracker.business.requests.CreateIncomeRequest;
import com.pinsoft.budgettracker.business.requests.UpdateIncomeRequest;
import com.pinsoft.budgettracker.business.responses.GetAllIncomesResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/incomes")
@AllArgsConstructor
public class IncomeController {
    private IncomeService incomeService;

    @GetMapping()
    public List<GetAllIncomesResponse> getAll(){
        return incomeService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateIncomeRequest createIncomeRequestt){
        this.incomeService.add(createIncomeRequestt);
    }

    @PutMapping
    public void update(@RequestBody()UpdateIncomeRequest updateIncomeRequest) {
        this.incomeService.update(updateIncomeRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.incomeService.delete(id);
    }
}
