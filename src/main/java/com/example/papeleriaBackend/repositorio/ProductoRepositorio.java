/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.papeleriaBackend.repositorio;

import com.example.papeleriaBackend.modelo.Producto;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author david
 */
public interface ProductoRepositorio  extends Repository<Producto,Integer>{
    List<Producto>findAll();
    Producto save(Producto p);
    Producto findById(int id);
    Producto deleteById(int id);
    
}
