package com.example.SoapAssignment.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import com.jassignment.soap.entity.EmployeeRequest;


@Configuration
public class Config {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.jassignment.soap.entity");
        return marshaller;
    }

    @Bean
    public Client employeeServiceClient(Jaxb2Marshaller marshaller, Properties properties) {
        Client client = new Client(properties);
        client.setDefaultUri(properties.getEndpointUrl());
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}

