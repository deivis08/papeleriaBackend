/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.papeleriaBackend;

import java.util.List;

/**
 *
 * @author david
 */
public interface CategoriasService {
    List<Categorias>listar();
    Categorias listarId(int id);
    Categorias add(Categorias p);
    Categorias edit(Categorias p);
    Categorias delete(int id);
}
