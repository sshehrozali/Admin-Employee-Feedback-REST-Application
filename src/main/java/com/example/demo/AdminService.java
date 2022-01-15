package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    // Dependency Injection
    @Autowired
    private DatabaseRepository databaseRepository;  // Employees Info Database
    @Autowired
    private PerformanceRepository performanceRepository; // Employees Performance

    // ALL GET METHODS //
    // All Employee Data
    public List<Data> viewAllData() {
        List<Data> data = new ArrayList<>();
        databaseRepository.findAll().forEach(data::add);
        return data;
    }
    // Specific Employee Data
    public Optional<Data> viewSpecificData(Integer id) {
        return databaseRepository.findById(id);
    }
    // Show All Performances
    public List<Performance> showAllPerformances() {
        List<Performance> performances = new ArrayList<>();
        performanceRepository.findAll().forEach(performances::add);
        return performances;
    }

    // ALL POST METHODS //
    // Creates a new Employee
    public void createEmployee(Data data) {
        databaseRepository.save(data);
    }
    // Sets New Performance for the Employee
    public void addEmployeePerformance(Integer id, Performance performance) {
        performanceRepository.save(performance);
    }

    // ALL PUT METHODS //
    // Updates Employee Data
    public void updateEmployee(Integer id, Data data) {
        databaseRepository.save(data);
    }
    // Updates Employee Performance
    public void updateEmployeePerformance(Integer id, Performance performance) {
        addEmployeePerformance(id, performance);    // Use the same above function to update Employee's Performance (Re-Usability)
    }

    // ALL DELETE METHODS //
    // Deletes Employee Data
    public void deleteEmployee(Integer id) {
        databaseRepository.deleteById(id);
    }
}
