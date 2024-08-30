package com.dhruv.SpringSecurityJWT.controller;

import com.dhruv.SpringSecurityJWT.model.User;
import com.dhruv.SpringSecurityJWT.service.JwtService;
import com.dhruv.SpringSecurityJWT.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private JwtService jwtService;

    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping("register")
    public User register(@RequestBody User user){
        return service.saveUser((user));
    }

    @PostMapping("login")
    public String login(@RequestBody User user){

        Authentication authentication=authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));

        if(authentication.isAuthenticated())
            return jwtService.generateToken(user.getUsername());
        else
            return "Login Failed";
    }

}
