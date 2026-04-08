package com.authentication.authentication_system.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.authentication.authentication_system.entity.User;
import com.authentication.authentication_system.service.UserService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/signup")
    public String signup(@RequestBody User user) {
        service.saveUser(user);
        return "User registered successfully";
    }
}