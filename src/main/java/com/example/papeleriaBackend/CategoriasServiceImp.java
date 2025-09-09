/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.papeleriaBackend;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class CategoriasServiceImp implements  CategoriasService {

    @Autowired
    private CategoriasRepositorio repositorio;
    
    @Override
    public List<Categorias> listar() {
        return repositorio.findAll();
    }

    @Override
    public Categorias listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Categorias add(Categorias p) {
        return repositorio.save(p);
    }

    @Override
    public Categorias edit(Categorias p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Categorias delete(int id) {
       return repositorio.deleteById(id);
    }
    
}
