
package Entidades;


public class Matematica {
    private double num1;
    private double num2;
    
    public Matematica() {
    }
        public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Matematica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }

 

    public void devolverMayor() {

        if (num1 > num2) {

            System.out.println("El N° mayor es: " + num1);

        } else {

            System.out.println("El N° mayor es: " + num2);
        }
        System.out.println("");
    }

//CALCULAR POTENCIA:    / Math. round (num) / Math.pow(num)
    public void calcularPotencia(){
        
        //Calculo e imprimo los valores redondeados de c/ número:
        System.out.println("Redondeo Num1: " + Math.round(num1));  //num1 = Math.round(num1);
        System.out.println("Redondeo Num2: " + Math.round(num2)); //num2 = Math.round(num2);
        
        if (Math.round(num1) > Math.round(num2)){
        
            double potencia = (double) Math.pow(Math.round(num1),Math.round(num2));
            System.out.println("\nPotencia = " + potencia + "\n");
        
        }else{
            
            double potencia = (double) Math.pow(Math.round(num2),Math.round(num1));
            System.out.println("\nPotencia = " + potencia + "\n");
        }
    }
    
//CALCULAR RAIZ:  / Math.abs(num) / Math.sqrt(num)

    public void calculaRaiz(){
        
      //Calculo e imprimo los valores absolutos de c/ número:
        System.out.println("Valor Absoluto Num1: " + Math.abs(num1));  //num1 = Math.abs(num1);
        System.out.println("Valor Absoluto Num2: " + Math.abs(num2)); //num2 = Math.abs(num2);
        
        if (Math.abs(num1) < Math.abs(num2)){
        
            //int potencia = (int) Math.pow(Math.round(num1),Math.round(num2));
            int raiz = (int) Math.sqrt(Math.abs(num1));
            System.out.println("\nRaiz cuadrada Num1: = " + raiz + "\n");
        
        }else{
            
             int raiz = (int) Math.sqrt(Math.abs(num2));
            System.out.println("\nRaiz cuadrada Num2: = " + raiz + "\n");
        }
    } 
}



  