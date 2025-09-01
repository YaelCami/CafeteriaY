package co.edu.uniquindio.poo.caferiaprogramacion.controller;

import co.edu.uniquindio.poo.caferiaprogramacion.App;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Cafeteria;
import co.edu.uniquindio.poo.caferiaprogramacion.model.DetallePedido;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Empleado;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Producto;

public class PedidosController {
    private Cafeteria cafeteria;
    private Producto producto;
    private DetallePedido detallePedido;
    private Empleado empleado;
    private App app;

    public PedidosController() {

    }
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
