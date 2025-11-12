/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor == nuevoProfesor) {
            return;
        }

        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }

        this.profesor = nuevoProfesor;

        if (this.profesor != null) {
            if (!this.profesor.getCursos().contains(this)) {
                this.profesor.getCursos().add(this);
            }
        }
    }

    public void mostrarInfo() {
        System.out.print("Curso: [" + this.codigo + "] " + this.nombre);
        if (this.profesor != null) {
            System.out.println(" (Profesor: " + this.profesor.getNombre() + ")");
        } else {
            System.out.println(" (Profesor: Sin asignar)");
        }
    }
}