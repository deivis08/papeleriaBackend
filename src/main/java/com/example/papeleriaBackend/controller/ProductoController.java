/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.papeleriaBackend.controller;

import com.example.papeleriaBackend.modelo.Producto;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.example.papeleriaBackend.service.ProductoService;

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
@RequestMapping("/productos")

public class ProductoController {
    @Autowired
    ProductoService service;
    
     @GetMapping
    public List<Producto> listar() {
        return service.listar();
    }
    
    @PostMapping
    public Producto agregar(@RequestBody Producto productos) {
        productos.setCreatedAt(LocalDateTime.now());
        productos.setUpdatedAt(LocalDateTime.now());
        return service.add(productos);
    }
    
    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable int id) {
         service.delete(id);
    }
    
    @GetMapping(path = {"/{id}"})
    public Producto listarId(@PathVariable("id") int id){
    return service.listarId(id);
    }
    
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Producto producto){
       try{ 
            producto.setUpdatedAt(LocalDateTime.now());
            Producto productoEditada = service.edit(producto);

            return ResponseEntity.ok().body(Map.of(
                "mensaje", "Producto actualizada correctamente",
                "producto", productoEditada
            ));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of(
                "mensaje", "Error al actualizar el producto",
                "error", e.getMessage()
            ));
        }
    }
    
}
