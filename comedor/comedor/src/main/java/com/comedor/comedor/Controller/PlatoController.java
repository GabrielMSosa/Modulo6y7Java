/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.comedor.comedor.Controller;

import com.comedor.comedor.model.Plato;
import com.comedor.comedor.service.IserviPlato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    private IserviPlato plato;
    


@PostMapping("/crear")    
    public  String crear( @RequestBody Plato dato){
    plato.Cargarplatos(dato);
    return "Plato creado con exito";
    
    }

@GetMapping("/buscar/{id}")
public Plato buscar(@PathVariable Long id ){
 return plato.buscarPlato(id);


}
    
    

    
    
}
