package com.manish.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan/")
public class LoanController {

    @GetMapping("getloan")
    public String getLoan() {
        return "get loan executed";
    }
}
