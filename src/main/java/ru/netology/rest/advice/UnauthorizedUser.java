package ru.netology.rest.advice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.netology.rest.service.AuthorizationService;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class UnauthorizedUser extends RuntimeException {

    private static final Logger logger = LoggerFactory.getLogger(UnauthorizedUser.class);
    public UnauthorizedUser(String msg) {
        super(msg);
        logger.info(msg);
    }
}
