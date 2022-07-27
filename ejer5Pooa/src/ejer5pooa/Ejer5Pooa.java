
package ejer5pooa;

import Entidades.Cuenta;
import Servicios.CuentaServicios;
import java.util.Scanner;


public class Ejer5Pooa {
public static final String ANSI_RED = "\u001B[31m";
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        int opcion=0;
        CuentaServicios cs=new CuentaServicios();
        Cuenta [] ctas=new Cuenta[9999];
        int id=0;
        int canDinero;
        int numCuenta=0;
        int x=0;
        do{
            System.out.println("");
            System.out.println("1.Nueva cuenta\n"
                    + "2.Cuenta Activa\n"
                    + "3. Salir\n");
            x=leer.nextInt();
            switch (x){
                case 1:
                    ctas[id]=cs.NuevaCuenta(id);
                    numCuenta=id;
                    id++;
                    break;
                case 2:
                    if (ctas[0]== null){
                        System.out.println(ANSI_RED+"No exixten cuentas cargadas,primero ingrese una cuenta." );
                    }else {
                        System.out.println("Ingrese el numero de cuenta: ");
                        numCuenta=leer.nextInt();
                        x=4;
                        break;
                    }
                case 3:
                    break;
            }
            
        }while( x != 3 && x != 4);
        if (x == 4){
            System.out.println("");
            System.out.println("");
            do {
                System.out.println("Ingrese la operacion a realizar:");
                System.out.println("1.Ingresar Dinero\n2.Retirar Dinero\n"
                        + "3.Realizar una Extraccion Rapida\n4.Consultar Saldo\n"
                        + "5.Consultar Datos de la cuenta\n0.Salir");
                System.out.println(" ");
                opcion=leer.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("Ingrese la cantidad de dinero a depositar:");
                        canDinero = leer.nextInt();
                        cs.ingreso(ctas[numCuenta], canDinero);
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad de dinero a retirar :");
                        canDinero=leer.nextInt();
                        cs.retirarDinero(ctas[numCuenta], canDinero);
                        break;
                    case 3:
                        System.out.println("Ingrese la cantiad de dinero a retirar rapidamente :");
                        canDinero=leer.nextInt();
                        cs.extraccionRapida(ctas[numCuenta], canDinero);
                        break;
                    case 4:
                        cs.consultarSaldo(ctas[numCuenta]);
                        break;
                    case 5:
                        cs.consutarDatos(ctas[numCuenta]);
                        break;
                        
                }
                System.out.println("-----------------------------");
                System.out.println(" ");
            }while(opcion!=0);
        }
    }
    
}
