/**
 * Creado: 31 mar. 2022
 */

/**
 * @author Xavier Grajales y Rogelio García
 */
public class PersonaDTO {
    
    //Definición de las variables de instancia de la clase PersonaDTO
    
    private String _nombre;
    private String _direccion;
    private int _edad;
    private String _telefono;
    private String _mail;
    
    
    //Métodos gettets y setters
    
    public String getNombre() {
    return _nombre;
    }
    public void setNombre(String nombre) {
    _nombre = nombre;
    }
    public String getDireccion() {
    return _direccion;
    }
    public void setDireccion(String direccion) {
    _direccion = direccion;
    }
    public int getEdad() {
    return _edad;
    }
    public void setEdad(int edad) {
    _edad = edad;
    }
    public String getTelefono() {
    return _telefono;
    }
    public void setTelefono(String telefono) {
    _telefono = telefono;
    }
    public String getMail() {
    return _mail;
    }
    public void setMail(String mail) {
    _mail = mail;
    }
    
    //Métodos constructores
    //constructor por default
    public PersonaDTO ()
    {
        _nombre = null;
        _direccion = null;
        _edad = 0;
        _telefono = null;
        _mail = null;
    }
    
    //Constructor de parametros necesarios
    public PersonaDTO (String nombre, int edad, String telefono, String mail)
    {
        _nombre = nombre;
        _edad = edad;
        _telefono = telefono;
        _mail = mail;
    }
    
    //constructor que recibe todos los parametros
    public PersonaDTO (String nombre, String direccion, int edad, String
    telefono, String mail)
    {
        _nombre = nombre;
        _direccion = direccion;
        _edad = edad;
        _telefono = telefono;
        _mail = mail;
    }
    
    //Método despliega
    public void despliega ()
    {
        System.out.println ("********** Datos generales persona **********\n");
        System.out.println ("Nombre: " + getNombre () + "\n");
        System.out.println ("Direccion: " + _direccion + "\n");
        System.out.println ("Edad: " + getEdad () + "\n");
        System.out.println ("Teléfono: " + _telefono + "\n");
        System.out.println ("Mail: " + _mail + "\n");
        System.out.println("*********************************************\n");
    }
}