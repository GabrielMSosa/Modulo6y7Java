/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dependencia.dependencia.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sosag
 */

//agregamos getter y seter con las anotaciones de lambok que nos permite reducir codigo 
@Getter @Setter
public class Posteo {
    private Long id;
    private String titulo;
    private String autor;

    public Posteo(Long id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
    
        
    
    
}
