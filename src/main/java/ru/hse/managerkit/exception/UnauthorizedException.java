package ru.hse.managerkit.exception;

import ru.hse.managerkit.exception.message.ExceptionMessage;

public class UnauthorizedException extends BaseException
{

    public UnauthorizedException(ExceptionMessage message)
    {
        super(message);
    }
}
