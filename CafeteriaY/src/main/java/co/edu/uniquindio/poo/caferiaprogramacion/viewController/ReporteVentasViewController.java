package co.edu.uniquindio.poo.caferiaprogramacion.viewController;

import co.edu.uniquindio.poo.caferiaprogramacion.App;
import co.edu.uniquindio.poo.caferiaprogramacion.controller.EmpleadoController;
import co.edu.uniquindio.poo.caferiaprogramacion.controller.ReporteVentasController;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Cafeteria;
import co.edu.uniquindio.poo.caferiaprogramacion.model.DetallePedido;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ReporteVentasViewController {
    private Cafeteria cafeteria;
    private ReporteVentasController reporteVentasController;
    private App app;

    public ReporteVentasViewController() {}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblComidasVendidas, lblBebidasVendidas, lblCombosVendidos, lblFecha;

    @FXML
    private DatePicker dtpFecha;

    @FXML
    private Button btnRegresar, btnComidasVendidas,btnBebidasVendidas, btnCombosVendidos;

    public void setReporteVentasController(ReporteVentasController reporteVentasController) {
        this.reporteVentasController = reporteVentasController;
    }

    public void setApp(App app) {
        this.app = app;
        if(this.reporteVentasController!= null){
            this.reporteVentasController.setApp(app);
        }
    }

    @FXML
    void OnActionRegresar(){
        reporteVentasController.regresarCrudEmpleado();

    }
    @FXML
    void OnActionComidasVendidas(){}

    @FXML
    void OnActionBebidasVendidas(){}

    @FXML
    void OnActionCombosVendidos(){}




}
