
package Ejercicio3;


public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("James Clear", "USA");
        Editorial editorial = new Editorial("Editorial Santillan", "Buenos Aires, Argentina");
        Libro libro = new Libro("Habitos Atomicos", "955-750-07-3956-0", autor, editorial);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Autor: " + libro.getAutor().getNombre() + " (" + libro.getAutor().getNacionalidad() + ")");
        System.out.println("Editorial: " + libro.getEditorial().getNombre() + " - " + libro.getEditorial().getDireccion());
    }
}
