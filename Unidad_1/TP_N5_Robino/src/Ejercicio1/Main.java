/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author ralbe
 */
public class Main {
    public static void main(String[] args) {
        Foto foto = new Foto("fotoPerfil_1.jpg", "JPEG");
        Titular titular = new Titular("Rodrigo Nuñez", "40233223");
        Pasaporte pasaporte = new Pasaporte("AA123456", "2025-09-22", foto, titular);

        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
        System.out.println("Número de pasaporte: " + pasaporte.getNumero());
    }
}
