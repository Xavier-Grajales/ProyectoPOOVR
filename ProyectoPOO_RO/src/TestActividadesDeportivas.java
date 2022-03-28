/**
 * Creado: 27 mar. 2022
 */

/**
 * @author xavier
 *
 */

public class TestActividadesDeportivas {
    /**
    * @param args
    */
    public static void main(String[] args) {
        
    //CREAR OBJETOS DE TIPO PersonaDTO
    
        //Constructor default
        CatalogoDTO raqueta= new CatalogoDTO();
    
        //Constructor con 4 parametros
        CatalogoDTO pelota=new CatalogoDTO("C2179",'C', 45.50f, 3);
        //Constructor con 5 parametros
        CatalogoDTO balon=new CatalogoDTO("A2767",'A',33.50f, 2,"Balon molten No.5");
    
        raqueta.despliega();
        pelota.despliega();
        balon.despliega();
    }
}

