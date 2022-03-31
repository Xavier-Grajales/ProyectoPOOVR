/**
 * Creado: 31 mar. 2022
 */

/**
 * @author Xavier Grajales y Rogelio García.
 */
public class TestActividadesDeportivas {
    /**
    * @param args
    */
    public static void main(String[] args) {
        
    //CREAR OBJETOS DE TIPO PersonaDTO
    
        //Constructor default
        PersonaDTO Juan = new PersonaDTO ();
    
        //Constructor con parametros necesarios
        PersonaDTO Xavier = new PersonaDTO ("Xavier", 20, "9611260055", "Xavier@correo.ler.uam.mx");
        
        //Constructor con todos los parametros
        PersonaDTO Rogelio = new PersonaDTO ("Rogelio", "Toluca", 22, "5530385169", "Rogelio@correo.ler.uam.mx");
        
        Juan.despliega(); //Despliega datos
        Xavier.despliega();
        Rogelio.despliega();
        
     //CREAR OBJETOS DE TIPO CatalogoDTO
        
        //Constructor default
        CatalogoDTO pelota= new CatalogoDTO();
        
        //Constructor con parametros necesarios
        CatalogoDTO balon=new CatalogoDTO("W7831",'A', 45.50f, 3);
        
        //Constructor con todos los parametros
        CatalogoDTO fronton=new CatalogoDTO("B2781",'C', 85.50f, 2,"Pelota de esponja para fronton");
    
        pelota.despliega(); //Despliega datos
        balon.despliega();
        fronton.despliega();
        
      //Creación de objetos de tipo ServicioDTO.

        //Constructor default
        ServiciosDTO servicio1 = new ServiciosDTO ();

        //Constructor con parametros necesarios
        ServiciosDTO servicio2 = new ServiciosDTO ("S1","Kickboxing", 25);
        
        //Constructor con todos los parametros
        ServiciosDTO servicio3 = new ServiciosDTO ("S4", "Futbol", "Futbol rapido", "Lun-Vier de 2-3 pm", 25, "Unidad deportiva");

        servicio1.despliega(); //Despliega datos
        servicio2.despliega();
        servicio3.despliega();
    }
}

