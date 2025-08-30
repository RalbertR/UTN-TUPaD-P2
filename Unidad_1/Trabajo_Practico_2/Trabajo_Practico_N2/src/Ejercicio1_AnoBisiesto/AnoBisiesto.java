/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1_AnoBisiesto;
import java.util.Scanner;
/**
 *
 * @author ralbe
 */
public class AnoBisiesto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }

        sc.close();
    }
}
