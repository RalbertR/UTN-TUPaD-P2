/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public List<Profesor> getProfesores() {
        return this.profesores;
    }
    
    public void agregarProfesor(Profesor p) {
        if (p != null) {
            this.profesores.add(p);
            System.out.println("Profesor agregado: " + p.getNombre());
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null) {
            this.cursos.add(c);
            System.out.println("Curso agregado: " + c.getNombre());
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : this.profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : this.cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);

        if (c != null && p != null) {
            c.setProfesor(p);
            System.out.println("Asignacion exitosa: " + p.getNombre() + " -> " + c.getNombre());
        } else {
            System.out.println("Error: No se pudo encontrar el curso o el profesor.");
        }
    }

    public void listarProfesores() {
        System.out.println("Lista de Profesores (" + this.nombre + ")");
        for (Profesor p : this.profesores) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println();
        }
    }

    public void listarCursos() {
        System.out.println("Lista de Cursos (" + this.nombre + ")");
        for (Curso c : this.cursos) {
            c.mostrarInfo();
        }
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            c.setProfesor(null);
            this.cursos.remove(c);
            System.out.println("Curso " + codigo + " eliminado.");
        } else {
            System.out.println("Error: No se encontro el curso " + codigo);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            ArrayList<Curso> cursosCopia = new ArrayList<>(p.getCursos());
            
            for (Curso c : cursosCopia) {
                c.setProfesor(null);
            }
            
            this.profesores.remove(p);
            System.out.println("Profesor " + id + " (" + p.getNombre() + ") eliminado.");
        } else {
            System.out.println("Error: No se encontro el profesor " + id);
        }
    }
}