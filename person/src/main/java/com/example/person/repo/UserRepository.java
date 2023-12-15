package com.example.person.repo;

import com.example.person.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
    public interface UserRepository extends CrudRepository<User,Long> {
        Optional<User> findById(Long id);
        User save(User user);
    }

