package com.example.jwtlesson.service;

import com.example.jwtlesson.dtos.UserResponseDto;
import com.example.jwtlesson.models.User;
import com.example.jwtlesson.repositories.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;

    public UserResponseDto getUserByUsername(String username) throws Exception {
        Optional<User> userResult = usersRepository.findByUsername(username);

        if (userResult.isEmpty()) {
            throw new Exception("User not found");
        }

        User user = userResult.get();

        return UserResponseDto.builder()
                .name(user.getName())
                .email(user.getEmail())
                .description(user.getDescription())
                .build();
    }

}
