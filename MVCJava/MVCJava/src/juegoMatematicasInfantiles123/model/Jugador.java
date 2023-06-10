package juegoMatematicasInfantiles123.model;



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

    public Jugador(String nombre, int edad, mascotaVirtual listaMascota, int puntaje, int aciertosConsecutivos) {
        this.nombre = nombre;
        this.edad = edad;
        this.listaMascota = listaMascota;
        this.puntaje = puntaje;
        this.aciertosConsecutivos = aciertosConsecutivos;
    }
 
  
 
  //
  // Getters y setters
  //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public mascotaVirtual getListaMascota() {
        return listaMascota;
    }

    public void setListaMascota(mascotaVirtual listaMascota) {
        this.listaMascota = listaMascota;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getAciertosConsecutivos() {
        return aciertosConsecutivos;
    }

    public void setAciertosConsecutivos(int aciertosConsecutivos) {
        this.aciertosConsecutivos = aciertosConsecutivos;
    }

  
    
    
  //
  // Class methods
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
