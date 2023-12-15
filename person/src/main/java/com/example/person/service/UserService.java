package com.example.person.service;

import com.example.person.model.User;

    public interface UserService {
        User getUserById(Long id);
        User saveUser(User user);
    }

