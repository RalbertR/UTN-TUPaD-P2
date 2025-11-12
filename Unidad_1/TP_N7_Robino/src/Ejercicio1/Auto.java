/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        // Llama al constructor de la clase base (Vehiculo)
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    // Sobrescribe el metodo de la clase base
    @Override
    public void mostrarInfo() {
        System.out.println("Auto: " + this.marca + " " + this.modelo);
        System.out.println("Puertas: " + this.cantidadPuertas);
    }
}
