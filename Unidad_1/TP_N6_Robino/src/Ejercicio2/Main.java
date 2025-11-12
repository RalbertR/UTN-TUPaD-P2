
package Ejercicio2;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("1. CREAR BIBLIOTECA");
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central");
        System.out.println("Biblioteca '" + miBiblioteca.getNombre() + "' creada.");

        System.out.println("\n2. CREAR AUTORES");
        Autor autor1 = new Autor("A001", "J.K. Rowling", "Britanica");
        Autor autor2 = new Autor("A002", "J.R.R. Tolkien", "Britanico");
        
        autor1.mostrarInfo();
        autor2.mostrarInfo();

        System.out.println("\n3. AGREGAR LIBROS (HP Y LOTR)");
        miBiblioteca.agregarLibro("HP-01", "Harry Potter y la piedra filosofal", 1997, autor1);
        miBiblioteca.agregarLibro("HP-02", "Harry Potter y la camara secreta", 1998, autor1);
        miBiblioteca.agregarLibro("HP-03", "Harry Potter y el prisionero de Azkaban", 1999, autor1);
        miBiblioteca.agregarLibro("HP-04", "Harry Potter y el caliz de fuego", 2000, autor1);
        miBiblioteca.agregarLibro("HP-05", "Harry Potter y la Orden del Fenix", 2003, autor1);
        miBiblioteca.agregarLibro("HP-06", "Harry Potter y el misterio del principe", 2005, autor1);
        miBiblioteca.agregarLibro("HP-07", "Harry Potter y las Reliquias de la Muerte", 2007, autor1);
        miBiblioteca.agregarLibro("LOTR-01", "La Comunidad del Anillo", 1954, autor2);
        miBiblioteca.agregarLibro("LOTR-02", "Las dos torres", 1954, autor2);
        miBiblioteca.agregarLibro("LOTR-03", "El retorno del Rey", 1955, autor2);
        
        System.out.println("\n4. LISTAR LIBROS");
        miBiblioteca.listarLibros();

        System.out.println("\n5. BUSCAR LIBRO POR ISBN (978-0307743657)");
        Libro libroBuscado = miBiblioteca.buscarLibroPorIsbn("978-0307743657");
        if (libroBuscado != null) {
            System.out.println("Libro encontrado:");
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        System.out.println("\n6. FILTRAR LIBROS POR ANIO (1998)");
        miBiblioteca.filtrarLibrosPorAnio(1998);

        System.out.println("\n7. ELIMINAR LIBRO (978-0451169518) Y LISTAR");
        miBiblioteca.eliminarLibro("978-0451169518");
        System.out.println("--- Libros restantes ---");
        miBiblioteca.listarLibros();

        System.out.println("\n8. MOSTRAR CANTIDAD TOTAL DE LIBROS");
        int cantidad = miBiblioteca.obtenerCantidadLibros();
        System.out.println("La biblioteca tiene " + cantidad + " libros.");

        System.out.println("\n9. LISTAR AUTORES DISPONIBLES");
        miBiblioteca.mostrarAutoresDisponibles();
    }
}