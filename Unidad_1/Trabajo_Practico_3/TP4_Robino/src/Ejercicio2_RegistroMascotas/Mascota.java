package Ejercicio2_RegistroMascotas;

public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    public Mascota(String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        
    }
    
    public void cumplirAnios(){
        edad++;
        System.out.println("Feliz Cumpleaños!! ahora " + nombre + " tiene " + edad + " años.");
    }
}
