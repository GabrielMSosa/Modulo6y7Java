/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ingredientes.ingredientes.service;

import com.ingredientes.ingredientes.model.Ingredientes;
import java.util.List;

/**
 *
 * @author sosag
 */
public interface Iserviinterface {
 
    
    public List<Ingredientes> mostrar();
    
    public void cargar(Ingredientes dato);
    
}
