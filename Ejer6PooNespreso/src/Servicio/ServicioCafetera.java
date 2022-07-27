
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;


public class ServicioCafetera {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public Cafetera NuevaCafetera(){
        Cafetera c= new Cafetera();
        System.out.println("Nueva Cafetera... Ingrese datos.");
        System.out.println("");
        System.out.println("Ingrese la capacidad Maxima:");
        c.setCapacidadMaxima(leer.nextInt());
        System.out.println("Ingrese la cantidad actual de cafe disponible");
        c.setCantidadActual(leer.nextInt());
        return c;
    }
    public void llenarCafetera(Cafetera c){
        c.setCantidadActual(c.getCapacidadMaxima());
    }
    public void servirTaza(Cafetera c, int tam){
        if (c.getCantidadActual()>tam){
            c.setCantidadActual(c.getCantidadActual()-tam);
            System.out.println("La taza se lleno");
        }else{
            if(c.getCantidadActual()<tam){
                System.out.println("No alcanzo para llenar la taza, solo se lleno con " + c.getCantidadActual());
                c.setCantidadActual(0);
            }
        }
    }
    
    public void vaciarCafetera(Cafetera c ){
        c.setCantidadActual(0);
    }
    public void agregarCafe(Cafetera c, int cant){
        int x=c.getCapacidadMaxima()-c.getCantidadActual();
        if(cant<x){
            c.setCantidadActual(c.getCantidadActual()+ cant);
            System.out.println("Se ingreso el cafe");
        }else{
            c.setCantidadActual(c.getCapacidadMaxima());
            System.out.println("la cafetera se lleno y sobro:" +(cant-x) );
            c.setCantidadActual(c.getCapacidadMaxima());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
