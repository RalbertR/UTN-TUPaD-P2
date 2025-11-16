/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;
import java.util.ArrayList;
import java.util.List;

public class MainAnimales {
    public static void main(String[] args) {
        System.out.println("Kata 4: Animales");
        
        List<Animal> granja = new ArrayList<>();
        granja.add(new Perro("Fido"));
        granja.add(new Gato("Misu"));
        granja.add(new Vaca("Lola"));
        granja.add(new Animal("Animal Raro")); 

        for (Animal animal : granja) {
            animal.describirAnimal();
        }
    }
}
