package co.edu.uniquindio.poo.caferiaprogramacion.viewController;

import co.edu.uniquindio.poo.caferiaprogramacion.App;
import co.edu.uniquindio.poo.caferiaprogramacion.controller.EmpleadoController;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Empleado;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class EmpleadoViewController {
    private EmpleadoController empleadoController;
    private App app;
    private Empleado empleado;

    public EmpleadoViewController() {

    }
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblNombre, lblHacer;

    @FXML
    Button btnGestionProducto, btnRegistrarCliente, btnTomarPedido, btnReporteVentas,btnRegresar;

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setEmpleadoController(EmpleadoController empleadoController) {
        this.empleadoController = empleadoController;
    }

    @FXML
    void OnActionGestionProducto() {

    }
    @FXML
    void OnActionRegistrarCliente() {

    }
    @FXML
    void OnActionRegresar(){}

    @FXML
    void OnActionTomarPedido() {

    }

    @FXML
    void OnActionReporteVentas() {

    }

    public void setApp(App app) {
        this.app = app;
        if(this.empleadoController!= null){
            this.empleadoController.setApp(app);
        }

    }

    @FXML
    void initialize() {
        System.out.println("CrudEmpleado inicializado");

    }
}
