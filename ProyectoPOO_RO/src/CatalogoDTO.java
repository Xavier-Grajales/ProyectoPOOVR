/**
 * Creado: 27 mar. 2022
 */

/**
 * @author xavier
 *
 */

public class CatalogoDTO
{
  //Definición de las variables de instancia de la clase CatalogoDTO
  private int _existencia;
  private char _ubicacion;
  private float _costo;
  private String _clave;
  
  //Métodos Getters y setters
  private String _descripcion;
  /**
   * @return the descripcion
   */
  public String getDescripcion()
  {
    return _descripcion;
  }

  /**
   * @param descripcion the descripcion to set
   */
  public void setDescripcion( String descripcion )
  {
    _descripcion = descripcion;
  }

  /**
   * @return the existencia
   */
  public int getExistencia()
  {
    return _existencia;
  }

  /**
   * @param existencia the existencia to set
   */
  public void setExistencia( int existencia )
  {
    _existencia = existencia;
  }

  /**
   * @return the ubicacion
   */
  public char getUbicacion()
  {
    return _ubicacion;
  }

  /**
   * @param ubicacion the ubicacion to set
   */
  public void setUbicacion( char ubicacion )
  {
    _ubicacion = ubicacion;
  }

  /**
   * @return the costo
   */
  public float getCosto()
  {
    return _costo;
  }

  /**
   * @param costo the costo to set
   */
  public void setCosto( float costo )
  {
    _costo = costo;
  }

  /**
   * @return the clave
   */
  public String getClave()
  {
    return _clave;
  }

  /**
   * @param clave the clave to set
   */
  public void setClave( String clave )
  {
    _clave = clave;
  }
  
  
//métodos constructores
 public CatalogoDTO ()  // constructor por defecto
 {
   _descripcion=null;
   _existencia=0;
   _ubicacion= ' ';
   _costo=0;
   _clave=null;
   
 }

 public CatalogoDTO (String clave, char ubicacion, float costo, int existencia)
 {
   _descripcion=null;
   _existencia=existencia;
   _ubicacion= ubicacion;
   _costo=costo;
   _clave=clave;
 }
 
 public CatalogoDTO (String clave, char ubicacion, float costo, 
     int existencia,String descripcion)
 {
   _descripcion=descripcion;
   _existencia=existencia;
   _ubicacion= ubicacion;
   _costo=costo;
   _clave=clave;
 }
 public void despliega()
 {
   System.out.println("**************************************************\n");
   System.out.println("Clave"+"\t"+"Ubicacion"+"\t"+"Costo"+"\t"+"Existencia"+"\t"+"Descripcion"+"\t");
   System.out.println(_clave + "\t" + "\t" + _ubicacion + "\t" + 
   _costo +"\t" +_existencia+"\t\t"+_descripcion+"\n");
   System.out.println("**************************************************\n");
 }
}

