/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("Código QR generado: " + qr.getValor() +
                           " para usuario: " + qr.getUsuario().getNombre() +
                           " (Email: " + qr.getUsuario().getEmail() + ")");
    }
}