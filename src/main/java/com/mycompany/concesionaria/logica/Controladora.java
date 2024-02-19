package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersist = new ControladoraPersistencia();
    
    public void guardarAuto(String marca, String modelo, String color, String motor, String patente, int cantidadPuertas){
        Automovil nuevoAuto = new Automovil();
        
        nuevoAuto.setColor(color);
        nuevoAuto.setMarca(marca);
        nuevoAuto.setModelo(modelo);
        nuevoAuto.setMotor(motor);
        nuevoAuto.setPatente(patente);
        nuevoAuto.setCantidadPuertas(cantidadPuertas);
        
        
        //llama a la funcion de la persistencia
        controlPersist.guardarAuto(nuevoAuto);
    }
}
