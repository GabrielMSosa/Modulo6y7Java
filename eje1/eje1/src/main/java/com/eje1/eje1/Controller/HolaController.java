/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eje1.eje1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sosag
 Re*/
@RestController
public class HolaController {
    
    
    public String envia(){
    return "HOLAMUNDO";
    }
}
