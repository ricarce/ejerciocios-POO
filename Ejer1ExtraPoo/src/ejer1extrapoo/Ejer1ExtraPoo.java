
package ejer1extrapoo;

import Entidades.Cancion;


public class Ejer1ExtraPoo {

    
    public static void main(String[] args) {
       Cancion cancion = new Cancion("Cancion 1", "Autor 1");
        System.out.println(cancion.getTitulo());
        System.out.println(cancion.getAutor());
    }
    
}
