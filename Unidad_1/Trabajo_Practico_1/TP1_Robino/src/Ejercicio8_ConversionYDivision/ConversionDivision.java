/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8_ConversionYDivision;
import java.util.Scanner;

public class ConversionDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = sc.nextInt();

        int resultado = num1 / num2;
        System.out.println("Resultado de la división entera: " + resultado);
        
        System.out.print("Ingrese el primer número (double): ");
        double num1_double = sc.nextDouble();

        System.out.print("Ingrese el segundo número (double): ");
        double num2_double = sc.nextDouble();
        
        double resultadoDouble = num1_double / num2_double;
        System.out.println("Resultado de la división con decimales: " + resultadoDouble);
    }
}


