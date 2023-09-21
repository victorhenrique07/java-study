package com.rick.spring.controllers;

import com.rick.spring.entities.Autor;
import com.rick.spring.entities.Livro;
import com.rick.spring.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public List<Livro> findAll(){
        return livroRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Livro findById(@PathVariable Long id){
        return livroRepository.findById(id).get();
    }

    @PostMapping(value = "/insert")
    public Livro insert(@RequestBody Livro livro){
        return livroRepository.save(livro);
    }
}
