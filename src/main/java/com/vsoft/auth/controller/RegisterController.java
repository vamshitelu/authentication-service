package com.vsoft.auth.controller;

import com.vsoft.auth.model.User;
import com.vsoft.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class RegisterController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User savedUser = userService.registerUser(user);

        return ResponseEntity.ok(savedUser);
    }

}
