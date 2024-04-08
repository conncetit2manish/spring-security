package com.manish.service;

import com.manish.entity.Customers;
import com.manish.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl {

    @Autowired
    CustomersRepository customersRepository;

    public void createCustomer(Customers customer) throws Exception {
        try {
            customersRepository.save(customer);
        } catch (Exception e) {
            throw new Exception("Excetption occured");
        }
    }
}
