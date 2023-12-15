package com.example.person.service;

import com.example.person.model.User;
import com.example.person.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl() {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(Long id) {
        // You can add business logic here if needed
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User saveUser(User user) {
        // You can add business logic here if needed
        return userRepository.save(user);
    }
}
