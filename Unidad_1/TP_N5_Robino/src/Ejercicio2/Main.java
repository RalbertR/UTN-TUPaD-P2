package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("MBH52323", 5000);
        Usuario usuarioCelu = new Usuario("Raul Robino", "33843588");
        Celular celular = new Celular("1234567890", "Samsung", "Galaxy S25", bateria, usuarioCelu);

        System.out.println("Usuario: " + celular.getUsuario().getNombre());
        System.out.println("Celular: " + celular.getMarca() + " " + celular.getModelo());
        System.out.println("Batería: " + celular.getBateria().getModelo() + " - " + celular.getBateria().getCapacidad() + " mAh");
    }
}