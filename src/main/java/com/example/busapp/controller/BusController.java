package com.example.busapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusController {

    @GetMapping("/")
    public String home() {
        return "Welcome to BusApp - Raji - 08/08/2025 02:26!";
    }
}
