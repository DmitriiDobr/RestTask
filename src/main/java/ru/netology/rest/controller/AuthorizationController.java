package ru.netology.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.rest.service.Authorities;
import ru.netology.rest.service.AuthorizationService;

import java.util.List;



@Controller
@RestController
public class AuthorizationController {
    @Autowired
    AuthorizationService service;

    @GetMapping(value = "/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
}
