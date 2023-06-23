package juegoMatematicasInfantiles123.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller2 {

    private Controller1 controladorVentana1 ;
    private Stage stage ;
    
    @FXML
    private Label label2;

    @FXML
    private TextField textBox;

    @FXML
    private TextField textBox1;

    @FXML
    void mostarVentana_3(ActionEvent event) {

    }

    @FXML
    void showVentana3(ActionEvent event) {

    }

    void setStage(Stage stage) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void init(Stage stage, Controller1 aThis ) {
       
    
       this.controladorVentana1 = aThis; 
       this.stage = stage;
        
        
    }

}
