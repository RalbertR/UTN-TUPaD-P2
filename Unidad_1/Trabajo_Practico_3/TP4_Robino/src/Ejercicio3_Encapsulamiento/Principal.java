
package Ejercicio3_Encapsulamiento;

public class Principal {
    public static void main(String[] args) {

        Libro libro1 = new Libro("El titulo mas exotico", "Raul Robino", 1990);

        libro1.setAnioPublicacion(3000);

        libro1.setAnioPublicacion(1985);

        libro1.mostrarInfo();
    }
}
