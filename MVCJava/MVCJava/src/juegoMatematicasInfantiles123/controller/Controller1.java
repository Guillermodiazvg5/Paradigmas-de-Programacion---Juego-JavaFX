package juegoMatematicasInfantiles123.controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller1 {
    
    private Stage stage;

    @FXML
    void showVentana2(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/juegoMatematicasInfantiles123/view/Ventana2.fxml"));
        Parent root = loader.load();
        Controller2 controller = loader.getController();
        controller.setStage(stage);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        this.stage.close();
        // comentario 
    }

    public void setStage(Stage primaryStage) {
        stage = primaryStage;
    }

}