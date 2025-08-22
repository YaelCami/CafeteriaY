package co.edu.uniquindio.poo.caferiaprogramacion.controller;

import co.edu.uniquindio.poo.caferiaprogramacion.App;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Cafeteria;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Empleado;

public class PrimaryController {
    private Cafeteria cafeteria;
    private App app;

    public PrimaryController(Cafeteria cafeteria) {
        this.cafeteria = cafeteria;

    }

    public void setApp(App app) {
        this.app = app;
    }

    public boolean redireccionarEmpleado(String id) {
        System.out.println("Buscando empelado con id: " + id);
        Empleado empleado = cafeteria.buscarEmpleado(id);
        if (empleado != null) {
            System.out.println("Empleado encontrado" + empleado.getNombre());
            app.openCrudEmpleado(empleado);
            return true;
        }
        return false;
    }
}
