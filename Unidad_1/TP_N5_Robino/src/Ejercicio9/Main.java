/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Raul Robino", "OSDE");
        Profesional profesional = new Profesional("Dra. Gómez", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-09-30", "10:00", paciente, profesional);

        System.out.println("Cita médica:");
        System.out.println("Fecha: " + cita.getFecha() + " Hora: " + cita.getHora());
        System.out.println("Paciente: " + cita.getPaciente().getNombre() + " - Obra Social: " + cita.getPaciente().getObraSocial());
        System.out.println("Profesional: " + cita.getProfesional().getNombre() + " - Especialidad: " + cita.getProfesional().getEspecialidad());
    }
}