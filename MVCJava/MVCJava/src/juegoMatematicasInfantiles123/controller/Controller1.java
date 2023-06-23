package juegoMatematicasInfantiles123.Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller1 {                     // controlador ventana # 1
    
    private Stage stage;

    @FXML
    void showVentana2(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/juegoMatematicasInfantiles123.view/Ventana2.fxml"));
        Parent root = loader.load();
        Controller2 controller = loader.getController();
        controller.setStage(stage);
        Scene scene = new Scene(root);
        Stage stage = new Stage();                // creamos la ventana
        stage.setScene(scene);
        controller.init(stage,this);             // Ventana 2
        stage.show();                            // mostramos ventana 2
        this.stage.close();                     // cerramos ventana 1
        
    }

    public void setStage(Stage primaryStage) {         // autogenerado desde el Main 
        stage = primaryStage;                          // guarde la ventana enviada desde el Main .
    }

}