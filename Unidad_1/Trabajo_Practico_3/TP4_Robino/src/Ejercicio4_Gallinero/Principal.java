package Ejercicio4_Gallinero;

public class Principal {
    public static void main(String[] args) {

        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 1); 

        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.ponerHuevo();
        g2.envejecer();

        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
