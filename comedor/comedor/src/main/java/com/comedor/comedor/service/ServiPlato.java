/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.comedor.comedor.service;

import com.comedor.comedor.Repository.ComedorRepo;
import com.comedor.comedor.model.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sosag
 */
@Service
public class ServiPlato implements IserviPlato {
    
    @Autowired
    private ComedorRepo mirepo;

    @Override
    public void Cargarplatos(Plato dato){
    mirepo.save(dato);
    
    
    }
    @Override
    public Plato buscarPlato(Long id){
    
    Plato dato=mirepo.findById(id).orElse(null);
    
    return dato;
    
    }
    
}
