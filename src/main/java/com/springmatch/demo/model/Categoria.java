package com.springmatch.demo.model;

public enum Categoria {
    ACCION("Action", "Acción"),
    ROMANCE("Romance", "Romance"),
    COMEDIA("Comedy", "Comedia"),
    CRIMEN("Crime", "Crimen"),
    DRAMA("Drama", "Drama"),
    BIOGRAFIA("Biography", "Biografía");

    private String categoriaOmdb;

    private String categoriaEspanol;

    Categoria (String categoriaOmdb, String categoriaEspanol) {
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaEspanol = categoriaEspanol;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (Categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoria encontrada." + text);
    }

    public static Categoria fromEspanol(String text) {
        for (Categoria categoria : Categoria.values()) {
            if ( Categoria.categoriaEspanol.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoria encontrada." + text);
    }

}
