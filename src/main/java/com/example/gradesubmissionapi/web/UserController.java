package com.example.gradesubmissionapi.web;

import com.example.gradesubmissionapi.Service.UserService;
import com.example.gradesubmissionapi.entity.User;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {


    UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<String> findById(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getUser(id).getUsername(), HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<HttpStatus> createUser(@Valid @RequestBody User user) {
        userService.saveUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
