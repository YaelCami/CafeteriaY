package co.edu.uniquindio.poo.caferiaprogramacion.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String id;
    private LocalDate fecha;
    private String hora;
    private double precioTotal;
    private List<DetallePedido> listDetallesPedido;
    private Recomendacion recomendacion;

    public Pedido(String id, LocalDate fecha, String hora, double precioTotal, Recomendacion recomendacion) {
        this.fecha = fecha;
        this.hora = hora;
        this.precioTotal = precioTotal;
        this.listDetallesPedido = new ArrayList<>();
        this.recomendacion = recomendacion;
    }

    public boolean agregarDetallePedido(DetallePedido detallePedido){
        listDetallesPedido.add(detallePedido);
        return true;
    }

    public boolean eliminarDetallePedido(DetallePedido detallePedido){
        listDetallesPedido.remove(detallePedido);
        return true;
    }

    public boolean actualizarDetallePedido(DetallePedido detallePedido){
        listDetallesPedido.add(detallePedido);
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public List<DetallePedido> getListDetallesPedido() {
        return listDetallesPedido;
    }

    public void setListDetallesPedido(List<DetallePedido> listDetallesPedido) {
        this.listDetallesPedido = listDetallesPedido;
    }

    public Recomendacion getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(Recomendacion recomendacion) {
        this.recomendacion = recomendacion;
    }
}
