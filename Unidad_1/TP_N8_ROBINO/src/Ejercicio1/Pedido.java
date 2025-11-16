/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    
    private List<Producto> productos;
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        this.cliente.notificar("El estado de su pedido ha cambiado a: " + this.estado);
    }

    public String getEstado() {
        return estado;
    }
}