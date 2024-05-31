package com.springmatch.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerieController {

    @GetMapping("/series")
    public String mostrarMensaje() {
        return "Este es mi primer mensaje en mi aplicacion web";
    }

}
