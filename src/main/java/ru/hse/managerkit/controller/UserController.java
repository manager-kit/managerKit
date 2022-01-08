package ru.hse.managerkit.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.hse.managerkit.converter.UserConverter;
import ru.hse.managerkit.dto.UserDto;
import ru.hse.managerkit.model.User;
import ru.hse.managerkit.service.UserService;
import ru.hse.managerkit.util.EndPoints;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserConverter userConverter;

    @GetMapping(EndPoints.USER_BY_ID)
    public UserDto get(@PathVariable(name = "id") Long userId) {
        User user = userService.findById(userId);
        return userConverter.toDto(user);
    }
}
