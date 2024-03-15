package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public String createEmployee(@RequestBody String employeeData) {
        return employeeService.createEmployee(employeeData);
    }
    
//    @DeleteMapping("/employees/{employeeId}")
//    public void deleteEmployee(@PathVariable String employeeId) {
//        employeeService.deleteEmployee(employeeId);
//    }
    
    @PutMapping("/employees/{employeeId}")
    public void updateEmployee(@PathVariable String employeeID, @PathVariable double salary) {
    	employeeService.updateEmployee(employeeID, salary);
    }
}