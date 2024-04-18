package com.example.sakila.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/greet/{id}")
    public String greet (@PathVariable Integer id) {
        return "Hello, World! ID is: " + id;
    }
}
