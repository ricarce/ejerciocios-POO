
package ejer3;

import Entidades.Operacion;

public class Ejer3 {

    
    public static void main(String[] args) {
        Operacion operacion=new Operacion();//se crea el objeto operacion,
        operacion.crearOperacion();//llamo al metodo crear operacion
        System.out.println("La suma es: " + operacion.sumar());
        System.out.println("La resta es: " + operacion.restar());
        System.out.println("La multiplicacion es: " + operacion.multiplicar());
        System.out.println("La division es: " + operacion.dividir());
        
    }
    
}
