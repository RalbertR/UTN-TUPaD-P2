
package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
        System.out.println("Producto '" + p.getNombre() + "' agregado.");
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario esta vacio.");
            return;
        }
        for (Producto p : this.productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : this.productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarProducto(String id) {
        boolean eliminado = this.productos.removeIf(p -> p.getId().equalsIgnoreCase(id));
        
        if (eliminado) {
            System.out.println("Producto con ID " + id + " eliminado.");
        } else {
            System.out.println("No se encontro producto con ID " + id + ".");
        }
        return eliminado;
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock de '" + p.getNombre() + "' actualizado a " + nuevaCantidad);
        } else {
            System.out.println("Error al actualizar: Producto no encontrado.");
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("Productos de la categoria: " + categoria );
        boolean encontrados = false;
        for (Producto p : this.productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No hay productos en esta categoria.");
        }
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : this.productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (this.productos.isEmpty()) {
            return null;
        }

        Producto conMayorStock = this.productos.get(0);
        for (Producto p : this.productos) {
            if (p.getCantidad() > conMayorStock.getCantidad()) {
                conMayorStock = p;
            }
        }
        return conMayorStock;
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("Productos con precio entre $" + min + " y $" + max);
        boolean encontrados = false;
        for (Producto p : this.productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No hay productos en ese rango de precio.");
        }
    }

    public void filtrarProductosPorPrecio(double max) {
        this.filtrarProductosPorPrecio(0, max);
    }

    public static void mostrarCategoriasDisponibles() {
        System.out.println("--- Categorias Disponibles ---");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat.name() + ": " + cat.getDescripcion());
        }
    }
}