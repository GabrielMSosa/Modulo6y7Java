/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.primero1.primero.Controller;

import com.primero1.primero.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sosag
 */
@RestController
public class HolaController {

    //get mapping generamos el get en el local host en laraiz pero si ponemos un patch al get mappin
    //podemos hacerel get de la url
    //pasamos parametros con el decorador @PathVariable y agregando al decorador
    //getmapping poniendo entre llaves.
    //http://localhost:8080/hola/gabriel/31/Ingeniero
    //aunque los dos metodos son similares tienen distintos tipos de accesos por uri
    @GetMapping("/hola/{nombre}/{edad}/{profesion}")
public String diceHola(@PathVariable String nombre,
                       @PathVariable String edad,
                       @PathVariable String profesion){
    return "Hola mundo soy "+nombre+"y tengo "+edad+" años y tengo una profesion de "+profesion;

}

//RequestParam es otra forma de pasar un parametro por get pero la uri va asi
//http://localhost:8080/hola1?nombre=Gabriel&edad=31&profesion=Ingeniero
    @GetMapping("/hola1")
    public String diceHol1(@RequestParam String nombre,
                          @RequestParam String edad,
                          @RequestParam String profesion
    ){
      return "Hola mundo soy "+nombre+"y tengo "+edad+" años y tengo una profesion de "+profesion;
    }
    
    
    //con este endopoint y si pasams
    /*
     * un json {
    "id":1,
    "nombre":"Gabriel",
    "apellido":"Sosa"
                } 
* asi ppor postman al endpoint http://localhost:8080/cliente 
    nos pasa por consola lo que hace la clase
    @Postmappin crea el endpoint para post y @RequestBody es la info que mandamos al endpoint
    spring se encarga de convertir el json en objeto java
* */
    
@PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli){
        System.out.println("Datos del CLiente:"+cli.getNombre() +" Apellido:"+cli.getApellido());
    
    }
    
//vamos a crear un endpoiing que devuelva una collecion de objetos

@GetMapping("/cliente/traer")   
@ResponseBody
public List<Cliente> Muestralista(){
    //creamos list para simular la BD con info
    List<Cliente> lista= new ArrayList<Cliente> ();
lista.add(new Cliente(1, "Gabriel", "Sosa"));
lista.add(new Cliente(2, "Fabrizio", "Sosa"));
lista.add(new Cliente(3, "Carla", "Denis"));
lista.add(new Cliente(4, "Aaron", "Denis"));
//lo que devuelve el get con el responsbodt ponemos en el return
return lista;
}   

/*
Otra forma de get es con responseentity que podemos personalizar la
peticion http por eje que devuelva status 200 OK aca vamos con un ejemplo*/

@GetMapping("/pruebaresponse")
ResponseEntity<String> respuesta(){

return new ResponseEntity<>("Esto es uun mensaje response entitty",HttpStatus.OK);
}
}
