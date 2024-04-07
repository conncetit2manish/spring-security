package com.manish.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/balance/")
public class BalanceController {

    @GetMapping("getbalance")
    public String getBalance() {
        return "balance";
    }
}
