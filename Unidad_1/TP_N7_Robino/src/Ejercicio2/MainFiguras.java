/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

public class MainFiguras {
    public static void main(String[] args) {
        System.out.println("Kata 2: Figuras Geometricas");
        
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo("Circulo A", 10.0);
        figuras[1] = new Rectangulo("Rectangulo B", 5.0, 3.0);
        figuras[2] = new Circulo("Circulo C", 2.0);

        for (Figura fig : figuras) {
            System.out.println("Area de " + fig.getNombre() + ": " + fig.calcularArea());
        }
    }
}