package com.authentication.authentication_system.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authentication.authentication_system.entity.User;
import com.authentication.authentication_system.repository.UserRepository;


@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User saveUser(User user) {
        return repo.save(user);
    }
}