package com.hichem.springpostgresdocker.controllers;

import com.hichem.springpostgresdocker.models.Customer;
import com.hichem.springpostgresdocker.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@AllArgsConstructor
public class CustomerController {
    private CustomerRepository customerRepository;

    @GetMapping("/")
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
