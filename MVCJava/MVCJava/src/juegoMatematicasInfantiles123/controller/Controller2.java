
package juegoMatematicasInfantiles123.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class controller2 {
    
    private controller1 controlador1 ;
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

    
   

    void init(Stage stage, controller1 aThis) {
        this.controlador1 = aThis ;
        this.stage = stage;
    }

    

}




