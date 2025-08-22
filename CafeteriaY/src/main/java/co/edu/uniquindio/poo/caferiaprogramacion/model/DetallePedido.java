package co.edu.uniquindio.poo.caferiaprogramacion.model;

import java.util.ArrayList;
import java.util.List;

public class DetallePedido {
    private String producto;
    private int cantidad;
    private double precio;
    private double subTtotal;
    private List<Bebida> listBebidas;
    private List<Comida> listComidas;
    private List<Combo> listCombos;

    public DetallePedido(String producto, int cantidad, double precio, double subTtotal) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subTtotal = subTtotal;
        this.listBebidas = new ArrayList<>();
        this.listComidas = new ArrayList<>();
        this.listCombos = new ArrayList<>();
    }

    public void agregarBebida(Bebida bebida) {
        listBebidas.add(bebida);
    }
    public void agregarComida(Comida comida) {
        listComidas.add(comida);
    }

    public void agregarCombo(Combo combo) {
        listCombos.add(combo);
    }


    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubTtotal() {
        return subTtotal;
    }

    public void setSubTtotal(double subTtotal) {
        this.subTtotal = subTtotal;
    }

    public List<Bebida> getListBebidas() {
        return listBebidas;
    }

    public void setListBebidas(List<Bebida> listBebidas) {
        this.listBebidas = listBebidas;
    }

    public List<Comida> getListComidas() {
        return listComidas;
    }

    public void setListComidas(List<Comida> listComidas) {
        this.listComidas = listComidas;
    }

    public List<Combo> getListCombos() {
        return listCombos;
    }

    public void setListCombos(List<Combo> listCombos) {
        this.listCombos = listCombos;
    }
}
