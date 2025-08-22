package co.edu.uniquindio.poo.caferiaprogramacion.model;

public class Cliente extends Persona{
    private String nombreCuenta;

    public Cliente(String nombre, String id, String nombreCuenta) {
        super(id, nombre);
        this.nombreCuenta = nombreCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }
}
