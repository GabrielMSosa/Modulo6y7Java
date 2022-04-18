/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante2.restaurante.Service;

import com.restaurante2.restaurante.PlatoRepository.PlatoRepository;
import com.restaurante2.restaurante.model.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sosag
 */
@Service
public class ServicePlato implements IserviPlato {
    
    @Autowired
    private PlatoRepository inter1;
    
    @Override
    public void cargarPlato(Plato dato){
    inter1.save(dato);
    
    }


}
