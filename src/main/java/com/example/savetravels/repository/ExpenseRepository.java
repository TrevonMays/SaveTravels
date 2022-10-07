package com.example.savetravels.repository;

import com.example.savetravels.models.Expense;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExpenseRepository extends CrudRepository <Expense, Long>{
    List<Expense> findAll();
}
