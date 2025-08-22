package co.edu.uniquindio.poo.caferiaprogramacion.model;

public class Comida extends Producto{
    private double calorias;
    private Temperatura temperatura;

    public Comida(String id, String nombre, String descripcion, Temperatura temperatura, double calorias, double precio) {
        super(id, nombre, descripcion, precio);
        this.calorias = calorias;
        this.temperatura = temperatura;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }
}
