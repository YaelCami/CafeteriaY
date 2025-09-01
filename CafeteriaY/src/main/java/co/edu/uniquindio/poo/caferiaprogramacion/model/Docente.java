package co.edu.uniquindio.poo.caferiaprogramacion.model;

public class Docente extends Cliente {
    private String idDocente;

    public Docente(String nombre, String id, String nombreCuenta, TipoCliente tipoCliente, String idDocente){
        super(nombre, id, nombreCuenta, tipoCliente);
        this.idDocente = idDocente;
    }

    public String getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(String tarjeta) {
        this.idDocente = idDocente;
    }
}
