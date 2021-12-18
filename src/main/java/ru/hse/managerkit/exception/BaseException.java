package ru.hse.managerkit.exception;

import ru.hse.managerkit.exception.message.ExceptionMessage;

public class BaseException extends RuntimeException
{

    public BaseException(ExceptionMessage message)
    {
        super(message.getValue());
    }

}
