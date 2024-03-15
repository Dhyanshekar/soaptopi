package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String createEmployee(String employeeData) {
        return employeeRepository.createEmployee(employeeData);
    }
//    public void deleteEmployee(String employeeId) {
//        employeeRepository.deleteClient(employeeId);
//    }
//    
    public void updateEmployee(String employeeId, double salary) {
    	employeeRepository.updateEmp(employeeId, salary);
    }
}
