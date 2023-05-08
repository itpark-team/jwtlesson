package com.example.jwtlesson.controllers;

import com.example.jwtlesson.authservices.AuthOrRegisterService;
import com.example.jwtlesson.dtos.AuthOrRegisterResponseDto;
import com.example.jwtlesson.dtos.AuthRequestDto;
import com.example.jwtlesson.dtos.RegisterRequestDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
//@CrossOrigin(origins = "*", maxAge = 3600)
@AllArgsConstructor
public class AuthController {
    private final AuthOrRegisterService authOrRegisterService;

    @PostMapping("/register")
    public AuthOrRegisterResponseDto register(@RequestBody RegisterRequestDto registerRequestDto) {
        return authOrRegisterService.register(registerRequestDto);
    }

    @PostMapping("/authenticate")
    public AuthOrRegisterResponseDto authenticate(@RequestBody AuthRequestDto authRequestDto) {
        return authOrRegisterService.authenticate(authRequestDto);
    }
}
