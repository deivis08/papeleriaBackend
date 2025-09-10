/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.papeleriaBackend.controller;

import com.example.papeleriaBackend.modelo.Categoria;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.papeleriaBackend.service.CategoriaService;

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
@RequestMapping("/categorias")
public class CategoriaController {
    
    @Autowired
    CategoriaService service;

    @GetMapping
    public List<Categoria> listar() {
        return service.listar();
    }
    
    @PostMapping
    public Categoria agregar(@RequestBody Categoria categoria) {
        categoria.setCreatedAt(LocalDateTime.now());
        categoria.setUpdatedAt(LocalDateTime.now());
        return service.add(categoria);
    }
    
    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable int id) {
         service.delete(id);
    }
    
    @GetMapping(path = {"/{id}"})
    public Categoria listarId(@PathVariable("id") int id){
    return service.listarId(id);
    }
    
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Categoria categoria){
       try{ 
            categoria.setUpdatedAt(LocalDateTime.now());
            Categoria categoriaEditada = service.edit(categoria);

            return ResponseEntity.ok().body(Map.of(
                "mensaje", "Categoría actualizada correctamente",
                "categoria", categoriaEditada
            ));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of(
                "mensaje", "Error al actualizar la categoría",
                "error", e.getMessage()
            ));
        }
    }
}
