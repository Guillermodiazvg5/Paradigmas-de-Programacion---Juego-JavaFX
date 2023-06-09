package juegoMVD;



/**
 * Class Juego
 */
public class Juego {

  //
  // Fields
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
  public void setDescripcion (String newVar) {
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
  public void seleccionarOperacion()
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
      System.out.println("N/A");
      return null;
  }


  /**
   */
  public void salirDelJuego()
  {
  }


}
