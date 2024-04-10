package com.manish.controller;

import com.manish.entity.Customers;
import com.manish.repository.CustomersRepository;
import com.manish.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;

    @PostMapping("register")
    public ResponseEntity<String> register(@RequestBody Customers customer) throws Exception {
         loginService.createCustomer(customer);
         return new ResponseEntity<>("User successfully registered ", HttpStatus.CREATED);
    }
}
