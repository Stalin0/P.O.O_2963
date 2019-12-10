/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.interface1;

import ec.edu.espe.controller.Animal;
import ec.edu.espe.controller.Monkey;

/**
 *
 * @author Usuario
 */
public class Interface
        
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal;
        animal = new Monkey();
        System.out.println(animal);
       
    }
    
}
