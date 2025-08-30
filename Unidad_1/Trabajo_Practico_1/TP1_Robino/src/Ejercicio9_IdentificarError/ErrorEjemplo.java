package Ejercicio9_IdentificarError;
import java.util.Scanner;

public class ErrorEjemplo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        // String nombre = scanner.nextInt(); ERROR, esta instruccion devuelve un entero y no se puede asignar a una variable String.
        String nombre = scanner.nextLine(); // CORREGIDO

        System.out.println("Hola, " + nombre);
    }
}
