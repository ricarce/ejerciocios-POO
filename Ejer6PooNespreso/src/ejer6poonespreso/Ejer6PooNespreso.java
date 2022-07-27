
package ejer6poonespreso;

import Entidades.Cafetera;
import Servicio.ServicioCafetera;
import java.util.Scanner;


public class Ejer6PooNespreso {

    
    public static void main(String[] args) {
        ServicioCafetera sc= new ServicioCafetera();
        Cafetera caf=new Cafetera();
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        System.out.println("Primero creamos la cafetera");
        caf=sc.NuevaCafetera();
        int opcion;
        do{
            int tam=0;
            System.out.println("");
            System.out.println("Ingrese una opcion:");
            System.out.println("1.Llenar Cafetera\n2.Servir Taza\n"
                    + "3.Vaciar Cafetera\n4.Agregar Cafe\n0.Salir");
            opcion=leer.nextInt();
            System.out.println("");
            switch (opcion){
                case 1:
                    System.out.println("1.Llenar:");
                    sc.llenarCafetera(caf);
                    break;
                case 2:
                    System.out.println("2.Servir");
                    sc.servirTaza(caf, tam);

                    break;
                case 3:
                    System.out.println("3. Vaciar Cafetera");
                    sc.vaciarCafetera(caf);
                case 4:
                    System.out.println("Ingrese cantidad de cafe a recargar");
                    sc.agregarCafe(caf, tam);
                    
                case 0:
                    System.out.println("Saliendo");
                    break;
                    
            }
        }while (opcion!=0);
            System.out.println("");
    }
        
    
}
