/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package juegoMatematicasInfantiles123.application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import juegoMatematicasInfantiles123.Controller.controller1;
import javafx.scene.layout.BorderPane;


/**
 *
 * @author Acer
 */
public class Main extends Application {
    
    
    public static void main(String[] args) {
        launch(args);
    }
    /**
     *
     * @param primaryStage
     * @throws IOException
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/juegoMatematicasInfantiles123.view/Ventana1.fxml")); // carga la vista1 con sus atributos 
        Parent root = loader.load();
        Scene scene =new Scene(root);                   // creamos la escena
        primaryStage.setScene(scene);                        // la ventana Stage mostrar la escena
        controller1 controller = loader.getController();                         // carga la vista ( loader ) al controlador1
        controller.setStage(primaryStage);                   // creamos un metodo del controlador para enviar la ventana
        primaryStage.show();                                 // mostramos la ventana
    }

    /**
     * @param args the command line arguments
     */
    
    
}
