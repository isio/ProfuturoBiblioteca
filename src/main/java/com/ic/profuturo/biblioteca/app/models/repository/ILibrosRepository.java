package com.ic.profuturo.biblioteca.app.models.repository;

import com.ic.profuturo.biblioteca.app.models.entity.Libros;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILibrosRepository extends CrudRepository<Libros, Long> {


    @Query("select l from Libros l where l.isbn like %?1%")
    public List<Libros> findByIsbn(String term);

    public List<Libros> findByIsbnContainingIgnoreCase(String term);

}
