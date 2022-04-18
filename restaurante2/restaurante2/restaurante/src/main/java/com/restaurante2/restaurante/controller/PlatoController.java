/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante2.restaurante.controller;

import com.restaurante2.restaurante.Service.IserviPlato;
import com.restaurante2.restaurante.model.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sosag
 */
@RestController
public class PlatoController {
    @Autowired
    private IserviPlato inter;
    
    
    
    
@PostMapping("/cargar")
public String cargardato(@RequestBody Plato dato){
inter.cargarPlato(dato);
return "cargado exitosamente";
}

    
    
    
}
