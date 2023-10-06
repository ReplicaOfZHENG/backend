package com.example.backend.controller;

import com.example.backend.entity.User;
import com.example.backend.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegisterController {
    @Autowired
    private UserMapper userMapper;
    @PostMapping("/register")
    public ResponseEntity<String> query(String username, int usertype, String userpwd){
        List<User> list = userMapper.find(usertype,username,userpwd);
        if (!list.isEmpty()) {
            return ResponseEntity.ok().body("{\"status\": \"succeed\"}");
        } else {
            System.out.println(list);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"status\": \"Error: User not found\"}");
        }
    }
}
