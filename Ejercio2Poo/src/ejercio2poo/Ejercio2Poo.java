
package ejercio2poo;

import Circun1.Circunferencia;


public class Ejercio2Poo {

    
    public static void main(String[] args) {
        Circunferencia circunferencia = new Circunferencia();
        circunferencia.crearCircunferencia();
        System.out.println("Circunferencia es:" + circunferencia );
        System.out.println("Perimetro es " +circunferencia.perimetro());
        System.out.println("Area es :"+ circunferencia.area());
        
    }
    
}
