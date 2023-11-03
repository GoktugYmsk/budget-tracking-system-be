package com.pinsoft.budgettracker.business.abstracts;

import com.pinsoft.budgettracker.business.requests.CreateIncomeRequest;
import com.pinsoft.budgettracker.business.requests.UpdateIncomeRequest;
import com.pinsoft.budgettracker.business.responses.GetAllIncomesResponse;

import java.util.List;

public interface IncomeService {
    List<GetAllIncomesResponse> getAll();
    void add (CreateIncomeRequest createIncomeRequest);
    void update (UpdateIncomeRequest updateIncomeRequest);
    void delete (int id);

}
