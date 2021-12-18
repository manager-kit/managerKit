package ru.hse.managerkit.exception;

import ru.hse.managerkit.exception.message.ExceptionMessage;

public class NotFoundException extends BaseException
{

    public NotFoundException(ExceptionMessage message)
    {
        super(message);
    }
}
