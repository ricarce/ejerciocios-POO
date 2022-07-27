
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;


public class CuentaServicios {
    public Cuenta NuevaCuenta(int id){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Cuenta cm=new Cuenta();
        
        System.out.println("Ingrese los datos para la cuenta:" + id);
        cm.setNumeroCuenta(id);
        System.out.println("Ingrese el Nº de DNI:");
        cm.setDni(leer.nextLong());
        System.out.println("Ingrese el saldo: ");
        cm.setSaldo(leer.nextInt());
        return cm;
    }
    
    public void ingreso(Cuenta cm,int cantDinero){
        cm.setSaldo(cm.getSaldo()+ cantDinero);
        System.out.println("El saldo actual es :" + cm.getSaldo());
        
    }
    public void retirarDinero(Cuenta cm, int cantDinero){
        if (cm.getSaldo()>=cantDinero){
            cm.setSaldo(cm.getSaldo()-cantDinero);
            System.out.println("El saldo actual es " + cm.getSaldo());
        }else {
            cm.setSaldo(0);
            System.out.println("El saldo actual es : " + cm.getSaldo());
        }
    }
    public void extraccionRapida(Cuenta cm, int cantDinero){
        if((cm.getSaldo()*0.2)> cantDinero){
            cm.setSaldo(cm.getSaldo()- cantDinero);    
        }else{
            System.out.println("Para retiro rapido no se puede extraer mas del 2O% del saldo");
        }
    }
    public void consultarSaldo(Cuenta cm){
        System.out.println("El saldo actual de su cuenta es :" + cm.getSaldo());
    }
    public void consutarDatos(Cuenta cm){
        System.out.println(cm);
    }
}
