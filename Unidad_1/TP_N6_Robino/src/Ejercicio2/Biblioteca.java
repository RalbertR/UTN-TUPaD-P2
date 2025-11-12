
package Ejercicio2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        System.out.println("Libro agregado: " + titulo);
    }

    public void listarLibros() {
        if (this.libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros.");
            return;
        }
        for (Libro libro : this.libros) {
            libro.mostrarInfo();
        }
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        boolean eliminado = this.libros.removeIf(libro -> libro.getIsbn().equalsIgnoreCase(isbn));
        
        if (eliminado) {
            System.out.println("Libro con ISBN " + isbn + " eliminado.");
        } else {
            System.out.println("No se encontro libro con ISBN " + isbn + ".");
        }
    }

    public int obtenerCantidadLibros() {
        return this.libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("--- Libros publicados en " + anio + " ---");
        boolean encontrados = false;
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron libros para ese anio.");
        }
    }

    public void mostrarAutoresDisponibles() {
        Set<Autor> autores = new HashSet<>();
        for (Libro libro : this.libros) {
            autores.add(libro.getAutor());
        }

        System.out.println("--- Autores Disponibles en la Biblioteca ---");
        if (autores.isEmpty()) {
            System.out.println("No hay autores para mostrar.");
            return;
        }
        for (Autor autor : autores) {
            autor.mostrarInfo();
        }
    }
}