/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Proyecto: " + render.getProyecto().getNombre() +
                           " exportado en formato: " + render.getFormato() +
                           " (Duración: " + render.getProyecto().getDuracionMin() + " min)");
    }
}