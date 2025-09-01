package co.edu.uniquindio.poo.caferiaprogramacion;

import co.edu.uniquindio.poo.caferiaprogramacion.controller.*;
import co.edu.uniquindio.poo.caferiaprogramacion.viewController.*;
import javafx.application.Application;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Cafeteria;
import co.edu.uniquindio.poo.caferiaprogramacion.model.Empleado;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private Stage primaryStage;
    private Cafeteria cafeteria = new Cafeteria("Manifiesto", "Siempre bien");

    public static void main(String[] args) {
        launch(args);
    }

    public Cafeteria getCafeteria() {
        return cafeteria;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Cafeteria");
        openViewPrincipal();
    }

    public void openViewPrincipal() {
        inicializarData();
        try{FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("crudPrimary.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            PrimaryViewController primaryViewController = loader.getController();
            PrimaryController primaryController = new PrimaryController(cafeteria);
            primaryViewController.setPrimaryController(primaryController);
            primaryViewController.setApp(this);


            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }





    public void openCrudEmpleado(Empleado empleado) {
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("crudEmpleado.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            EmpleadoViewController viewController = loader.getController();
            EmpleadoController controller = new EmpleadoController();
            controller.setApp(this);
            controller.setEmpleado(empleado);
            viewController.setEmpleadoController(controller);
            viewController.setEmpleado(empleado);
            viewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openGestionProducto(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("crudGestionProducto.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            GestionProductoViewController viewController = loader.getController();
            GestionProductoController controller = new GestionProductoController();
            viewController.setGestionProductoController(controller);
            controller.setApp(this);
            viewController.setApp(this);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void openGestionClientes(Empleado empleado){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("crudGestionCliente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            GestionClienteViewController viewController = loader.getController();
            GestionClienteController controller = new GestionClienteController(cafeteria);
            viewController.setGestionClienteController(controller);
            controller.setApp(this);
            controller.setEmpleado(empleado);
            controller.setCafeteria(cafeteria);
            viewController.setApp(this);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void openTomarPedido(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("crudPedidos.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            PedidosViewController viewController = loader.getController();
            PedidosController controller = new PedidosController();
            viewController.setPedidosController(controller);
            controller.setApp(this);
            viewController.setApp(this);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void openReporteVenta(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("crudReporteVentas.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            ReporteVentasViewController viewController = loader.getController();
            ReporteVentasController controller = new ReporteVentasController();
            viewController.setReporteVentasController(controller);
            controller.setApp(this);
            viewController.setApp(this);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }




    public void inicializarData() {
        Empleado empleado1 = new Empleado("Sara", "236", 600000);
        cafeteria.agregarEmpleado(empleado1);

        Empleado empleado2 = new Empleado("Juan", "123", 800000);
        cafeteria.agregarEmpleado(empleado2);
    }

}
