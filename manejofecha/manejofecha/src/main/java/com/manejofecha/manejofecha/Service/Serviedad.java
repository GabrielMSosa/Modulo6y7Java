/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manejofecha.manejofecha.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import org.springframework.stereotype.Service;

/**
 *
 * @author sosag
 */
@Service
public class Serviedad implements IserviFecha {
    
    
    @Override    
    public String retornaEdad(String dato){
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date midata= new Date();
            
            String separador = Pattern.quote("/");//usamos patter
            String dateToStr = dateFormat.format(midata);
            String fechaact[]=dateToStr.split(separador);
            String fechanac[]=dato.split(separador);
            Integer anionac=Integer.parseInt(fechanac[2]);
            Integer anioact=Integer.parseInt(fechaact[2]);
            Integer edad=anioact-anionac;
            Integer mesnac=Integer.parseInt(fechanac[1]);
            Integer mesact=Integer.parseInt(fechaact[1]);
            Integer dianac=Integer.parseInt(fechanac[0]);
            Integer diaact=Integer.parseInt(fechaact[0]);
            
            //hacemoslas validaciones en caso que  no haya cumplido
            
            if ((mesact-mesnac) <0) {
                edad--;
            
            }
            else{
                if((mesact-mesnac) == 0){
                    if((diaact-dianac)<=0){
                     edad--;}
                
                }
            
            
            }
            
            
            
           
           return edad.toString();
 }
}