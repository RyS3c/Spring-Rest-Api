package com.example.springboot_hibernate.controller;

import com.example.springboot_hibernate.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;

import static org.junit.jupiter.api.Assertions.*;

class CustomerControllerTest {

    @Autowired
    private CustomerService customerService;

    @Test
    void getCustomers() {
        CustomerController controller = new CustomerController();

        if (controller.getCustomers() != null){
            System.out.println("getAllController is working ");
        }else {
            System.out.println("error, getAllController return null.");
        }
    }
}