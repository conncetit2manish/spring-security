package com.manish.service;

import com.manish.entity.Customers;
import com.manish.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl {

    @Autowired
    private CustomersRepository customersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void createCustomer(Customers customer) throws Exception {
        String hashedPassword = passwordEncoder.encode(customer.getPassword());
        customer.setPassword(hashedPassword);
        try {
            customersRepository.save(customer);
        } catch (Exception e) {
            throw new Exception("Excetption occured");
        }
    }
}
