package com.dhruv.SpringSecurity.service;

import com.dhruv.SpringSecurity.model.User;
import com.dhruv.SpringSecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;


    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);




    public User saveUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return repo.save(user);
    }

    public List<User> getUsers() {
        return repo.findAll();
    }
}
