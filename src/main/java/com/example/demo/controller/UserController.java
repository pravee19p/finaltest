package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;




@RestController

public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/get")
    public ResponseEntity<List<User>> getUser() {
        return ResponseEntity.ok(userService.getUser());
    }
    

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        
        
        return ResponseEntity.ok(userService.addUser(user));
    }
    

}
