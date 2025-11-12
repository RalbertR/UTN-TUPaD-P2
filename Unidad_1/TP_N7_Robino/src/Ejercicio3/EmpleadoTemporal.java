/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class EmpleadoTemporal extends Empleado {
    private double tarifaHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String id, String nombre, double tarifaHora, int horasTrabajadas) {
        super(id, nombre);
        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return this.tarifaHora * this.horasTrabajadas;
    }
}