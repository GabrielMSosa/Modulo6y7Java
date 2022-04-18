/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dependencia.dependencia.repositoryDAO;

import com.dependencia.dependencia.model.Posteo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sosag
 */
@Repository     
public class PosteoRepository {
    
    public List<Posteo> traerTodos(){
    List<Posteo> milist= new ArrayList<Posteo>();
   
    milist.add( new Posteo(1L, "COMO FORMATEAR UNA PC","eSCRITO POR MI"));
    milist.add(new Posteo(2L, "como mantener la seguidad", "Gabriel Gusmis"));
    return milist;
    
    }
    
    
}
