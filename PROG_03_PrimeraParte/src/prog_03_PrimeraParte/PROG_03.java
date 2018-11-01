package prog_03_PrimeraParte;

import java.util.*;
/**
 *
 * @author Gonza
 */
public class PROG_03 {
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       Persona A= new Persona();
       String nombre;
       int edad;
       float altura;
       
       System.out.println("El nombre del alumno es " + A.consulta_Nombre() + " su edad es " + A.getEdad() + " años" + " y su altura es " + A.getAltura() + " metros.");
       
       
       System.out.println("Introduzca un nombre, una edad y una altura");
       nombre= teclado.nextLine();
       edad= teclado.nextInt();
       altura= teclado.nextFloat();
       A.cambia_Nombre(nombre);
       Persona B= new Persona(nombre, edad, altura);
       System.out.println("El nombre del alumno es " + B.consulta_Nombre() + " su edad es " + B.getEdad() + " años" + " y su altura es " + B.getAltura() + " metros.");
    }
}
