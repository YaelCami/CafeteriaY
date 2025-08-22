package co.edu.uniquindio.poo.caferiaprogramacion.model;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria {
    private String nombre;
    private String eslogan;
    private List<Bebida> listBebidas;
    private List<Comida> listComidas;
    private List<Combo>  listCombos;
    private List<Estudiante> listEstudiantes;
    private List<Docente> listDocentes;
    private List<Visitante> listVisitantes;
    private List<Empleado> listEmpleados;
    private List<Pedido> listPedido;

    public Cafeteria(String nombre, String eslogan) {
        this.nombre = nombre;
        this.eslogan = eslogan;
        this.listBebidas = new ArrayList<>();
        this.listComidas = new ArrayList<>();
        this.listCombos = new ArrayList<>();
        this.listEstudiantes = new ArrayList<>();
        this.listDocentes = new ArrayList<>();
        this.listVisitantes = new ArrayList<>();
        this.listEmpleados = new ArrayList<>();
        this.listPedido = new ArrayList<>();

    }
    public boolean verificarBebida(String id) {
        boolean centinela = false;
        for (Bebida b : listBebidas) {
            if (b.getId().equals(id)) {
                centinela = true;
                break;
            }
        }
        return centinela;
    }
    public boolean verificarComida(String id) {
        boolean centinela = false;
        for (Comida comida : listComidas) {
            if (comida.getId().equals(id)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean verificarCombo(String id) {
        boolean centinela = false;
        for (Combo combo : listCombos) {
            if(combo.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean verificarEstudiante(String id) {
        boolean centinela = false;
        for (Estudiante estudiante : listEstudiantes) {
            if(estudiante.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean verificarDocente(String id) {
        boolean centinela = false;
        for (Docente docente : listDocentes) {
            if(docente.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }
    public boolean verificarVisitante(String id) {
        boolean centinela = false;
        for (Visitante visitante : listVisitantes) {
            if(visitante.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }
    public boolean verificarEmpleado(String id) {
        boolean centinela = false;
        for (Empleado empleado : listEmpleados) {
            if(empleado.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean verificarPedido(String id) {
        boolean centinela = false;
        for (Pedido pedido : listPedido) {
            if(pedido.getId().equals(id)){
                centinela = true;

            }

        }
        return centinela;
    }

    public boolean eliminarBebida(String id) {
        boolean centinela = false;
        for (Bebida bebida : listBebidas) {
            if(bebida.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean eliminarComida(String id) {
        boolean centinela = false;
        for (Comida comida : listComidas) {
            if(comida.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean eliminarCombo(String id) {
        boolean centinela = false;
        for (Combo combo : listCombos) {
            if(combo.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean eliminarEstudiante(String id) {
        boolean centinela = false;
        for (Estudiante estudiante : listEstudiantes) {
            if(estudiante.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean eliminarDocente(String id) {
        boolean centinela = false;
        for (Docente docente : listDocentes) {
            if(docente.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean eliminarVisitante(String id) {
        boolean centinela = false;
        for (Visitante visitante : listVisitantes) {
            if(visitante.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean eliminarEmpleado(String id) {
        boolean centinela = false;
        for (Empleado empleado : listEmpleados) {
            if(empleado.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean eliminarPedido(String id) {
        boolean centinela = false;
        for (Pedido pedido : listPedido) {
            if(pedido.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean agregarBebida(Bebida bebida) {
        boolean centinela = false;
        if(!verificarBebida(bebida.getId())){
            listBebidas.add(bebida);
            centinela = true;
        }
        return centinela;
    }

    public boolean agregarComida(Comida comida) {
        boolean centinela = false;
        if(!verificarComida(comida.getId())){
            listComidas.add(comida);
            centinela = true;
        }
        return  centinela;
    }

    public boolean agregarCombo(Combo combo) {
        boolean centinela = false;
        if(!verificarCombo(combo.getId())){
            listCombos.add(combo);
            centinela = true;
        }
        return centinela;
    }

    public boolean  agregarEstudiante(Estudiante estudiante) {
        boolean centinela = false;
        if(!verificarEstudiante(estudiante.getId())){
            listEstudiantes.add(estudiante);
            centinela = true;
        }
        return centinela;
    }

    public boolean  agregarDocente(Docente docente) {
        boolean centinela = false;
        if(!verificarDocente(docente.getId())){
            listDocentes.add(docente);
            centinela = true;
        }
        return centinela;
    }

    public boolean agregarVisitante(Visitante visitante) {
        boolean centinela = false;
        if(!verificarVisitante(visitante.getId())){
            listVisitantes.add(visitante);
            centinela = true;
        }
        return centinela;
    }

    public boolean  agregarEmpleado(Empleado empleado) {
        boolean centinela = false;
        if(!verificarEmpleado(empleado.getId())){
            listEmpleados.add(empleado);
            centinela = true;
        }
        return centinela;
    }

    public boolean  agregarPedido(Pedido pedido) {
        boolean centinela = false;
        if(!verificarPedido(pedido.getId())){
            listPedido.add(pedido);
            centinela = true;
        }
        return centinela;
    }

    public boolean actualizarBebida(String id, Bebida bebidaActualizada) {
        boolean centinela = false;
        for(Bebida b: listBebidas){
            if(b.getId().equals(bebidaActualizada.getId())){
                b.setId(bebidaActualizada.getId());
                b.setNombre(bebidaActualizada.getNombre());
                b.setDescripcion(bebidaActualizada.getDescripcion());
                b.setTamanio(bebidaActualizada.getTamanio());
                b.setTemperatura(bebidaActualizada.getTemperatura());
                b.setSabor(bebidaActualizada.getSabor());
                b.setPrecio(bebidaActualizada.getPrecio());
                centinela= true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarComida(String id, Comida comidaActualizada) {
        boolean centinela = false;
        for(Comida comida: listComidas){
            if(comida.getId().equals(comidaActualizada.getId())){
                comida.setId(comidaActualizada.getId());
                comida.setNombre(comidaActualizada.getNombre());
                comida.setDescripcion(comidaActualizada.getDescripcion());
                comida.setTemperatura(comidaActualizada.getTemperatura());
                comida.setCalorias(comidaActualizada.getCalorias());
                comida.setPrecio(comidaActualizada.getPrecio());
                centinela= true;
                break;
            }
        }
        return centinela;

    }

    public boolean actualizarCombo(String id, Combo comboActualizada) {
        boolean centinela = false;
        for(Combo combo: listCombos){
            if(combo.getId().equals(comboActualizada.getId())){
                combo.setId(comboActualizada.getId());
                combo.setNombre(comboActualizada.getNombre());
                combo.setDescripcion(comboActualizada.getDescripcion());
                combo.setPrecio(comboActualizada.getPrecio());
                centinela= true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarEstudiante(String id, Estudiante estudianteActualizada) {
        boolean centinela = false;
        for(Estudiante estudiante: listEstudiantes){
            if(estudiante.getId().equals(estudianteActualizada.getId())){
                estudiante.setNombre(estudianteActualizada.getNombre());
                estudiante.setId(estudianteActualizada.getId());
                estudiante.setNombreCuenta(estudianteActualizada.getNombreCuenta());
                estudiante.setIdEstudiante(estudianteActualizada.getIdEstudiante());
                centinela= true;
                break;

            }
        }
        return centinela;
    }

    public boolean actualizarDocente(String id, Docente docenteActualizada) {
        boolean centinela = false;
        for(Docente docente: listDocentes){
            if(docente.getId().equals(docenteActualizada.getId())){
                docente.setNombre(docenteActualizada.getNombre());
                docente.setId(docenteActualizada.getId());
                docente.setNombreCuenta(docenteActualizada.getNombreCuenta());
                docente.setTarjeta(docenteActualizada.getTarjeta());
                centinela= true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarVisitante(String id, Visitante visitanteActualizada) {
        boolean centinela = false;
        for(Visitante visitante: listVisitantes){
            if(visitante.getId().equals(visitanteActualizada.getId())){
                visitante.setNombre(visitanteActualizada.getNombre());
                visitante.setId(visitanteActualizada.getId());
                visitante.setNombreCuenta(visitanteActualizada.getNombreCuenta());
            }
        }
        return  centinela;
    }

    public boolean actualizarEmpleado(String id, Empleado empleadoActualizada) {
        boolean centinela = false;
        for(Empleado empleado: listEmpleados){
            if(empleado.getId().equals(empleadoActualizada.getId())){
                empleado.setNombre(empleadoActualizada.getNombre());
                empleado.setId(empleadoActualizada.getId());
                empleado.setSalario(empleadoActualizada.getSalario());
                centinela= true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarPedido(String id, Pedido pedidoActualizada) {
        boolean centinela = false;
        for(Pedido p: listPedido){
            if(p.getId().equals(pedidoActualizada.getId())){
                p.setId(pedidoActualizada.getId());
                p.setFecha(pedidoActualizada.getFecha());
                p.setHora(pedidoActualizada.getHora());
                p.setPrecioTotal(pedidoActualizada.getPrecioTotal());
            }
        }
        return  centinela;
    }

    public Bebida buscarBebida(String id){
        for(Bebida bebida: listBebidas){
            if(bebida.getId().equals(id)){
                return bebida;
            }
        }
        return null;
    }

    public Comida buscarComida(String id){
        for(Comida comida: listComidas){
            if(comida.getId().equals(id)){
                return comida;
            }
        }
        return null;
    }

    public Combo buscarCombo(String id){
        for(Combo combo: listCombos){
            if(combo.getId().equals(id)){
                return combo;
            }
        }
        return null;
    }

    public Estudiante buscarEstudiante(String id){
        for(Estudiante estudiante: listEstudiantes){
            if(estudiante.getId().equals(id)){
                return estudiante;
            }
        }
        return null;
    }

    public  Docente buscarDocente(String id){
        for(Docente docente: listDocentes){
            if(docente.getId().equals(id)){
                return docente;
            }
        }
        return null;
    }

    public Visitante buscarVisitante(String id){
        for(Visitante visitante: listVisitantes){
            if(visitante.getId().equals(id)){
                return visitante;
            }
        }
        return null;
    }

    public  Empleado buscarEmpleado(String id){
        for(Empleado empleado: listEmpleados){
            if(empleado.getId().equals(id)){
                return empleado;
            }
        }
        return null;
    }

    public Pedido buscarPedido(String id){
        for(Pedido pedido: listPedido){
            if(pedido.getId().equals(id)){
                return pedido;
            }
        }
        return null;
    }

    public boolean esEmpleado(String id){
        boolean esempleado = false;
        for(Empleado empleado: listEmpleados){
            if(empleado.getId().equals(id)){
                esempleado = true;
            }
        }
        return esempleado;
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

    public List<Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }

    public void setListEstudiantes(List<Estudiante> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }

    public List<Docente> getListDocentes() {
        return listDocentes;
    }

    public void setListDocentes(List<Docente> listDocentes) {
        this.listDocentes = listDocentes;
    }

    public List<Visitante> getListVisitantes() {
        return listVisitantes;
    }

    public void setListVisitantes(List<Visitante> listVisitantes) {
        this.listVisitantes = listVisitantes;
    }

    public List<Empleado> getListEmpleados() {
        return listEmpleados;
    }

    public void setListEmpleados(List<Empleado> listEmpleados) {
        this.listEmpleados = listEmpleados;
    }

    public List<Pedido> getListPedido() {
        return listPedido;
    }

    public void setListPedido(List<Pedido> listPedido) {
        this.listPedido = listPedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEslogan() {
        return eslogan;
    }

    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }
}

