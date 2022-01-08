package ru.hse.managerkit.exception.message;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ExceptionMessage
{
    INTERNAL_SERVER_ERROR("Something went wrong"),
    NOT_FOUND("Not found"),
    UNAUTHORIZED("You not authorized"),
    USER_NOT_FOUND("User not found");

    private final String value;
}
