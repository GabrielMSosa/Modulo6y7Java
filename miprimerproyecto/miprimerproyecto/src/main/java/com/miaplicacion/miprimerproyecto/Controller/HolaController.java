/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miaplicacion.miprimerproyecto.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sosag
 */

//anotacion de controller 
@RestController
public class HolaController {
    @GetMapping
    public  String decirHola(){
    return "HelloWorld!!";
    
    }
    
    
    
    
}
