/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

public class PayPal implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + String.format("%.2f", monto) + " con PayPal.");
        System.out.println("Pago con PayPal exitoso!");
    }
}