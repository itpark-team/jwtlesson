package com.example.jwtlesson.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/secure")
public class SecureController {

    @GetMapping("/get-hello")
    public String getHello() {
        return "hello secure";
    }
}
