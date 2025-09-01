package co.edu.uniquindio.poo.caferiaprogramacion.controller;

import co.edu.uniquindio.poo.caferiaprogramacion.App;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Cafeteria;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Cliente;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Empleado;

import java.util.List;

public class GestionClienteController {
    private App app;
    private Cafeteria cafeteria;
    private Cliente cliente;
    private Empleado empleado;

    public List<Cliente> obtenerClientes(){
        return cafeteria.getListClientes();
    }

    public GestionClienteController(Cafeteria cafeteria) {
        this.cafeteria= cafeteria;

    }
    public void setApp(App app) {
        this.app = app;
    }

    public void setCafeteria(Cafeteria cafeteria) {
        this.cafeteria = cafeteria;
    }

    public void setCliente(Cliente cliente) {}

    public void regresarCrudEmpleado(){
        app.openCrudEmpleado(empleado);
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public boolean agregarCliente(Cliente cliente){
        empleado.agregarCliente(cliente);
        return true;
    }

    public boolean eliminarCliente(Cliente cliente){
        boolean centinela = false;
        if (empleado != null){
            empleado.eliminarCliente(cliente.getId());
            centinela = true;
        }
        return centinela;
    }

    public boolean actualizarCliente(String id, Cliente actualizado) {
        boolean centinela = false;
        if(empleado != null){
            empleado.actualizarCliente(id, actualizado);
            centinela = true;
        }
        return centinela;
    }

    public List<Cliente> obtenerListaClientes() {
        return cafeteria.getListClientes();
    }


}
