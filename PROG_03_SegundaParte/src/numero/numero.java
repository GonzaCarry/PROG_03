package numero;
import java.util.Scanner;

/**
 *
 * @author Gonza
 */
public class numero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Complejo numero= new Complejo();
        Complejo numero2 = new Complejo(2,5);
        double real;
        double imag;

        System.out.println("Introduzca la parte real de un número complejo A:");
        real = teclado.nextDouble();
        numero.cambia_Real(real);
        
        System.out.println("Introduzca la parte imaginaria de un número complejo A:");
        imag = teclado.nextDouble();
        numero.cambia_Imag(imag);
        
        System.out.println("El número A es: " + numero.toString());
        System.out.println("El número B es: " + numero2.toString());
        
      /**System.out.println("Introduzca la parte real de un número complejo B:");
        real = teclado.nextDouble();
        numero2.cambia_Real(real);
        
        System.out.println("Introduzca la parte imaginaria de un número complejo B:");
        imag = teclado.nextDouble();
        numero2.cambia_Imag(imag);
        
        System.out.println("El número B es: " + numero2.toString());*/
        
        numero.sumar(numero2);
        System.out.println("La suma es: " + numero.toString());
    }
}
