package com.example.service.general;

import com.example.model.Vacancy;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class VacancyFilter {
    
    public List<Vacancy> filterBySalary(List<Vacancy> vacancies) {
        return vacancies.stream()
                .filter(v -> v.getSalaryFrom() != null || v.getSalaryTo() != null)
                .collect(Collectors.toList());
    }
}