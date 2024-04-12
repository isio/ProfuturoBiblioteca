package com.ic.profuturo.biblioteca.app.models.services;

import com.ic.profuturo.biblioteca.app.models.entity.Libros;

import java.util.List;

public interface ILibroService {

    public List<Libros> findAll();

    public List<Libros> findLibrosByIsbn(String term);

    public List<Libros> findByIsbnContainingIgnoreCase(String term);

    public Libros saveLibro(Libros Libro);
}
