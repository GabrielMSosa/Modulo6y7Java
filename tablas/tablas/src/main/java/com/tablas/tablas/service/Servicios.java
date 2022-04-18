/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tablas.tablas.service;

import com.tablas.tablas.repository.Repositorytabla1;
import com.tablas.tablas.repository.respositrytablahija;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sosag
 */
@Service
public class Servicios {
    @Autowired
    private respositrytablahija repo1;
    
    @Autowired
    private Repositorytabla1 repo2;
    
    
}
