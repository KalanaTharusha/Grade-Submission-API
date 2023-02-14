package com.example.gradesubmissionapi.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

import com.example.gradesubmissionapi.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
