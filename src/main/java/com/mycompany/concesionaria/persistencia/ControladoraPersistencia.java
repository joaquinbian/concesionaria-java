package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Automovil;
import java.util.List;

public class ControladoraPersistencia {
    AutomovilJpaController automovilJpaController = new AutomovilJpaController();
    
    
    public void guardarAuto(Automovil auto) {
        automovilJpaController.create(auto);
    }
    
    
    public List<Automovil> obtenerAutos(){
        return automovilJpaController.findAutomovilEntities();
    }
    
    
}
