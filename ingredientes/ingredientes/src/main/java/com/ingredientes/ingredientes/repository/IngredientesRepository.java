/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ingredientes.ingredientes.repository;

import com.ingredientes.ingredientes.model.Ingredientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sosag
 */
@Repository
public interface IngredientesRepository extends JpaRepository<Ingredientes, Long>{
    
}
