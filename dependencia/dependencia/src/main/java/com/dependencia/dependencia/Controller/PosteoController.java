/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dependencia.dependencia.Controller;

import com.dependencia.dependencia.model.Posteo;
import com.dependencia.dependencia.repositoryDAO.PosteoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sosag
 */

@RestController
public class PosteoController {
    
    
    //autowired inyecta dependencia 
    //sin necesidad de crear un nuevo objeto
    
    @Autowired
     PosteoRepository repositorio;
    
   @GetMapping("/posteo") 
        public List<Posteo> envialista(){
        return repositorio.traerTodos();
        
        }
    
    
}
