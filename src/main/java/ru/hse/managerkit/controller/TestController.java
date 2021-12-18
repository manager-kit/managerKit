package ru.hse.managerkit.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hse.managerkit.converter.UserConverter;
import ru.hse.managerkit.dto.UserDto;
import ru.hse.managerkit.exception.BaseException;
import ru.hse.managerkit.exception.NotFoundException;
import ru.hse.managerkit.exception.UnauthorizedException;
import ru.hse.managerkit.exception.message.ExceptionMessage;
import ru.hse.managerkit.service.UserService;

@RestController
@AllArgsConstructor
public class TestController
{

    private final UserService userService;

    private final UserConverter userConverter;

    @GetMapping("/a")
    public UserDto get()
    {
        throw new BaseException(ExceptionMessage.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/b")
    public UserDto get1()
    {
        throw new NotFoundException(ExceptionMessage.NOT_FOUND);
    }

    @GetMapping("/c")
    public UserDto get2()
    {
        throw new UnauthorizedException(ExceptionMessage.UNAUTHORIZED);
    }

    @GetMapping("/d")
    public UserDto get3()
    {
        return userConverter.toDto(userService.findById(1L));
    }
}
