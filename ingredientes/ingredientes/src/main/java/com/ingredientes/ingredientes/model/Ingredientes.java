/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ingredientes.ingredientes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sosag
 */
@Entity
@Getter @Setter
public class Ingredientes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String Ingrediente;
    private Boolean sinGluten; //true es sin gluten

    public Ingredientes() {
    }

    public Ingredientes(Long id, String Ingrediente, Boolean sinGluten) {
        this.id = id;
        this.Ingrediente = Ingrediente;
        this.sinGluten = sinGluten;
    }
    
    
    
    
    
}
