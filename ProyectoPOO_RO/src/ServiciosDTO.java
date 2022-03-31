/**
 * Creado: 31 mar. 2022
 */

/**
 * @author Xavier Grajales y Rogelio García
 */
public class ServiciosDTO {
	
	//VARIABLES DE INSTANCIA
	private String _clave;
	private String _nombre;
	private String _descripcion;
	private String _horario; 
	private int _cupo;
	private String _lugar;
	
	//Métodos getters y setters
	public String getClave() {
	return _clave;
	}
	public void setClave(String clave) {
	_clave = clave;
	}
	public String getNombre() {
	return _nombre;
	}
	public void setNombre(String nombre) {
	_nombre = nombre;
	}
	public String getDescripcion() {
	return _descripcion;
	}
	public void setDescripcion(String descripcion) {
	_descripcion = descripcion;
	}
	public String getHorario() {
	return _horario;
	}
	public void setHorario(String horario) {
	_horario = horario;
	}
	public int getCupo() {
	return _cupo;
	}
	public void setCupo(int cupo) {
	_cupo = cupo;
	}
	public String getLugar() {
	return _lugar;
	}
	public void setLugar(String lugar) {
	_lugar = lugar;
	}
	
	//CONSTRUCTORES
	//Constructor por dafault
	public ServiciosDTO ()
	{
	_clave = null;
	_nombre = null;
	_descripcion = null;
	_horario = null;
	_cupo = 0;
	_lugar = null;
	}
	
	//CONSTRUCTOR QUE RECIBE 3 PARÁMETROS
	public ServiciosDTO (String clave, String nombre, int cupo)
	{
	_clave = clave;
	_nombre = nombre;
	_cupo = cupo;
	}
	
	//CONSTRUCTOR QUE RECIBE TODOS LOS PARÁMETROS
	public ServiciosDTO (String clave, String nombre, String descripcion, String horario, int cupo, String lugar)
	{
	_clave = clave;
	_nombre = nombre;
	_descripcion = descripcion;
	_horario = horario;
	_cupo = cupo;
	_lugar = lugar;
	}
	
	//OTROS MÉTODOS
	public void despliega ()
	{
	System.out.println ("********** Datos de los Servicios **********\n");

	System.out.println ("Clave: " + getClave() + "\n");
	System.out.println ("Nombre: " + getNombre() + "\n");
	System.out.println ("Descripcion: " + getDescripcion() + "\n");
	System.out.println ("Horario: " + getHorario () + "\n");
	System.out.println ("Cupo: " + getCupo() + "\n");
	System.out.println ("Lugar: " + getLugar() + "\n");
	System.out.println("********************************************\n");
	}
}
