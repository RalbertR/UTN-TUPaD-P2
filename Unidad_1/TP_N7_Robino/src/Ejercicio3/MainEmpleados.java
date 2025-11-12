/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;
import java.util.ArrayList;
import java.util.List;

public class MainEmpleados {
    public static void main(String[] args) {
        System.out.println("--- Kata 3: Empleados ---");
        
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("P001", "Ana", 3000));
        empleados.add(new EmpleadoTemporal("T001", "Luis", 15, 80));
        empleados.add(new EmpleadoPlanta("P002", "Maria", 3200));

        System.out.println("--- Calculo de Sueldos (Polimorfismo) ---");
        for (Empleado emp : empleados) {
            System.out.println("Sueldo de " + emp.getNombre() + ": $" + emp.calcularSueldo());
        }

        System.out.println("\n--- Clasificacion de Empleados (instanceof) ---");
        for (Empleado emp : empleados) {
            if (emp instanceof EmpleadoPlanta) {
                System.out.println(emp.getNombre() + " es empleado de Planta.");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println(emp.getNombre() + " es empleado Temporal.");
            }
        }
    }
}