
package Ejercicio13;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Raul Robino", "raulrobino@gmail.com");
        GeneradorQR generador = new GeneradorQR();
        generador.generar("QR123456", usuario);
    }
}
