/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manejofecha.manejofecha.controller;

import com.manejofecha.manejofecha.Service.IserviFecha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sosag
 */
@RestController
public class FechaController {
    
    @Autowired
    private IserviFecha inter;
    //inyectamos dependencia en criollo instanciamos con la anotacion
    
    
    @GetMapping("/calcula/{dia}/{mes}/{anio}")
    public String CalcularEdad(@PathVariable String dia,
                              @PathVariable String mes,
                              @PathVariable String anio){
     String dato=dia+"/"+mes+"/"+anio;
    return inter.retornaEdad(dato);
   
   
   }
    
    
    
    
    
}
