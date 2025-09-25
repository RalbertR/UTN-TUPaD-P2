/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

public class Main {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Raul Robino", "20-12345678-9");
        Impuesto impuesto = new Impuesto(5000, contribuyente);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
}