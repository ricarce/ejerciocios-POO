
package ejerextra2poo;

import Entidades.Puntos;
import ServicioPuntos.ServicioPuntos;


public class EjerExtra2Poo {

    
    public static void main(String[] args) {
        ServicioPuntos serviciosPuntos = new ServicioPuntos();
        Puntos punto1 = serviciosPuntos.crearPuntos();
        Puntos punto2 = serviciosPuntos.crearPuntos();
        System.out.println("La distancia entre los puntos es: " 
                + serviciosPuntos.calcularDistancia(punto1, punto2));
    }
    
}
