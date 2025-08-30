package Ejercicio11_DescuentoEspecial;

import java.util.Scanner;

public class CalculoDescuentoEspecial {
    static double porcentaje = 0.10;
    
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * porcentaje;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        
        double precio = sc.nextDouble();
        
        calcularDescuentoEspecial(precio);
        
        sc.close();
    }
}
