
package Ejercicio1;

public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        System.out.println("1. AGREGAR PRODUCTOS");
        inventario.agregarProducto(new Producto("P001", "Computadora", 850000, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P002", "Camiseta", 15000, 50, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P003", "Arroz por 1 Kilo", 1800, 100, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P004", "Silla Oficina", 45000, 20, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P005", "Teclado Mecanico", 29990, 30, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P006", "Taza", 2500, 40, CategoriaProducto.HOGAR));


        System.out.println("\n2. LISTAR PRODUCTOS");
        inventario.listarProductos();


        System.out.println("\n3. BUSCAR PRODUCTO POR ID");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) {
            System.out.println("Producto encontrado:");
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto P003 no encontrado.");
        }


        System.out.println("\n4. FILTRAR POR CATEGORIA");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);


        System.out.println("\n5. ELIMINAR PRODUCTO");
        inventario.eliminarProducto("P004");
        System.out.println("--- Lista de productos restantes ---");
        inventario.listarProductos();


        System.out.println("\n6. ACTUALIZAR STOCK");
        inventario.actualizarStock("P001", 15);
        buscado = inventario.buscarProductoPorId("P001");
        if (buscado != null) {
            buscado.mostrarInfo();
        }


        System.out.println("\n7. OBTENER TOTAL STOCK");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("El total de unidades en stock es: " + totalStock);


        System.out.println("\n8. OBTENER PRODUCTO CON MAYOR STOCK");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("El producto con mayor stock es:");
            mayorStock.mostrarInfo();
        }


        System.out.println("\n9. FILTRAR PRECIOS ENTRE $1000 A $3000");
        inventario.filtrarProductosPorPrecio(1000, 3000);


        System.out.println("\n10. MOSTRAR CATEGORIAS DISPONIBLES");
        Inventario.mostrarCategoriasDisponibles();
    }
}