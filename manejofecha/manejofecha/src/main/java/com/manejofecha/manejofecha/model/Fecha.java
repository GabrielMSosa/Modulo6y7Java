/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manejofecha.manejofecha.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author sosag
 */

@Getter @Setter
public class Fecha {
    
    
    private String FechaNac;
    private String fechaactual;

    public Fecha() {
    }

    public Fecha(String FechaNac, String fechaactual) {
        this.FechaNac = FechaNac;
        this.fechaactual = fechaactual;
    }
    


    
}
