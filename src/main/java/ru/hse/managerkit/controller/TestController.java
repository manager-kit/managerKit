package ru.hse.managerkit.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hse.managerkit.converter.UserConverter;
import ru.hse.managerkit.dto.UserDto;
import ru.hse.managerkit.model.User;
import ru.hse.managerkit.service.UserService;

@RestController
@AllArgsConstructor
public class TestController {

    private final UserService userService;
    private final UserConverter userConverter;

    @GetMapping("/a")
    public UserDto get(){
        return userConverter.toDto(userService.findById(1L));
    }
}
