package co.edu.uniquindio.poo.caferiaprogramacion.model;

public class Cliente extends Persona{
    private String nombreCuenta;
    private TipoCliente tipoCliente;

    public Cliente(String nombre, String id, String nombreCuenta, TipoCliente tipoCliente) {
        super(id, nombre);
        this.nombreCuenta = nombreCuenta;
        this.tipoCliente = tipoCliente;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }
}
