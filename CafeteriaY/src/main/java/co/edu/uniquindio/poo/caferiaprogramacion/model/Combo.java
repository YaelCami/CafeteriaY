package co.edu.uniquindio.poo.caferiaprogramacion.model;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Producto {
    private List<Comida> listComidas;
    private List<Bebida> listBebidas;

    public Combo(String id, String nombre, String descripcion,double precio) {
        super(id, nombre, descripcion, precio);
        this.listComidas = new ArrayList<>();
        this.listBebidas = new ArrayList<>();
    }
    public void agregarComida(Comida comida) {
        listComidas.add(comida);
    }
    public void  agregarBebida(Bebida bebida) {
        listBebidas.add(bebida);
    }
    public List<Comida> getListComidas() {
        return listComidas;
    }
    public void setListComidas(List<Comida> listComidas) {
        this.listComidas = listComidas;
    }

    public List<Bebida> getListBebidas() {
        return listBebidas;
    }

    public void setListBebidas(List<Bebida> listBebidas) {
        this.listBebidas = listBebidas;
    }
}
