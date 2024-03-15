package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import  com.example.SoapAssignment.configuration.Client;
import com.jassignment.soap.entity.EmployeeResponse;

@Repository
public class EmployeeRepository {

    @Autowired
    private Client client;

    public String createEmployee(String employeeData) {
        return client.createEmployee(employeeData);
    }
    
//    public void deleteClient(String clientId) {
//        client.deleteEmployee(clientId);
//    }
    
    public String updateEmp(String employeeId, double salary) {
    	EmployeeResponse employeeResponse;
    	employeeResponse = client.updateEmployee(salary, employeeId);
    	if (employeeResponse != null) {
    		return "Success";
    	}
    	else {
    		return "Fail";
    	}
    }
}