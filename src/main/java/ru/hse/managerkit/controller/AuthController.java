package ru.hse.managerkit.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hse.managerkit.config.CurrentUser;
import ru.hse.managerkit.converter.UserConverter;
import ru.hse.managerkit.dto.SignInDto;
import ru.hse.managerkit.dto.UserDto;
import ru.hse.managerkit.dto.auth.AuthDto;
import ru.hse.managerkit.model.CustomUserDetails;
import ru.hse.managerkit.service.UserService;
import ru.hse.managerkit.service.jwt.AuthService;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    private final UserConverter userConverter;
    private final UserService userService;

    @PostMapping("/signin")
    public ResponseEntity<Void> registerUser(@RequestBody SignInDto userDto) {
        authService.signIn(userConverter.fromDto(userDto));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/auth")
    public String auth(@RequestBody AuthDto authDto) {
        return authService.login(authDto.getLogin(), authDto.getPassword());
    }

    @GetMapping("/user/get")
    public UserDto get(@CurrentUser CustomUserDetails user) {
        return userConverter.toDto(userService.findByUsername(user.getUsername()));
    }
}
