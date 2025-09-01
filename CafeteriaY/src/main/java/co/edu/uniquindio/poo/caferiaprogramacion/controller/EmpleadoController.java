package co.edu.uniquindio.poo.caferiaprogramacion.controller;

import co.edu.uniquindio.poo.caferiaprogramacion.App;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Cafeteria;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Empleado;

public class EmpleadoController {
    private App app;
    private Cafeteria cafeteria;
    private Empleado empleado;

    public EmpleadoController() {

    }
    public void setApp(App app) {
        this.app = app;
    }

    public void setCafeteria(Cafeteria cafeteria) {
        this.cafeteria = cafeteria;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void regresarPrimary(){
        app.openViewPrincipal();
    }

    public void abrirGestionProductos(){
        app.openGestionProducto();
    }

    public void abrirGestionClientes(){
        app.openGestionClientes(empleado);
    }

    public void abrirTomarPedido(){
        app.openTomarPedido();
    }

    public void abrirReporteVentas(){
        app.openReporteVenta();
    }



}
