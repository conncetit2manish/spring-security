package com.manish.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact/")
public class ContactController {

    @GetMapping("getcontact")
    public String getContact() {
        return "get contact";
    }
}
