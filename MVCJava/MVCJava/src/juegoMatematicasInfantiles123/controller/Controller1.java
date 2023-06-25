package juegoMatematicasInfantiles123.Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class controller1 {

    private Stage stage ;
    
    
    @FXML
    void showVentana2(ActionEvent event) throws IOException {
        
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/juegoMatematicasInfantiles123.view/Ventana2.fxml")); // carga la vista1 con sus atributos 
        Parent root = loader.load();
        controller2 controller = loader.getController();
        Scene scene = new Scene(root); 
        Stage stage = new Stage() ;
        stage.setScene(scene);
        
        controller.init(stage ,this);
        
        stage.show();                                    // mostramos esta ventana # 2
        this.stage.close();                              // cerramos la ventana # 1
        
        

    }

    public void setStage(Stage primaryStage) {                   // metodo set generado desde el Main 
        
        stage = primaryStage ;                                  // guarda la ventana que viene desde el MAIN 
        
    }

   
}