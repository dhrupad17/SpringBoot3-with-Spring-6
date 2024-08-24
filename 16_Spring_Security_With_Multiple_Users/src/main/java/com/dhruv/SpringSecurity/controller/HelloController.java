package com.dhruv.SpringSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greet(HttpServletRequest request){
        return "Hello World "+request.getSession().getId();
    }

    @GetMapping("/")
    public String home(HttpServletRequest request){
        return "Welcome to Spring Security Module "+request.getSession().getId();
    }
}
