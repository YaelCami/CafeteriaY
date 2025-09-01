package co.edu.uniquindio.poo.caferiaprogramacion.controller;

import co.edu.uniquindio.poo.caferiaprogramacion.App;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Cafeteria;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Empleado;

public class ReporteVentasController {
    private Cafeteria cafeteria;
    private App app;
    private Empleado empleado;

    public ReporteVentasController(){}

    public void setApp(App app) {
        this.app = app;
    }

    public void setCafeteria(Cafeteria cafeteria){}

    public void regresarCrudEmpleado(){
        app.openCrudEmpleado(empleado);
    }
}
