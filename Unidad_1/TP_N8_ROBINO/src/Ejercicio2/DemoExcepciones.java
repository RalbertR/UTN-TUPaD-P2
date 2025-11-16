/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoExcepciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "ISO-8859-1");

        ejercicio1DivisionSegura(scanner);
        ejercicio2ConversionNumerica(scanner);
        ejercicio3LecturaArchivo(scanner);
        ejercicio4ExcepcionPersonalizada(scanner);
        ejercicio5TryWithResources(scanner);

        scanner.close();
        System.out.println("\nDemostracion de excepciones finalizada.");
    }

    public static void ejercicio1DivisionSegura(Scanner scanner) {
        System.out.println("\n--- Ejercicio 1: Division Segura ---");
        try {
            System.out.print("Introduce el dividendo: ");
            int dividendo = scanner.nextInt();
            
            System.out.print("Introduce el divisor: ");
            int divisor = scanner.nextInt();
            
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("ERROR: No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Debe introducir numeros enteros.");
            scanner.next(); 
        }
    }

    public static void ejercicio2ConversionNumerica(Scanner scanner) {
        System.out.println("\n--- Ejercicio 2: Conversion de Cadena ---");
        scanner.nextLine(); 
        
        System.out.print("Introduce un numero (texto): ");
        String texto = scanner.nextLine();
        
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Numero convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("ERROR: '" + texto + "' no es un numero valido.");
        }
    }

    public static void ejercicio3LecturaArchivo(Scanner scanner) {
        System.out.println("\n--- Ejercicio 3: Lectura de Archivo ---");
        System.out.print("Introduce el nombre del archivo (ej: inexistente.txt): ");
        String nombreArchivo = scanner.nextLine();
        
        try {
            File archivo = new File(nombreArchivo);
            Scanner lectorArchivo = new Scanner(archivo);
            
            System.out.println("Contenido de " + nombreArchivo + ":");
            while (lectorArchivo.hasNextLine()) {
                System.out.println(lectorArchivo.nextLine());
            }
            lectorArchivo.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado '" + nombreArchivo + "'.");
        }
    }

    private static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120.");
        }
    }

    public static void ejercicio4ExcepcionPersonalizada(Scanner scanner) {
        System.out.println("\n--- Ejercicio 4: Excepcion Personalizada ---");
        try {
            System.out.print("Introduce una edad para validar: ");
            int edad = scanner.nextInt();
            validarEdad(edad);
            System.out.println("Edad validada correctamente: " + edad);
            
        } catch (EdadInvalidaException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Debe introducir un numero entero.");
            scanner.next(); 
        }
        scanner.nextLine(); 
    }

    public static void ejercicio5TryWithResources(Scanner scanner) {
        System.out.println("\n--- Ejercicio 5: Try-with-resources ---");
        String nombreArchivo = "datos.txt";

        try (PrintWriter writer = new PrintWriter(nombreArchivo)) {
            writer.println("Esta es la primera linea.");
            writer.println("Esta es la segunda linea.");
            System.out.println("...Archivo de ejemplo '" + nombreArchivo + "' creado.");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR al crear archivo: " + e.getMessage());
            return;
        }

        System.out.println("Leyendo el archivo con try-with-resources:");
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("ERROR de E/S al leer el archivo: " + e.getMessage());
        }
    }
}