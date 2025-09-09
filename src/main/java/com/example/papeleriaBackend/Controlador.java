/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.papeleriaBackend;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author david
 */
@CrossOrigin(
    origins = "http://localhost:4200",
    allowedHeaders = "*",
    methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS}
)
@RestController
@RequestMapping("/categoria")
public class Controlador {
    
    @Autowired
    CategoriasService service;

    @GetMapping
    public List<Categorias> listar() {
        return service.listar();
    }
    
    @PostMapping
    public Categorias agregar(@RequestBody Categorias categoria) {
        categoria.setCreatedAt(LocalDateTime.now());
        categoria.setUpdatedAt(LocalDateTime.now());
        return service.add(categoria);
    }
    
    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable int id) {
         service.delete(id);
    }
    
    @GetMapping(path = {"/{id}"})
    public Categorias listarId(@PathVariable("id") int id){
    return service.listarId(id);
    }
}
