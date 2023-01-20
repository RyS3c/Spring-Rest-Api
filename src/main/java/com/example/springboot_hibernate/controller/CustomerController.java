package com.example.springboot_hibernate.controller;

import com.example.springboot_hibernate.dto.CustomerData;
import com.example.springboot_hibernate.service.CustomerService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Resource(name = "customerService")
    private CustomerService customerService;


    //get all resources from database
    @GetMapping
    public List<CustomerData> getCustomers() {
        return customerService.getAllCustomers();
    }


    //get all resources from databases by id
    @GetMapping("/customer/{id}")
    public CustomerData getCustomer(@PathVariable Long id) {
        return (CustomerData) customerService.getCustomerById(id);
    }

    //create new data and post to the database
    @PostMapping("/customer")
    public CustomerData saveCustomer(final @RequestBody CustomerData customerData) {
        return customerService.saveCustomer(customerData);
    }


    //delete resources from database by id
    @DeleteMapping("/customer/{id}")
    public Boolean deleteCustomer(@PathVariable Long id) {
        return customerService.deleteCustomer(id);
    }
}
