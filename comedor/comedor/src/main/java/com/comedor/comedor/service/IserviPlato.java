/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.comedor.comedor.service;

import com.comedor.comedor.model.Plato;

/**
 *
 * @author sosag
 */
public interface IserviPlato {
    
    
    public void Cargarplatos(Plato dato);
    
    public Plato buscarPlato(Long id);
    
}
