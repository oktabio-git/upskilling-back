package com.upskilling.microservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
    @GetMapping("/holamundo/{usuario}")
    public String saludo(@PathVariable String usuario) {
        return "Hola " + usuario;
    }

    @GetMapping("/suma/{a}/{b}")
    public int suma(@PathVariable int a, @PathVariable int b) {
        int result = a + b;
        return result;
    }
}
