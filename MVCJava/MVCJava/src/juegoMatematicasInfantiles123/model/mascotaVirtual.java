package juegoMatematicasInfantiles123.model;



/**
 * Class mascotaVirtual
 */
public class mascotaVirtual {

  //
  // Fields
  //

  private String imagen;
  private String descripcion;
  private String nombre;
  
  //
  // Constructors
  //

    public mascotaVirtual(String imagen, String descripcion, String nombre) {
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }
  

  //
  // Setters y getters
  //

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

  //
  // Class methods
  //

  /**
   * Muestra informaci�n de la mascota, nombre, imagen
   */
  public void mostrar()
  {
  }


  /**
   * Emitir un sonido
   */
  public void realizarAccion()
  {
  }


}
