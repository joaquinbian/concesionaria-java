package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

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
    
    public List<Automovil> obtenerAutos(){
        return controlPersist.obtenerAutos();
    }
    
    
    
    public void eliminarAuto(int id){
        controlPersist.eliminarAuto(id);
    }
    
    
    public Automovil obtenerAuto(int id){
        return controlPersist.obtenerAuto(id);
    }
    
    public void editarAuto(Automovil auto, String marca, String modelo, String color, String motor, String patente, int cantidadPuertas){
        
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setCantidadPuertas(cantidadPuertas);
        
        controlPersist.editarAuto(auto);
        
    }
}
