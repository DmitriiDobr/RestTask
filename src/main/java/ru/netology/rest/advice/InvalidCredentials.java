package ru.netology.rest.advice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidCredentials extends RuntimeException {

    private static final Logger logger = LoggerFactory.getLogger(UnauthorizedUser.class);
    public InvalidCredentials(String msg) {
        super(msg);
        logger.info(msg);
    }
}