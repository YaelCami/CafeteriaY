package co.edu.uniquindio.poo.caferiaprogramacion.viewController;

import co.edu.uniquindio.poo.caferiaprogramacion.App;
import co.edu.uniquindio.poo.caferiaprogramacion.controller.GestionClienteController;
import co.edu.uniquindio.poo.caferiaprogramacion.controller.GestionProductoController;
import co.edu.uniquindio.poo.caferiaprogramacion.model.*;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class GestionClienteViewController {
    private GestionClienteController gestionClienteController;
    private App app;
    ObservableList<Cliente> listClientes = FXCollections.observableArrayList();
    Cliente selectedCliente;

    public GestionClienteViewController(){
    }

    public void setGestionClienteController(GestionClienteController gestionClienteController){
        this.gestionClienteController = gestionClienteController;
        this.gestionClienteController.setApp(app);
        obtenerClientes();

    }

    public void setApp(App app) {
        this.app = app;
        if(this.gestionClienteController!= null){
            this.gestionClienteController.setApp(app);
        }

    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblGestionClientes,lblNombre, lblId, lblTipoCliente, lblIdEstudiante, lblNombreCuenta,lblIdDocente;

    @FXML
    private TextField txtNombre, txtId, txtIdEstudiante, txtNombreCuenta, txtIdDocente;

    @FXML
    private ComboBox<TipoCliente> cbxTipoCliente;

    @FXML
    private TableView<Cliente> tbClientes;

    @FXML
    private TableColumn<Cliente, String> tbcNombre, tbcId,tbcNombreCuenta;

    @FXML
    private TableColumn<Cliente, TipoCliente> tbcTipo;

    @FXML
    private Button btnAgregar, btnEliminar, btnActualizar, btnRegresar;

    @FXML
    private AnchorPane anpEstudiante, anpDocente;

    @FXML
    void OnActionAgregar(){
        agregarCliente();

    }

    private void agregarCliente() {
        try {
            Cliente cliente = buildCliente();
            if (cliente == null) {
                mostrarAlerta("Error", "Por favor completa todos los campos.");
                return;
            }
            if (gestionClienteController.agregarCliente(cliente)) {
                listClientes.add(cliente);
                limpiarCampos();
            } else {
                mostrarAlerta("Error", "No se pudo agregar el usuario.");
            }
        } catch (Exception e) {
            mostrarAlerta("Error", "Datos inválidos: " + e.getMessage());
        }
    }
    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    @FXML
    public void initialize() {
        cbxTipoCliente.setItems(FXCollections.observableArrayList(TipoCliente.values()));

        mostrarCampos(false);
        listenerSelection();

        cbxTipoCliente.setOnAction(event -> {
            TipoCliente seleccionado = cbxTipoCliente.getValue();
            if (seleccionado == TipoCliente.ESTUDIANTE) {
                mostrarCamposEstudiante();
            }
            else if(seleccionado == TipoCliente.DOCENTE){
                mostrarCamposDocente();
            }

            });



        tbcNombre.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getNombre()));
        tbcId.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getId()));
        tbcNombreCuenta.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getNombreCuenta()));
        tbcTipo.setCellValueFactory(cellData ->
                new SimpleObjectProperty<>(cellData.getValue().getTipoCliente()));

    }

    private Cliente buildCliente() {
        String nombre = txtNombre.getText();
        String id = txtId.getText().trim();
        String nombreCuenta = txtNombreCuenta.getText().trim();

        TipoCliente tipoCliente= cbxTipoCliente.getValue();
        Cliente cliente;
        if (tipoCliente == TipoCliente.ESTUDIANTE){
            String idEstudiante = txtIdEstudiante.getText().trim();
            cliente = new Estudiante(nombre, id, nombreCuenta, idEstudiante, tipoCliente);
            return cliente;
        }
        else if (tipoCliente == TipoCliente.DOCENTE){
            String idDocente = txtIdDocente.getText().trim();
            cliente = new Docente(nombre, id, nombreCuenta, tipoCliente, idDocente);
            return cliente;
        }
        else if (tipoCliente == TipoCliente.VISITANTE){
            cliente  = new Visitante(nombre, id, nombreCuenta, tipoCliente);
            return cliente;
        }
        else {
            return null;
        }

    }

    public void obtenerClientes() {
        List<Cliente> clientes = gestionClienteController.obtenerClientes();
        if (clientes !=null){
            listClientes.setAll(clientes);
            tbClientes.setItems(listClientes);
        }
        else {
            tbClientes.getItems().clear();
        }
    }

    private void listenerSelection() {
        tbClientes.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedCliente = newSelection;
            mostrarInformacionCliente(selectedCliente);
        });
    }

    private void mostrarInformacionCliente(Cliente cliente) {
        if (cliente != null) {
            txtNombre.setText(cliente.getNombre());
            txtId.setText( cliente.getId());
            txtNombreCuenta.setText(cliente.getNombreCuenta());
            cbxTipoCliente.setValue(cliente.getTipoCliente());
            if (cliente.getTipoCliente() == TipoCliente.ESTUDIANTE) {
                mostrarCamposEstudiante();
                if(cliente instanceof Estudiante ){
                    Estudiante estudiante = (Estudiante) cliente;
                    txtIdEstudiante.setText(estudiante.getIdEstudiante());
                }
            }
            if (cliente.getTipoCliente() == TipoCliente.DOCENTE) {
                mostrarCamposDocente();
                if(cliente instanceof Docente ){
                    Docente docente = (Docente) cliente;
                    txtIdDocente.setText(docente.getIdDocente());
                }
            }
        }
    }

    private void limpiarCampos() {
        txtNombre.clear();
        txtId.clear();
        txtNombreCuenta.clear();
        cbxTipoCliente.setValue(null);

        mostrarCampos(false);
    }

    private void mostrarCamposEstudiante() {
        anpEstudiante.setVisible(true);
        lblIdEstudiante.setVisible(true);
        txtIdEstudiante.setVisible(true);

        lblIdDocente.setVisible(false);
        txtIdDocente.setVisible(false);
    }

    private void mostrarCamposDocente() {
        anpDocente.setVisible(true);
        lblIdEstudiante.setVisible(false);
        txtIdEstudiante.setVisible(false);

        lblIdDocente.setVisible(true);
        txtIdDocente.setVisible(true);
    }

    private void mostrarCampos(boolean visible) {
        lblIdEstudiante.setVisible(visible);
        txtIdEstudiante.setVisible(visible);
        lblIdDocente.setVisible(visible);
        txtIdDocente.setVisible(visible);
    }
    @FXML
    void OnActionEliminar(){}

    @FXML
    void OnActionActualizar(){}

    @FXML
    void OnActionRegresar(){
        gestionClienteController.regresarCrudEmpleado();
    }

}



