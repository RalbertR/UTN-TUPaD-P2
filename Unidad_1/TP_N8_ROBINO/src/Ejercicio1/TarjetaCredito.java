/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

public class TarjetaCredito implements PagoConDescuento {

    private final double TASA_DESCUENTO = 0.10;

    @Override
    public double aplicarDescuento(double montoOriginal) {
        double descuento = montoOriginal * TASA_DESCUENTO;
        double montoFinal = montoOriginal - descuento;
        System.out.println("Aplicando descuento del 10% ($" + String.format("%.2f", descuento) + ") por pago con Tarjeta de Credito.");
        return montoFinal;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + String.format("%.2f", monto) + " con Tarjeta de Credito.");
        System.out.println("Pago con Tarjeta de Credito exitoso!");
    }
}