package Ejercicio4_Gallinero;

public class Gallina {
    
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = edadInicial;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " ha puesto un huevo.");
    }
    
    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " tiene ahora: " + edad + "años de edad.");
    }

    public void mostrarEstado() {
        System.out.println("Estado de Gallina " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}