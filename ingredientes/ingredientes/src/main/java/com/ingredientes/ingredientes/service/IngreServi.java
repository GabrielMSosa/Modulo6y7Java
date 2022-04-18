/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ingredientes.ingredientes.service;

import com.ingredientes.ingredientes.model.Ingredientes;
import com.ingredientes.ingredientes.repository.IngredientesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

/**
 *
 * @author sosag
 */
@Service
public class IngreServi {
    @Autowired
    private IngredientesRepository mirepo;
    
    
    @Autowired
    public List<Ingredientes> mostrar(){   
    
    }
    @Autowired
    public void cargar(Ingredientes dato){
    mirepo.save(dato);
    }
    
    
}
