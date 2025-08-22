module co.edu.uniquindio.poo.caferiaprogramacion {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.caferiaprogramacion to javafx.fxml;
    opens co.edu.uniquindio.poo.caferiaprogramacion.viewController to javafx.fxml;
    opens co.edu.uniquindio.poo.caferiaprogramacion.controller to javafx.fxml;
    opens co.edu.uniquindio.poo.caferiaprogramacion.model to javafx.fxml;
    exports co.edu.uniquindio.poo.caferiaprogramacion;
}