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

    public Operaciones(String nombre, String descripcion, int operador1, int operador2, int resultado, Preguntas preguntas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.operador1 = operador1;
        this.operador2 = operador2;
        this.resultado = resultado;
        this.preguntas = preguntas;
    }
 

  //
  // Setters y Getters
  //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public Preguntas getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Preguntas preguntas) {
        this.preguntas = preguntas;
    }

  
    
  //
  // Class methods
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
