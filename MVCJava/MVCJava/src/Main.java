/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import juegoMatematicasInfantiles123.Controller.Juego;


/**
 *
 * @author guill
 */
public class Main extends Application {              // El Main es lo primero que se va a correr
    
    @Override
    public void start(Stage ventana3) throws IOException {
       FXMLLoader carga = new FXMLLoader(getClass().getResource("/juegoMatematicasInfantiles123/Ventana3.fxml"));  // carga el archivo fxml de Ventana_3                                // carga la vista con todos sus atributos
       Parent raiz = carga.load();                   // nos carga la ventana
       Scene escena3 = new Scene(raiz);         // creamos la escena1 con el  Padre raiz de la ventana3
       ventana3.setScene(escena3);          // ventana completa seteamos la escena1  para que la ventana principal muestre esta escena
    Juego controlador = carga.getController();       // creamos el controlador 
    
    controlador.colocarVentana(ventana3);        // creamos el metodo colocarVentana´para enviar la ventana que vamos a visualizar
    ventana3.show();                             // para mostrar la ventana 
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
