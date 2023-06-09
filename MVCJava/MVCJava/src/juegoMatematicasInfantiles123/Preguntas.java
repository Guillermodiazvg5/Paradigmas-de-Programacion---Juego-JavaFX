package juegoMVD;



/**
 * Class Preguntas
 */
public class Preguntas {

  //
  // Fields
  //

  /**
   * Enunciado de la pregunta
   */
  private String enunciado;
  /**
   * respuesta de la pregunta
   */
  private int respuesta;
  
  //
  // Constructors
  //
  public Preguntas () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of enunciado
   * Enunciado de la pregunta
   * @param newVar the new value of enunciado
   */
  public void setEnunciado (String newVar) {
    enunciado = newVar;
  }

  /**
   * Get the value of enunciado
   * Enunciado de la pregunta
   * @return the value of enunciado
   */
  public String getEnunciado () {
    return enunciado;
  }

  /**
   * Set the value of respuesta
   * respuesta de la pregunta
   * @param newVar the new value of respuesta
   */
  public void setRespuesta (int newVar) {
    respuesta = newVar;
  }

  /**
   * Get the value of respuesta
   * respuesta de la pregunta
   * @return the value of respuesta
   */
  public int getRespuesta () {
    return respuesta;
  }

  //
  // Other methods
  //

  /**
   * Genera la pregunta que se le va a presentar al jugador
   * @return       String
   */
  public String generarPreguntas()
  {
      return null ;
  }


  /**
   * Verifica si la respuesta es correcta o no
   * @return       boolean
   */
  public boolean verificarResuestas()
  {
      return true ;
  }
  


}
