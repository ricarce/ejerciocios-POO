
package ServicioPuntos;

import Entidades.Puntos;
import java.util.Scanner;


public class ServicioPuntos {
    private Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    public Puntos crearPuntos(){
        System.out.println("Ingrese X");
        int x=leer.nextInt();
        System.out.println("Ingrese Y");
        int y=leer.nextInt();
        return new Puntos(x,y);
        
    }
    public double calcularDistancia(Puntos punto1, Puntos punto2){
        int base=Math.abs(punto2.getX())- punto1.getX();
        int altura=Math.abs(punto2.getY())- punto1.getY();
         return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
}
