
package ejer12pooa;

import Entidades.Persona;
import java.util.Scanner;


public class Ejer12Pooa {

    
    public static void main(String[] args) {
         Persona p = new Persona();
        Scanner leer = new Scanner(System.in);
        p.crearPersona();
        int dif = p.calcularEdad();

        System.out.print("Ingrese edad de otra persona:");
        int x = leer.nextInt();
        boolean l = p.menorQue(x, dif);

        if (l == true) {
            System.out.println("La persona original es menor");
        } else {
            System.out.println("La persona original es mayor");
        }

        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Fecha de nacimiento: " + p.getFecha());

    }
    
    
}
