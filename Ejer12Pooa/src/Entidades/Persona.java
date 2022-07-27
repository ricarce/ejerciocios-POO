
package Entidades;

import java.util.Date;
import java.util.Scanner;


public class Persona {
    private String nombre;
    private Date fecha;
    Scanner leer=new Scanner (System.in).useDelimiter ("\n");

    public Persona(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Persona "+ "nombre= " + nombre + ", fecha= " + fecha;
    }
    
    //Servicios
    public Persona crearPersona(){
        System.out.println("creando 1 persona...");
        System.out.print("Ingrese el nombre: ");
        nombre=leer.next();
        int dia, mes, anio;     
        System.out.println("Fecha de nacimiento");
        System.out.print("dia: ");
        dia=leer.nextInt();
        System.out.print("mes: ");
        mes=leer.nextInt();        
        System.out.print("Año (aaaa): ");
        anio=leer.nextInt();
        anio=anio-1900;
        fecha = new Date (anio, mes-1, dia);
        return new Persona (nombre, fecha);
    }
    
    public int calcularEdad(){
         Date fechaActual = new Date();
        int dif= fecha.getYear()-fechaActual.getYear();
        System.out.println("Edad (en cant de años): " + (dif*-1));
        return dif;
   
    } 
    
    public boolean menorQue (int edad, int dif){
        if (edad<dif){
            return true;
        }else{
            return false;
        }
    }
    
}
