/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Propietario propietario = new Propietario("Raul Robino", "33843588");
        Computadora compu = new Computadora("HP", "SN321677", "Z690", "Intel", propietario);

        System.out.println("Propietario: " + compu.getPropietario().getNombre() + " (DNI: " + compu.getPropietario().getDni() + ")");
        System.out.println("Computadora: " + compu.getMarca() + " - Serie: " + compu.getNumeroSerie());
        System.out.println("Placa Madre: " + compu.getPlacaMadre().getModelo() + " / Chipset: " + compu.getPlacaMadre().getChipset());
    }
}