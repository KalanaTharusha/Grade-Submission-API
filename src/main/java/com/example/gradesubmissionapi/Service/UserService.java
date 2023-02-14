package com.example.gradesubmissionapi.Service;

import com.example.gradesubmissionapi.entity.User;

public interface UserService {
    User getUser(Long id);

    User getUser(String username);

    User saveUser(User user);

}
