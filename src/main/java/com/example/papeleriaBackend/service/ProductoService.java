/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.papeleriaBackend.service;

import com.example.papeleriaBackend.modelo.Producto;
import java.util.List;

/**
 *
 * @author david
 */
public interface ProductoService {
     List<Producto>listar();
    Producto listarId(int id);
    Producto add(Producto p);
    Producto edit(Producto p);
    Producto delete(int id);
}
