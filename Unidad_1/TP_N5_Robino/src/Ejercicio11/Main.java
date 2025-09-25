package Ejercicio11;

public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista("Raul Robino", "Rock");
        Cancion cancion = new Cancion("Caminos Infinitos", artista);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }
}