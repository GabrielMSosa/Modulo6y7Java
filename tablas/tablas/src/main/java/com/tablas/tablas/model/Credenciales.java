/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tablas.tablas.model;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sosag
 */
@Entity
@Getter @Setter
public class Credenciales {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String usuario;
    @NotNull
    private String password;
    
    @OneToOne(mappedBy = "credenciales")
    private User usuarios;
    
    
}
