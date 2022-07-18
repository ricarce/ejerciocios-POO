
package mascotaapp;

import java.util.Scanner;
import mascotaapp.Entidades.Mascota;


public class MascotaAPP {


    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        
        Mascota m1= new Mascota("Fernando Chiquit", leer.next(), "Perro");
        
       
        m1.setNombre("Pepe Chiquito");
        m1.pasear(100);
        System.out.println(m1.toString());
        
        
    }
    
}
