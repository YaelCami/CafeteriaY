package co.edu.uniquindio.poo.caferiaprogramacion.model;

public class Estudiante extends Cliente{
    private String idEstudiante;

    public Estudiante(String nombre, String id,String nombreCuenta, String idEstudiante){
        super(nombre, id, nombreCuenta);
        this.idEstudiante=idEstudiante;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
}
