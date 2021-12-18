package ru.hse.managerkit.exception.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.hse.managerkit.exception.BaseException;
import ru.hse.managerkit.exception.NotFoundException;
import ru.hse.managerkit.exception.UnauthorizedException;
import ru.hse.managerkit.exception.response.Response;

@ControllerAdvice
public class BaseControllerAdvice
{

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<Response> handleException(BaseException e)
    {
        Response response = new Response(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Response> handleException(NotFoundException e)
    {
        Response response = new Response(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<Response> handleException(UnauthorizedException e)
    {
        Response response = new Response(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
    }
}
