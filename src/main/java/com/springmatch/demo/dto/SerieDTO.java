package com.springmatch.demo.dto;

import com.springmatch.demo.model.Categoria;

public record SerieDTO(
        String titulo,
        Integer totalTemporadas,
        Double evaluacion,
        String poster,
        Categoria genero,
        String actores,
        String sinopsis
) {
}
