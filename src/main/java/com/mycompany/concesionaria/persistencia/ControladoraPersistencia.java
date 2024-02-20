package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Automovil;
import com.mycompany.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    AutomovilJpaController automovilJpaController = new AutomovilJpaController();
    
    
    public void guardarAuto(Automovil auto) {
        automovilJpaController.create(auto);
    }
    
    
    public List<Automovil> obtenerAutos(){
        return automovilJpaController.findAutomovilEntities();
    }
    
    
    
    
    public void eliminarAuto(int id){
        try {
            automovilJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
