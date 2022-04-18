/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.comedor.comedor.Repository;
import  com.comedor.comedor.model.Plato;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author sosag
 */
public interface ComedorRepo extends JpaRepository<Plato, Long> {
    
}
