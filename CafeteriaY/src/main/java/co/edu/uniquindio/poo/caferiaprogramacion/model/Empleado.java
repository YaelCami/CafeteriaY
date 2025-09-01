package co.edu.uniquindio.poo.caferiaprogramacion.model;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona{
    private double salario;
    private List<Bebida> listBebidas;
    private List<Comida> listComidas;
    private List<Combo> listCombos;
    private List<Estudiante> listEstudiantes;
    private List<Visitante> listVisitantes;
    private List<Docente> listDocentes;
    private List<Pedido> listPedidos;
    private Cafeteria cafeteria;

    public Empleado(String nombre, String id, double salario){
        super(nombre, id);
        this.salario = salario;
        this.listBebidas = new ArrayList<Bebida>();
        this.listComidas = new ArrayList<>();
        this.listCombos = new ArrayList<>();
        this.listEstudiantes = new ArrayList<>();
        this.listVisitantes = new ArrayList<>();
        this.listDocentes = new ArrayList<>();
        this.listPedidos = new ArrayList<>();
        this.cafeteria = cafeteria;
    }

    public boolean agregarBebida(Bebida bebida) {
        return cafeteria.agregarBebida(bebida);
    }
    public boolean agregarComida(Comida comida){
        return cafeteria.agregarComida(comida);
    }
    public boolean agregarCombo(Combo combo){
        return cafeteria.agregarCombo(combo);

    }
    public void agregarCliente(Cliente cliente){
        cafeteria.agregarCliente(cliente);
    }
    public void eliminarCliente(String id){
        cafeteria.eliminarCliente(id);
    }
    public void actualizarCliente(String id, Cliente actualizado){
        cafeteria.actualizarCliente(id, actualizado);
    }

    public boolean  agregarEstudiante(Estudiante estudiante){
        return cafeteria.agregarEstudiante(estudiante);
    }

    public boolean agregarVisitante(Visitante visitante){
        return cafeteria.agregarVisitante(visitante);
    }
    public boolean agregarDocente(Docente docente){
        return cafeteria.agregarDocente(docente);
    }
    public boolean agregarPedido(Pedido pedido){
        return cafeteria.agregarPedido(pedido);
    }
    public boolean eliminarBebida(String id) {
        return cafeteria.eliminarBebida(id);
    }
    public boolean eliminarComida(String id) {
        return cafeteria.eliminarComida(id);
    }
    public boolean eliminarEstudiante(String id) {
        return cafeteria.eliminarEstudiante(id);
    }
    public boolean eliminarVisitante(String id) {
        return cafeteria.eliminarVisitante(id);
    }
    public  boolean eliminarDocente(String id) {
        return cafeteria.eliminarDocente(id);
    }
    public boolean eliminarPedido(String id){
        return cafeteria.eliminarPedido(id);
    }
    public boolean actualizarBebida(String id, Bebida bebidaActualizada) {
        return cafeteria.actualizarBebida(id, bebidaActualizada);
    }
    public boolean actualizarComida(String id, Comida comidaActualizada) {
        return cafeteria.actualizarComida(id, comidaActualizada);
    }
    public boolean  actualizarCombo(String id, Combo comboActualizada) {
        return cafeteria.actualizarCombo(id, comboActualizada);
    }
    public boolean actualizarEstudiante(String id, Estudiante estudianteActualizada) {
        return cafeteria.actualizarEstudiante(id, estudianteActualizada);
    }
    public boolean actualizarVisitante(String id, Visitante visitanteActualizada) {
        return cafeteria.actualizarVisitante(id, visitanteActualizada);
    }
    public boolean actualizarDocente(String id, Docente docenteActualizada) {
        return cafeteria.actualizarDocente(id, docenteActualizada);
    }
    public boolean actualizarPedido(String id, Pedido pedidoActualizada) {
        return cafeteria.actualizarPedido(id, pedidoActualizada);
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

    public List<Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }

    public void setListEstudiantes(List<Estudiante> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }

    public List<Visitante> getListVisitantes() {
        return listVisitantes;
    }

    public void setListVisitantes(List<Visitante> listVisitantes) {
        this.listVisitantes = listVisitantes;
    }

    public List<Docente> getListDocentes() {
        return listDocentes;
    }

    public void setListDocentes(List<Docente> listDocentes) {
        this.listDocentes = listDocentes;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
