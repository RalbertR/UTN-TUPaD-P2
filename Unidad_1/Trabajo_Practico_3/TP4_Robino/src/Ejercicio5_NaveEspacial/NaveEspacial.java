package Ejercicio5_NaveEspacial;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int CAPACIDAD_MAXIMA = 50;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial <= CAPACIDAD_MAXIMA) {
            this.combustible = combustibleInicial;
        } else {
            this.combustible = CAPACIDAD_MAXIMA;
        }
    }

    public void despegar() {
        if (combustible > 0) {
            System.out.println("🚀 La nave " + nombre + " ha despegado!");
        } else {
            System.out.println("❌ No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia * 2; 
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("La nave " + nombre + " avanzó " + distancia + " km. Combustible consumido: " + consumo);
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > CAPACIDAD_MAXIMA) {
            combustible = CAPACIDAD_MAXIMA;
            System.out.println("La nave " + nombre + " se recargó al máximo (" + CAPACIDAD_MAXIMA + ").");
        } else {
            combustible += cantidad;
            System.out.println("La nave " + nombre + " recargó " + cantidad + " unidades de combustible.");
        }
    }

    // Método mostrar estado
    public void mostrarEstado() {
        System.out.println("Estado de la Nave");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + CAPACIDAD_MAXIMA);
    }
}
