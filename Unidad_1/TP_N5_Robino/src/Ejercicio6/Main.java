package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Raul Robino", "123456789");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-09-25", "20:30", cliente, mesa);

        System.out.println("Reserva para: " + reserva.getCliente().getNombre() +
                           " Tel: " + reserva.getCliente().getTelefono());
        System.out.println("Fecha: " + reserva.getFecha() + " Hora: " + reserva.getHora());
        System.out.println("Mesa N°: " + reserva.getMesa().getNumero() +
                           " Capacidad: " + reserva.getMesa().getCapacidad());
    }
}