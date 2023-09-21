package com.rick.spring.controllers;


import com.rick.spring.entities.Autor;
import com.rick.spring.entities.Livro;
import com.rick.spring.repositories.AutorRepository;
import com.rick.spring.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/autores")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @GetMapping(value = "/all")
    public List<Autor> findAll(){
        return autorRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Autor listarLivrosAutor(@PathVariable Long id){
        //Autor autor = autorRepository.findById(id).get();
        return autorRepository.findById(id).get();
    }

    @PostMapping(value = "/register")
    public Autor insert(@RequestBody Autor autor){
        return autorRepository.save(autor);
    }
}
