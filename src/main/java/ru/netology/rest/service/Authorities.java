package ru.netology.rest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public enum Authorities {
    READ,
    WRITE,
    DELETE;

    public static List<Authorities> getRights(){
        return new ArrayList<Authorities>(Arrays.asList(Authorities.values()));
    }


}
