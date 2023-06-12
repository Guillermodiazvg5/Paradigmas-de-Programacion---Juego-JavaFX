package juegoMatematicasInfantiles123.model;



/**
 * Class Preguntas
 */
public class Preguntas {

  //
  // Fields
  //

  
  private String enunciado;
  private int respuesta;
  private int suma[]=new int[5];
  private int resta[]=new int[5];
  private int multiplicacion[]=new int[5];
  private int division[]=new int[5];
  private int operador1;
  private int operador2;
  
  //
  // Constructors
  //

    public Preguntas(String enunciado, int respuesta, int operador1, int operador2) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
        this.operador1 = operador1;
        this.operador2 = operador2;
    }
    
  //
  // Setters y getters
  //

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public int[] getSuma() {
        return suma;
    }

    public void setSuma(int[] suma) {
        this.suma = suma;
    }

    public int[] getResta() {
        return resta;
    }

    public void setResta(int[] resta) {
        this.resta = resta;
    }

    public int[] getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(int[] multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public int[] getDivision() {
        return division;
    }

    public void setDivision(int[] division) {
        this.division = division;
    }

    public int getOperador1() {
        return operador1;
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public int getOperador2() {
        return operador2;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
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
