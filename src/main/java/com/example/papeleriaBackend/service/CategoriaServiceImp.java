/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.papeleriaBackend.service;

import com.example.papeleriaBackend.modelo.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.papeleriaBackend.repositorio.CategoriaRepositorio;
import com.example.papeleriaBackend.service.CategoriaService;

/**
 *
 * @author david
 */
@Service
public class CategoriaServiceImp implements  CategoriaService {

    @Autowired
    private CategoriaRepositorio repositorio;
    
    @Override
    public List<Categoria> listar() {
        return repositorio.findAll();
    }

    @Override
    public Categoria listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Categoria add(Categoria p) {
        return repositorio.save(p);
    }

    @Override
    public Categoria edit(Categoria p) {
       return repositorio.save(p);
    }

    @Override
    public Categoria delete(int id) {
       return repositorio.deleteById(id);
    }
    
}
