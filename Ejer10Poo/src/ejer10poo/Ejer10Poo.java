
package ejer10poo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Ejer10Poo {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
       double [] a= new double [50]; 
       double [] b= new double [20];
       
        for (int i = 0; i < 50; i++) {
            Arrays.fill(a, i, i+1, Math.random()*10);
        }
       
        System.out.println("Arreglo a: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("A ordenado: " + Arrays.toString(a));
        for (int i = 0; i <= 10; i++) {
            Arrays.fill(b, i,i+1, a[i]);
        }
       
        double x = 0.5;
       Arrays.fill(b, 10, 19, x);
        System.out.println("Arreglo b: " + Arrays.toString(b));
    }
    
    
}
    

