package co.edu.uniquindio.poo.caferiaprogramacion.model;

public class Docente extends Cliente {
    private String tarjeta;

    public Docente(String nombre, String id, String nombreCuenta, String tarjeta){
        super(nombre, id, nombreCuenta);
        this.tarjeta = tarjeta;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
}
