/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Raul Robino", "raulrobino@gmail.com");
        Documento documento = new Documento("Contrato", "Cosas muy importantes contractuales", "HASH1234512312312", "2025-09-24", usuario);

        System.out.println("Documento: " + documento.getTitulo());
        System.out.println("Contenido: " + documento.getContenido());
        System.out.println("Firma Hash: " + documento.getFirmaDigital().getCodigoHash() + " Fecha: " + documento.getFirmaDigital().getFecha());
        System.out.println("Firmado por: " + documento.getFirmaDigital().getUsuario().getNombre() + " Email: " + documento.getFirmaDigital().getUsuario().getEmail());
    }
}