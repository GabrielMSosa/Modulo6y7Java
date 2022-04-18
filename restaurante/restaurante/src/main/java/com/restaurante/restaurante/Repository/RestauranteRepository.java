/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurante.restaurante.Repository;

import com.restaurante.restaurante.model.Platos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sosag
 */

@Repository
public interface RestauranteRepository extends JpaRepository<Platos,Long> {
    
}
