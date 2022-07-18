
package Circun1;

import java.util.Scanner;


public class Circunferencia {
    
    private double radio;

    public Circunferencia() {
        
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
   public void crearCircunferencia(){
       Scanner leer=new Scanner(System.in).useDelimiter("\n");
       System.out.println("Ingrese el radio");
       radio= leer.nextDouble();
       
   }
   public double perimetro(){
       return 2*Math.PI*radio;
       
   }
   public double area(){
       return Math.PI*Math.pow(this.radio, 2);
   }

    public double circunf(){
        return 2*radio*2;
    } 
}
