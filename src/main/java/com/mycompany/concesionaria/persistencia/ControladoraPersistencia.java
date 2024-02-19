package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Automovil;

public class ControladoraPersistencia {
    AutomovilJpaController automovilJpaController = new AutomovilJpaController();
    
    
    public void guardarAuto(Automovil auto) {
        automovilJpaController.create(auto);
    }
}
