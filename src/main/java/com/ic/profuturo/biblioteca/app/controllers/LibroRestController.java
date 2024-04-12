package com.ic.profuturo.biblioteca.app.controllers;

import com.ic.profuturo.biblioteca.app.models.entity.Libros;
import com.ic.profuturo.biblioteca.app.models.services.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LibroRestController {

    @Autowired
    private ILibroService iLibroService;

    @GetMapping("/libros")
    public List<Libros> getAll(){
        return iLibroService.findAll();
    }

    @GetMapping("/libros/filtrar-libros/{term}")
    @ResponseStatus(HttpStatus.OK)
    public List<Libros> filtrarLibros(@PathVariable String term){
        return iLibroService.findByIsbnContainingIgnoreCase(term);
    }

    @PostMapping("/libros")
    @ResponseStatus(HttpStatus.CREATED)
    public Libros crear(@RequestBody Libros libro) {
        return iLibroService.saveLibro(libro);
    }


}
