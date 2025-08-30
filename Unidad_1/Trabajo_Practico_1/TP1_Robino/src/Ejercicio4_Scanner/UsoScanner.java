
package Ejercicio4_Scanner;
import java.util.Scanner;
        
public class UsoScanner {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Ingrese su nombre: ");
    String nombre = sc.nextLine();
    
    System.out.println("Ingrese su edad: ");
    int edad = sc.nextInt();
    
    System.out.println("Su nombre es: " + nombre + "\nSu edad es: " + edad);
    
    }
}
