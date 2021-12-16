package ru.hse.managerkit.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.hse.managerkit.dto.auth.AuthDto;
import ru.hse.managerkit.model.User;
import ru.hse.managerkit.service.UserService;
import ru.hse.managerkit.service.jwt.AuthService;
import ru.hse.managerkit.service.jwt.JwtProvider;

@Controller
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

//    @PostMapping("/register")
//    public String registerUser(@RequestBody @Valid RegistrationRequest registrationRequest) {
//        UserEntity u = new UserEntity();
//        u.setPassword(registrationRequest.getPassword());
//        u.setLogin(registrationRequest.getLogin());
//        userService.saveUser(u);
//        return "OK";
//    }

    @PostMapping("/auth")
    public String auth(@RequestBody AuthDto authDto) {
        return authService.login(authDto.getLogin(), authDto.getPassword());
    }
}
