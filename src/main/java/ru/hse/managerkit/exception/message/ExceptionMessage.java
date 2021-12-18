package ru.hse.managerkit.exception.message;

public enum ExceptionMessage
{
    INTERNAL_SERVER_ERROR("Something went wrong"),

    NOT_FOUND("Not found"),

    UNAUTHORIZED("You should authorize");

    private final String value;

    ExceptionMessage(String s)
    {
        this.value = s;
    }

    public String getValue()
    {
        return this.value;
    }
}
