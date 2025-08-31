/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5_NaveEspacial;

/**
 *
 * @author ralbe
 */
public class Principal {
    public static void main(String[] args) {

        NaveEspacial nave1 = new NaveEspacial("Apolo", 50);

        nave1.avanzar(30);

        nave1.recargarCombustible(40); 

        nave1.avanzar(20); 

        nave1.mostrarEstado();
    }
}
