 
package Servicios;

import entidades.Persona;
import java.util.Scanner;


public class PersonaServicios {
    
    
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    public Persona crearPresona(){
        Persona pers1= new Persona();
        
        System.out.println("ingrese los datos de la persona");
        System.out.println("Ingrese el nombre ;");
        pers1.setNombre(leer.next());
        System.out.println("Ingrese la edad :");
        pers1.setEdad(leer.nextInt());
        System.out.println("Ingrese la altura");
        pers1.setAltura(leer.nextDouble());
        System.out.println("Ingrese el peso");
        pers1.setPeso(leer.nextDouble());
        System.out.println("Ingrese el sexo");
        pers1.setSexo(leer.next().charAt(0));
        
        do {
            
            if (pers1.getSexo() != 'H' && pers1.getSexo() != 'M' && pers1.getSexo() != 'O') {
                System.out.println("Error, ingrese H, M u O");
            }
        } while (pers1.getSexo() != 'H' && pers1.getSexo()!= 'M' && pers1.getSexo() != 'O');
    
        return pers1;
        
    }
   public void calcularIMC(Persona pers1){
       double pesoIdeal = pers1.getPeso()/Math.pow(pers1.getAltura(), 2 );
       if (pesoIdeal<20){
           System.out.println("-1" + pers1.getNombre() +" esta por debajo de su peso");
       }else{
           if (pesoIdeal>20 && pesoIdeal<-25){
               System.out.println("o    " +pers1.getNombre() + " ");
           }
       }
   }
}
