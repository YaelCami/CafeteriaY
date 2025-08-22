package co.edu.uniquindio.poo.caferiaprogramacion.viewController;

import co.edu.uniquindio.poo.caferiaprogramacion.App;
import co.edu.uniquindio.poo.caferiaprogramacion.controller.PrimaryController;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Empleado;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class PrimaryViewController {
    private PrimaryController primaryController;
    private App app;
    private Empleado empleado;

    public PrimaryViewController() {


    }
    public void setPrimaryController(PrimaryController primaryController) {
        this.primaryController = primaryController;
        if(this.app != null){
            this.primaryController.setApp(app);
        }
    }
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblCafeteria, lblId;

    @FXML
    private TextField txtId;

    @FXML
    private Button btnIngresar;


    @FXML
    void OnActionIngresar() {
        System.out.println("Click en Ingresar");
        String id = txtId.getText();
        System.out.println("Id ingresado " + id);
        boolean redireccionando = primaryController.redireccionarEmpleado(id);
        System.out.println("Redireccionando "+redireccionando);
    }

    public void setApp(App app) {
        this.app = app;
        if(this.primaryController != null){
            this.primaryController.setApp(app);
        }

    }

    @FXML
    void initialize() {
        System.out.println("CrudEmpleado inicializado");

    }




}
