package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.SoapAssignment.configuration.Client;

@Configuration
public class ClientConfig {

    @Bean
    public Client client() {
        return new Client(null);
    }
}