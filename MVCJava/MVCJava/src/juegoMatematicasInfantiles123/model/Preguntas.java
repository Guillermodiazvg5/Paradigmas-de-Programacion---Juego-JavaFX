package juegoMatematicasInfantiles123.model;



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

    public Preguntas(String enunciado, int respuesta) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
    }

  public String getEnunciado()
  {
      return enunciado ;
  }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getRespuesta() {
        return respuesta;
    }

    //
    // Setter y Getters
    //
    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    //
    // Class methods
    //
    /**
     * Genera la pregunta que se le va a presentar al jugador
     * @return       String
     */
    public String generarPreguntas() {
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
