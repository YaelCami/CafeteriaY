package co.edu.uniquindio.poo.caferiaprogramacion.viewController;

import co.edu.uniquindio.poo.caferiaprogramacion.App;
import co.edu.uniquindio.poo.caferiaprogramacion.controller.GestionProductoController;
import co.edu.uniquindio.poo.caferiaprogramacion.controller.PedidosController;
import co.edu.uniquindio.poo.caferiaprogramacion.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PedidosViewController {
    private PedidosController pedidosController;
    private Cafeteria cafeteria;
    private Pedido pedido;
    private App app;

    public PedidosViewController(){

    }
    public void setPedidosController(PedidosController pedidosController){
        this.pedidosController = pedidosController;
        if(this.app != null){
            this.pedidosController.setApp(app);
        }
    }

    public void setApp(App app) {
        this.app = app;
        if(this.pedidosController!= null){
            this.pedidosController.setApp(app);
        }

    }
    @FXML
    private Label lblPedido,lblComida, lblBebida, lblCombo, lblId, lblFecha, lblHora, lblRecomendado;

    @FXML
    private TextField txtHora,txtId;

    @FXML
    private ComboBox<Bebida> cbxbebida;

    @FXML
    private ComboBox<Comida> cbxComida;

    @FXML
    private ComboBox<Combo> cbxCombo;

    @FXML
    private DatePicker dtpFecha;

    @FXML
    private Button btnAgregar, btnEliminar, btnActualizar, btnRegresar, btnRecomendacion, btnPrecioTotal;

    @FXML
    private TableView<DetallePedido> tbPedido;

    @FXML
    private TableColumn<DetallePedido, String> tbcNombre;

    @FXML
    private TableColumn<DetallePedido, Double> tbcPrecio, tbcSubtotal;

    @FXML
    private TableColumn<DetallePedido, Integer> tbcCantidad;

    @FXML
    void OnActionAgregar() {}

    @FXML
    void OnActionEliminar() {}
    @FXML
    void OnActionActualizar() {}

    @FXML
    void OnActionRegresar() {
        pedidosController.regresarCrudEmpleado();
    }

    @FXML
    void OnActionRecomendar() {}

    @FXML
    void OnActionPrecioTotal() {}
}
