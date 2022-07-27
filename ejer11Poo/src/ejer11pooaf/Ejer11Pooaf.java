
package ejer11pooaf;

import java.util.Date;
import java.util.Scanner;

public class Ejer11Pooaf {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);  
        Date fechaActual = new Date();
        int dia, mes, anio;        
        System.out.print("Ingrese el dia: ");
        dia=leer.nextInt();
        System.out.print("Ingrese el mes: ");
        mes=leer.nextInt();        
        System.out.print("Ingrese Año (aaaa): ");
        anio=leer.nextInt()-1900;
        Date fecha = new Date (anio, mes-1, dia);
        System.out.println("Fecha ingresada: " + fecha);        
        System.out.println("Fecha actual: " + fechaActual);
        int dif= fecha.getYear()-fechaActual.getYear();
        System.out.println("diferencia: " + dif*-1);             
     
    }
    
}

    
    

