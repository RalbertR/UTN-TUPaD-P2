package Ejercicio2_RegistroMascotas;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre de la Mascota: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese la especie de la Mascota: ");
        String especie = sc.nextLine();
        
        System.out.print("Ingrese la edad de la Mascota: ");
        int edad = sc.nextInt();
        
        Mascota mascota1 = new Mascota(nombre, especie, edad);
        
        mascota1.mostrarInfo();
        
        mascota1.cumplirAnios();
        
        mascota1.cumplirAnios();
    }
    
}
