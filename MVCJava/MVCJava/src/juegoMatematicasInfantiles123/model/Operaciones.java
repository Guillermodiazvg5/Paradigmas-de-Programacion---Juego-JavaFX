package juegoMatematicasInfantiles123.model;





/**
 * Class Operaciones
 */
public class Operaciones {

  //
  // Fields
  //

  private String nombre;
  private String descripcion;
  private int operador1;
  private int operador2;
  private int resultado;
  /**
   * Esto seria una lista de objetos de tipo pregunta
   */
  private Preguntas preguntas;
  
  //
  // Constructors
  //
  public Operaciones () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

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
   * Set the value of operador1
   * @param newVar the new value of operador1
   */
  public void setOperador1 (int newVar) {
    operador1 = newVar;
  }

  /**
   * Get the value of operador1
   * @return the value of operador1
   */
  public int getOperador1 () {
    return operador1;
  }

  /**
   * Set the value of operador2
   * @param newVar the new value of operador2
   */
  public void setOperador2 (int newVar) {
    operador2 = newVar;
  }

  /**
   * Get the value of operador2
   * @return the value of operador2
   */
  public int getOperador2 () {
    return operador2;
  }

  /**
   * Set the value of resultado
   * @param newVar the new value of resultado
   */
  public void setResultado (int newVar) {
    resultado = newVar;
  }

  /**
   * Get the value of resultado
   * @return the value of resultado
   */
  public int getResultado () {
    return resultado;
  }

  /**
   * Set the value of preguntas
   * Esto seria una lista de objetos de tipo pregunta
   * @param newVar the new value of preguntas
   */
  public void setPreguntas (Preguntas newVar) {
    preguntas = newVar;
  }

  /**
   * Get the value of preguntas
   * Esto seria una lista de objetos de tipo pregunta
   * @return the value of preguntas
   */
  public Preguntas getPreguntas () {
    return preguntas;
  }

  //
  // Other methods
  //

  /**
   * Realzia el calculo
   */
  public void realizarOperacion()
  {
  }


  /**
   * genera los numeros a operar aleatoriamente
   */
  public void obtenerOperadores()
  {
  }


  /**
   */
  public void verficarRespuesta()
  {
  }


}
