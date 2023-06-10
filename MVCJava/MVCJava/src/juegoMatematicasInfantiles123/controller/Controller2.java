package juegoMatematicasInfantiles123.controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller2 {

    @FXML
    private Stage stage; // Usar el atributo stage
    
    @FXML
private Label label2;

    @FXML
    void showVentana3(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/juegoMatematicasInfantiles123/view/Ventana3.fxml"));
        Parent root = loader.load();
        Controller3 controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = (Stage) label2.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        this.stage.close();
    }

    public void setStage(Stage primaryStage) {
        stage = primaryStage;
    }
}

