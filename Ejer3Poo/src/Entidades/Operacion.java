
package Entidades;

import java.util.Scanner;



public class Operacion {
    private Scanner leer=new Scanner(System.in).useDelimiter("\n");
    private int numero1;
    private int numero2;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    public void crearOperacion(){
        System.out.println("Ingrese el primer numero");
        this.numero1=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        this.numero2=leer.nextInt();
        
    }
    public int sumar(){
        return this.numero1+this.numero2;
    }
    public int restar(){
        return this.numero1-this.numero2;
    }
    public int multiplicar(){
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Se esta multiplicando por cero");
            return 0;
        } else {
            return this.numero1 * this.numero2;
    }
    }
    public int dividir(){
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Se esta dividiendo por cero");
            return 0;
        } else {
            return this.numero1 / this.numero2;
    }
    }
    
}
