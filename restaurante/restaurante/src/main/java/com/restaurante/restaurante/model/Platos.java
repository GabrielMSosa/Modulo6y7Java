/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.restaurante.model;

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


@Getter @Setter
@Entity
public class Platos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private Double precio;
    private Long idplato;
    private String info;

    public Platos() {
    }

    public Platos(Long id, String nombre, Double precio, Long idplato, String info) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.idplato = idplato;
        this.info = info;
    }
    
    
    
    
}
