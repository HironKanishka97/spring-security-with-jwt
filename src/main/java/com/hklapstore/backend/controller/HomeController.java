package com.hklapstore.backend.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/home/")
public class HomeController {

    @GetMapping("getAllHomeItems")
    public String getAllHomeItems(HttpServletRequest req) {
        return "success";
    }
}
