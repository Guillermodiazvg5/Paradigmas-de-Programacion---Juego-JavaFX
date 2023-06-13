




package juegoMatematicasInfantiles123.Controller;

import java.io.IOException;
import javafx.event.ActionEvent;                    // generado con   scene Builders
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Class Juego
 */
public class Juego {

  //
  // Fields 
   private Stage ventana3 ; 
   
                                                    // generado con   scene Builder
   
   @FXML
    void mostarVentana_4(ActionEvent event) throws IOException {              

        FXMLLoader carga = new FXMLLoader(getClass().getResource("/juegoMatematicasInfantiles123/Ventana_4.fxml"));
        Parent raiz = carga.load();
        Juego controlador = carga.getController();
        Scene escena4 = new Scene(raiz);
        Stage ventana4 = new Stage();                    // creamos la ventana desde cero a diferencia del Main que genera desde el inicio primaryStage
        ventana4.setScene(escena4);                 // montamos la escena4  en la ventana principal 4
        controlador.funcionesVentana4(ventana4 ,this);
        ventana4.show();
        ventana3.close();
    }
    
      @FXML
    void empezarJuegoMostarVentana_5(ActionEvent event) {

    }

    @FXML
    void realizarDivisiones(ActionEvent event) {

    }

    @FXML
    void realizarMultiplicaciones(ActionEvent event) {

    }

    @FXML
    void realizarRestas(ActionEvent event) {

    }

    @FXML
    void realizarSumas(ActionEvent event) {

    }
    
  //

  private String descripcion;
  private Jugador jugador;
  private Preguntas pregunta;
  private Operaciones operacion;
  
  //
  // Constructors
  //
  public Juego () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of descripcion
   * @param newVar the new value of descripcion
   */
  public void setDescripcion (String newVar) {                  // Ventana Instrucciones y recompensas del juego .
    descripcion = newVar;
  }

  /**
   * Get the value of descripcion
   * @return the value of descripcion
   */
  public String getDescripcion () {
    return descripcion;
  }

  /**
   * Set the value of jugador
   * @param newVar the new value of jugador
   */
   public void setJugador (Jugador newVar) {
    jugador = newVar;
  }

  /**
   * Get the value of jugador
   * @return the value of jugador
   */
  public Jugador getJugador () {
    return jugador;
  }

  /**
   * Set the value of pregunta
   * @param newVar the new value of pregunta
   */
  public void setPregunta (Preguntas newVar) {
    pregunta = newVar;
  }

  /**
   * Get the value of pregunta
   * @return the value of pregunta
   */
  public Preguntas getPregunta () {
    return pregunta;
  }

  /**
   * Set the value of operacion
   * @param newVar the new value of operacion
   */
  public void setOperacion (Operaciones newVar) {
    operacion = newVar;
  }

  /**
   * Get the value of operacion
   * @return the value of operacion
   */
  public Operaciones getOperacion () {
    return operacion;
  }

  //
  // Other methods
  //

  /**
   */
  public void iniciarJuego()
  {
  }


  /**
   * Permite elegir sobre cual de las 4 operaciones van a ser las preguntas
   */
  public void seleccionarOperacion()                           // ventana seleccion de operaciones 
  {
  }


  /**
   * Califica si la respuesta es correcta o incorrecta
   */
  public void calificar()
  {
  }


  /**
   * Cuando el jugador se equivoca muetsra mensaje explicando el error
   * @return       String
   */
  public String explicarError()
  {
      System.out.println("N/A.");
      return null;
  }


  /**
   */
  public void salirDelJuego()
  {
  }

    public void colocarVentana(Stage primaryStage) {      // metodo autogenerado desde el Main 
       
        ventana3 = primaryStage;   // guarda la ventana que creamos en el Main 
    }

    private void funcionesVentana4(Stage ventana4, Juego aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
        
    }

   


}
