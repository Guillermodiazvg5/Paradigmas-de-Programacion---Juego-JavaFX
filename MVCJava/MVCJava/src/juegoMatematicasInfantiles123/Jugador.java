package juegoMatematicasInfantiles123;



/**
 * Class Jugador
 */
public class Jugador {

  //
  // Fields
  //

  /**
   * Guarda el nombre del jugador
   */
  private String nombre;
  /**
   * Guarda la edad del jugador
   */
  private int edad;
  private mascotaVirtual listaMascota;
  private int puntaje;
  private int aciertosConsecutivos;
  
  //
  // Constructors
  //
  public Jugador () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * Guarda el nombre del jugador
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * Guarda el nombre del jugador
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of edad
   * Guarda la edad del jugador
   * @param newVar the new value of edad
   */
  public void setEdad (int newVar) {
    edad = newVar;
  }

  /**
   * Get the value of edad
   * Guarda la edad del jugador
   * @return the value of edad
   */
  public int getEdad () {
    return edad;
  }

  /**
   * Set the value of listaMascota
   * @param newVar the new value of listaMascota
   */
  public void setListaMascota (mascotaVirtual newVar) {
    listaMascota = newVar;
  }

  /**
   * Get the value of listaMascota
   * @return the value of listaMascota
   */
  public mascotaVirtual getListaMascota () {
    return listaMascota;
  }

  /**
   * Set the value of puntaje
   * @param newVar the new value of puntaje
   */
  public void setPuntaje (int newVar) {
    puntaje = newVar;
  }

  /**
   * Get the value of puntaje
   * @return the value of puntaje
   */
  public int getPuntaje () {
    return puntaje;
  }

  /**
   * Set the value of aciertosConsecutivos
   * @param newVar the new value of aciertosConsecutivos
   */
  public void setAciertosConsecutivos (int newVar) {
    aciertosConsecutivos = newVar;
  }

  /**
   * Get the value of aciertosConsecutivos
   * @return the value of aciertosConsecutivos
   */
  public int getAciertosConsecutivos () {
    return aciertosConsecutivos;
  }

  //
  // Other methods
  //

  /**
   * Agrega mascota al arreglo de mascotas del jugador
   */
  public void agregarMascota()
  {
  }


  /**
   * Incrementa el puntaje general del jugador sin importar si fue en orden
   * consecutivo o no
   * @return       int
   */
  public int incPuntaje()
  {
      return 0 ;
  }


  /**
   * Incrementa la cantidad de aciertos consecutivos del jugador
   * @return       int
   */
  public int incAciertos()
  {
      return 0 ; 
  }


  /**
   * Reinicia los aciertos si la pregunta se responde de forma incorrecta
   * @return       int
   */
  public int resetAciertos()
  {
      return 0 ;
  }


}
