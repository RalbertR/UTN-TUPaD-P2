package Ejercicio11;

class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() + 
                           " de " + cancion.getArtista().getNombre() + 
                           " [" + cancion.getArtista().getGenero() + "]");
    }
}