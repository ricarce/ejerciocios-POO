
package libreria1;

import Entidad.Libro;
import Servicio.ServicioLibro;


public class Libreria1 {

    
    public static void main(String[] args) {
     ServicioLibro LibroServicio = new ServicioLibro();
        
        Libro Libro1 = LibroServicio.crearLibro();
        
        System.out.println(Libro1);
    }
    
}
