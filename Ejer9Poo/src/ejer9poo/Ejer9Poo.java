
package ejer9poo;

import Entidades.Matematica;
import java.util.Scanner;


public class Ejer9Poo {

    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Matematica nueNum = new Matematica();
        
        nueNum.setNum1((double) (Math.random() * 10));
        nueNum.setNum2((double) (Math.random() * 10));

        System.out.println(nueNum.toString());
        System.out.println("");

        nueNum.devolverMayor();
        nueNum.calcularPotencia();
        nueNum.calculaRaiz();
    }
}
    
    

