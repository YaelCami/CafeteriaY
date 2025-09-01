package co.edu.uniquindio.poo.caferiaprogramacion.viewController;

import co.edu.uniquindio.poo.caferiaprogramacion.App;
import co.edu.uniquindio.poo.caferiaprogramacion.controller.GestionProductoController;
import co.edu.uniquindio.poo.caferiaprogramacion.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class GestionProductoViewController {
    private GestionProductoController gestionProductoController;
    private Cafeteria cafeteria;
    private App app;
    private Producto producto;

    public GestionProductoViewController(){
    }

    public void setGestionProductoController(GestionProductoController gestionProductoController){
        this.gestionProductoController = gestionProductoController;
        if(this.app != null){
            this.gestionProductoController.setApp(app);
        }
    }

    public void setApp(App app) {
        this.app = app;
        if(this.gestionProductoController!= null){
            this.gestionProductoController.setApp(app);
        }

    }


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblGestionProducto,lblNombre, lblId, lblDescripcion, lblPrecio, lblTipo, lblCalorias, lblTemperaturaC, lblSabor, lblTamanio, lblTemperaturaB;

    @FXML
    private TextField txtNombre, txtId, txtDescripcion, txtPrecio, txtCalorias, txtSabor;

    @FXML
    private ComboBox<TipoProducto> cbxTipoProducto;

    @FXML
    private ComboBox<Temperatura> cbxTemperaturaB;

    @FXML
    private ComboBox<Temperatura> cbxTemperaturaC;

    @FXML
    private ComboBox<Tamanio> cbxTamanio;

    @FXML
    private Button btnAgregar, btnEliminar, btnActualizar, btnRegresar;

    @FXML
    private TableView<Producto> tbProductos;

    @FXML
    private TableColumn<Producto, String> tbcNombre, tbcId, tbcDescripcion;

    @FXML
    private TableColumn<Producto, Double> tbcPrecio;

    @FXML
    private TableColumn<Producto, TipoProducto> tbcTipo;

    @FXML
    void OnActionAgregar(){

    }




    @FXML
    void OnActionEliminar(){

    }
    @FXML
    void OnActionActualizar(){

    }

    @FXML
    void OnActionRegresar(){
        gestionProductoController.regresarCrudEmpleado();

    }


}
