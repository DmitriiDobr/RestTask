package ru.netology.rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.rest.service.Authorities;

import java.util.HashMap;
import java.util.List;

@Repository
public class UserRepository {

    final private static HashMap<String,List<Authorities>> authorities =  new HashMap<>(){{
        put("dimadobrov", Authorities.getRights());
        put("iradobrov", Authorities.getRights());
    }};

    public List<Authorities> getUserAuthorities(String user, String password) {
        String concat = user+password;
        return authorities.get(concat);
    }
}
