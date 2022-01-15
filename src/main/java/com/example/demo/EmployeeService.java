package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    // Dependency Injection
    @Autowired
    private DatabaseRepository databaseRepository;  // Employees Info Database
    @Autowired
    private PerformanceRepository performanceRepository; // Employees Performance

    // Display All Employee Performances
    public List<Performance> displayEmployeesPerformances(Integer id) {
            List<Performance> performances = new ArrayList<>();
            performanceRepository.findAll().forEach(performances::add);
            return performances;
        }
}

