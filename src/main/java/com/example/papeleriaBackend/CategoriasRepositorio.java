/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.papeleriaBackend;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author david
 */
public interface CategoriasRepositorio extends Repository<Categorias,Integer>{
    List<Categorias>findAll();
    Categorias save(Categorias p);
    Categorias findById(int id);
    Categorias deleteById(int id);
}
