package juegoMatematicasInfantiles123.model;



/**
 * Class Juego
 */
public class Juego {

  //
  // 
  //

  private String descripcion;
  private Jugador jugador;
  private Preguntas pregunta;
  
  //
  // Constructors
  //

    public Juego(String descripcion, Jugador jugador, Preguntas pregunta) {
        this.descripcion = descripcion;
        this.jugador = jugador;
        this.pregunta = pregunta;       
    }
  
  
  //
  // Setters and getters
  //

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Preguntas getPregunta() {
        return pregunta;
    }

    public void setPregunta(Preguntas pregunta) {
        this.pregunta = pregunta;
    }

      
  //Class methods

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
