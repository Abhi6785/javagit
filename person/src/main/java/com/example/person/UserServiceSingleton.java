package com.example.person;

import com.example.person.repo.UserRepository;
import com.example.person.service.UserService;
import com.example.person.service.UserServiceImpl;

public enum UserServiceSingleton {
    INSTANCE;

    private final UserService userService;

    UserServiceSingleton() {
        this.userService = new UserServiceImpl();
    }

    public UserService getUserService() {
        return userService;
    }
}



