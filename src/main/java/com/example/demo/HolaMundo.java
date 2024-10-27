package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
//ssss
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HolaMundo {

    @RequestMapping("/")

    public String hola(){
        return "Mensaje de prueba";
    }
}