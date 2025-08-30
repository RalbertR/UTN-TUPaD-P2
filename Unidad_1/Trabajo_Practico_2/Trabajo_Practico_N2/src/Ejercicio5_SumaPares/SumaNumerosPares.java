/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5_SumaPares;
import java.util.Scanner;

public class SumaNumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int sumaPares = 0;
        
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                sumaPares += numero;
            }

        } while (numero != 0);
        System.out.println("La suma de los números pares es: " + sumaPares);

        sc.close();
    }
    
}
