/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.papeleriaBackend.service;

import com.example.papeleriaBackend.modelo.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.papeleriaBackend.repositorio.ProductoRepositorio;

/**
 *
 * @author david
 */
@Service
public class ProductoServiceImp implements ProductoService{

     @Autowired
    private ProductoRepositorio repositorio;
    @Override
    public List<Producto> listar() {
        return repositorio.findAll();
    }

    @Override
    public Producto listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Producto add(Producto p) {
         return repositorio.save(p);
    }

    @Override
    public Producto edit(Producto p) {
       return repositorio.save(p);
    }

    @Override
    public Producto delete(int id) {
       return repositorio.deleteById(id);
    }
    
}
