package com.example.SoapAssignment.configuration;

import org.springframework.stereotype.Service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.jassignment.soap.entity.EmployeeRequest;
import com.jassignment.soap.entity.EmployeeResponse;

import jakarta.xml.bind.JAXBElement;

@Service
public class Client extends WebServiceGatewaySupport {
	
	private Properties properties;

	public Client(Properties properties) {
		super();
		this.properties = properties;
	}

    public String createEmployee(String employeeID) {
    	EmployeeRequest request = new EmployeeRequest();
        request.setEmployeeId(employeeID);
        EmployeeResponse response = (EmployeeResponse) getWebServiceTemplate().marshalSendAndReceive(request);
        return response.getEmployeeEmail();
    }
    
//    public void deleteEmployee(String employeeId) {
//        EmployeeRequest request = new EmployeeRequest();
//        request.setEmployeeId(employeeId);
//
//        try {
//            EmployeeResponse response = (EmployeeResponse) getWebServiceTemplate().marshalSendAndReceive(request);
//            if (response.isDeleted()) {
//                System.out.println("Employee with ID " + employeeId + " has been deleted successfully.");
//            } else {
//                System.out.println("Failed to delete employee with ID " + employeeId);
//            }
//        } catch (Exception e) {
//            System.out.println("Failed to delete employee with ID " + employeeId + ". Error: " + e.getMessage());
//        }
//    }
    
    public EmployeeResponse updateEmployee(double salary, String employeeID) {
    	EmployeeRequest request = new EmployeeRequest();
    	request.setEmployeeId(employeeID);

//        try {
//            
//            EmployeeResponse response = (EmployeeResponse) getWebServiceTemplate().marshalSendAndReceive(request);
//            if (response.updateSalary(salary)) {
//            	System.out.println("Employee's salary with ID " + employeeID + " has been changed.");
//            }
//            else {
//            	System.out.println("Failed to change salary of the employee");
//            }
//        } catch (Exception e) {
//        	System.out.println("Failed to change salary of the employee " + e.getMessage());
//        }
        
        @SuppressWarnings("unchecked")
		JAXBElement<EmployeeResponse> response = (JAXBElement<EmployeeResponse>) getWebServiceTemplate().marshalSendAndReceive(properties.getEndpointUrl(),request);
        
        return response.getValue();
        
    }
    
}

