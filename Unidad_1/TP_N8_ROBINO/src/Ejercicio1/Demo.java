
package Ejercicio1;

public class Demo {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Raul Robino");

        Pedido pedido1 = new Pedido(cliente1);

        Producto laptop = new Producto("Laptop Lenovo", 1200.50);
        Producto mouse = new Producto("Mouse", 49.99);
        
        pedido1.agregarProducto(laptop);
        pedido1.agregarProducto(mouse);

        double totalPedido = pedido1.calcularTotal();
        System.out.println("TOTAL DEL PEDIDO: $" + String.format("%.2f", totalPedido));

        pedido1.setEstado("En preparacion");

        System.out.println("\nSIMULANDO PAGO CON TARJETA DE CREDITO");
        TarjetaCredito tc = new TarjetaCredito();
        
        double totalConDescuento = tc.aplicarDescuento(totalPedido);
        System.out.println("Nuevo total a pagar: $" + String.format("%.2f", totalConDescuento));
        
        tc.procesarPago(totalConDescuento);

        System.out.println("\nSIMULANDO PAGO CON PAYPAL");
        Pago paypal = new PayPal();
        
        paypal.procesarPago(totalPedido);
        System.out.println("\n");

        pedido1.setEstado("Enviado");
    }
}