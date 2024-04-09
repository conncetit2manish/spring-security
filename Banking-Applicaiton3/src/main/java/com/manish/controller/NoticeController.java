package com.manish.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notice/")
public class NoticeController {

    @GetMapping("getnotice")
    public String getnotice() {
        return "get notice executed ";
    }
}
