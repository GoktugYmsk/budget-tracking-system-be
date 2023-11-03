package com.pinsoft.budgettracker.business.concretes;

import com.pinsoft.budgettracker.business.abstracts.IncomeService;
import com.pinsoft.budgettracker.business.requests.CreateIncomeRequest;
import com.pinsoft.budgettracker.business.requests.UpdateIncomeRequest;
import com.pinsoft.budgettracker.business.responses.GetAllIncomesResponse;
import com.pinsoft.budgettracker.core.utilities.mappers.ModelMapperService;
import com.pinsoft.budgettracker.dataAccess.abstracts.IncomeRepository;
import com.pinsoft.budgettracker.entities.concretes.Income;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class IncomeManager implements IncomeService {

    private IncomeRepository incomeRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllIncomesResponse> getAll() {
        List<Income> incomes = incomeRepository.findAll();

        List<GetAllIncomesResponse> incomesResponse = incomes.stream()
                .map(income -> this.modelMapperService.forResponse()
                        .map(income, GetAllIncomesResponse.class)).collect(Collectors.toList());
        return incomesResponse;
    }

    @Override
    public void add(CreateIncomeRequest createIncomeRequest) {
        Income income = this.modelMapperService.forRequest().map(createIncomeRequest, Income.class);
        this.incomeRepository.save(income);
    }

    @Override
    public void update(UpdateIncomeRequest updateIncomeRequest) {
        Income income = this.modelMapperService.forRequest().map(updateIncomeRequest, Income.class);
        this.incomeRepository.save(income);
    }

    @Override
    public void delete(int id) {
        this.incomeRepository.deleteById(id);
    }
}
