package com.vsoft.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class HomeController {

    @GetMapping("/home")
    public String home() {

        return "Welcome to VSoft";
    }
}
