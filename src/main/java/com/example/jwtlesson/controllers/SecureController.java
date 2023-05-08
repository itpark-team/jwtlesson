package com.example.jwtlesson.controllers;

import com.example.jwtlesson.dtos.UserResponseDto;
import com.example.jwtlesson.models.User;
import com.example.jwtlesson.service.UsersService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/secure")
//@CrossOrigin(origins = "*", maxAge = 3600)
@AllArgsConstructor
public class SecureController {

    private final UsersService usersService;

    @GetMapping("/get-hello")
    public String getHello() {
        return "hello secure";
    }

    @GetMapping("/get-user")
    public UserResponseDto getUser(Principal principal) throws Exception {
        UserResponseDto userResponseDto = usersService.getUserByUsername(principal.getName());
        return userResponseDto;
    }

//    @GetMapping("/get-user")
//    public String getUser(Principal principal) throws Exception {
//        return principal.getName();
//    }
}


