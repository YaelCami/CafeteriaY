package co.edu.uniquindio.poo.caferiaprogramacion.model;

public class Bebida extends Producto{
    private String sabor;
    private Tamanio tamanio;
    private Temperatura temperatura;

    public Bebida(String id, String nombre, String descripcion, Tamanio tamanio, Temperatura temperatura, String sabor, double precio){
        super(id, nombre, descripcion, precio);
        this.tamanio = tamanio;
        this.temperatura = temperatura;
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }
}
