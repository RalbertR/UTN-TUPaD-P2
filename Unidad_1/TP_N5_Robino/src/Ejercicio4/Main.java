/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Nación", "12-12345678-9");
        Cliente cliente = new Cliente("Raul Robino", "33843588");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4900-1114-5238-5610", "12/27", cliente, banco);

        System.out.println("Cliente: " + tarjeta.getCliente().getNombre());
        System.out.println("DNI: " + tarjeta.getCliente().getDni());
        System.out.println("Tarjeta: " + tarjeta.getNumero() + " - Vence: " + tarjeta.getFechaVencimiento());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre() + " (CUIT: " + tarjeta.getBanco().getCuit() + ")");
    }
}