package com.example.jwtlesson.dtos;

import lombok.Builder;

@Builder
public class UserResponseDto {
    private String name;
    private String description;
    private String email;
}
