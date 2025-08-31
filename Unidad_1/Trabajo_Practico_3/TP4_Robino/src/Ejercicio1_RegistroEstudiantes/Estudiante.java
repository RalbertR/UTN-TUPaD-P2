package Ejercicio1_RegistroEstudiantes;


public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion;
    
    public Estudiante(String nombre, String apellido, String curso, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public void mostrarInfo(){
        System.out.println("El estudiante se llama: " + nombre + " " + apellido + ". Pertenece al curso de " + curso + " y posee una calificacion de " + calificacion);
    }
    
    public void subirCalificacion(int puntos){
        calificacion += puntos;
        if (calificacion > 10) {
            calificacion = 10;
        }
        System.out.println("La calificación ha aumentado a: " + calificacion);
    }
    
    public void bajarCalificacion(int puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0;
        }
        System.out.println("La calificación ha disminuido a: " + calificacion);
    }
}
