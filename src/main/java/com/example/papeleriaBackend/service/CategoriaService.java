/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.papeleriaBackend.service;

import com.example.papeleriaBackend.modelo.Categoria;
import java.util.List;

/**
 *
 * @author david
 */
public interface CategoriaService {
    List<Categoria>listar();
    Categoria listarId(int id);
    Categoria add(Categoria p);
    Categoria edit(Categoria p);
    Categoria delete(int id);
}
