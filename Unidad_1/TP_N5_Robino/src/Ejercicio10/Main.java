/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Raul Robino", "12345678");
        CuentaBancaria cuenta = new CuentaBancaria("CBU123456789", 150000.50, "CLAVE987", "2025-09-24", titular);

        System.out.println("Cuenta Bancaria:");
        System.out.println("Titular: " + cuenta.getTitular().getNombre() + " DNI: " + cuenta.getTitular().getDni());
        System.out.println("CBU: " + cuenta.getCbu() + " Saldo: $" + cuenta.getSaldo());
        System.out.println("Clave Seguridad: " + cuenta.getClaveSeguridad().getCodigo() + " Última modificación: " + cuenta.getClaveSeguridad().getUltimaModificacion());
    }
}