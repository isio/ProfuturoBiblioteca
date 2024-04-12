package com.ic.profuturo.biblioteca.app.models.services;

import com.ic.profuturo.biblioteca.app.models.entity.Libros;
import com.ic.profuturo.biblioteca.app.models.repository.ILibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LibrosServiceImpl implements ILibroService {

    @Autowired
    private ILibrosRepository iLibrosRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Libros> findAll() {
        return (List<Libros>) iLibrosRepository.findAll();
    }

    @Override
    public List<Libros> findLibrosByIsbn(String term) {
        return null;
    }

    @Override
    public List<Libros> findByIsbnContainingIgnoreCase(String term) {
        return iLibrosRepository.findByIsbnContainingIgnoreCase(term);
    }

    @Override
    public Libros saveLibro(Libros Libro) {
        return iLibrosRepository.save(Libro);
    }
}
