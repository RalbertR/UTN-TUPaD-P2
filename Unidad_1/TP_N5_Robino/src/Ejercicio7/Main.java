/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "M12345");
        Conductor conductor = new Conductor("Raul Robino", "AR2347654");
        Vehiculo vehiculo = new Vehiculo("AA111AA", "Audi A3", motor, conductor);

        System.out.println("Vehículo patente: " + vehiculo.getPatente() + " Modelo: " + vehiculo.getModelo());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo() + " / N° Serie: " + vehiculo.getMotor().getNumeroSerie());
        System.out.println("Conductor: " + vehiculo.getConductor().getNombre() + " Licencia: " + vehiculo.getConductor().getLicencia());
    }
}