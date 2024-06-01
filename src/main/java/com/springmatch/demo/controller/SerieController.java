package com.springmatch.demo.controller;

import com.springmatch.demo.dto.SerieDTO;
import com.springmatch.demo.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {

    @Autowired
    private SerieService servicio;



    @GetMapping("/series")
    public List<SerieDTO> obtenerTodasLasSeries() {
        return servicio.obtenerTodasLasSeries();
    }

    @GetMapping("/series/top5")
    public List<SerieDTO> obtenerTop5() {
        return servicio.obtenerTop5();
    }

}

