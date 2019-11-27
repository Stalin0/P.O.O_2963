/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.model.Animal;
import ec.edu.espe.model.Bird;
import ec.edu.espe.model.Cage;
import ec.edu.espe.model.Monkey;

/**
 *
 * @author Lenovo
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cage cage = new Cage("algo",1,1);
        Animal animal = new Animal(1, "pepito", "masculino", 5, cage);
        Monkey monkey = new Monkey(1, "HILLS", "MALE", 0, cage);
        
        Bird bird = new Bird(2, "THE LAGRIMITA", "MALE", 2, cage, true);
        System.out.println(animal);
        System.out.println(bird);
        System.out.println(monkey);
    }
    
}
