/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.papeleriaBackend.repositorio;

import com.example.papeleriaBackend.modelo.Categoria;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author david
 */
public interface CategoriaRepositorio extends Repository<Categoria,Integer>{
    List<Categoria>findAll();
    Categoria save(Categoria p);
    Categoria findById(int id);
    Categoria deleteById(int id);
}
