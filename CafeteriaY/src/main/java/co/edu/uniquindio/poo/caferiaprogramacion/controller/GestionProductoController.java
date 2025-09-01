package co.edu.uniquindio.poo.caferiaprogramacion.controller;

import co.edu.uniquindio.poo.caferiaprogramacion.model.Cafeteria;
import co.edu.uniquindio.poo.caferiaprogramacion.App;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Empleado;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Producto;

public class GestionProductoController {
    private Cafeteria cafeteria;
    private App app;
    private Producto producto;
    private Empleado empleado;


    public GestionProductoController(){}

    public void setApp(App app) {
        this.app = app;
    }

    public void setCafeteria(Cafeteria cafeteria) {
        this.cafeteria = cafeteria;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void regresarCrudEmpleado(){
        app.openCrudEmpleado(empleado);
    }




}
