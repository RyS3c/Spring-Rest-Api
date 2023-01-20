package com.example.springboot_hibernate.service;

import com.example.springboot_hibernate.dto.CustomerData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    CustomerData saveCustomer(CustomerData customer);

    boolean deleteCustomer(Long customerId);

    List<CustomerData> getAllCustomers();

    List<CustomerData> getCustomerById(Long customerId);
}
