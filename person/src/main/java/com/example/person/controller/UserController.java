package com.example.person.controller;

import com.example.person.model.User;
import com.example.person.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/api/users")
    public class UserController {

        private final UserService userService;

        @Autowired
        public UserController(UserService userService) {
            this.userService = userService;
        }

        @GetMapping("/{id}")
        public User getUserById(@PathVariable Long id) {
            return userService.getUserById(id);
        }

        @PostMapping
        public User saveUser(@RequestBody User user) {
            return userService.saveUser(user);
        }
    }

