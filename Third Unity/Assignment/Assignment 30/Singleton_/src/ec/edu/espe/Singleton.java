/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Usuario
 */
public class Singleton {
    private String nombre;
    private static Singleton singleObj;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private Singleton() {
        this.nombre = "I'm a a single object";
        System.out.println(this.nombre);
    }

    public static Singleton getSingletonInstance() {
        if (singleObj == null){
            singleObj = new Singleton();
        }
        else{
            System.out.println("Imposible (ya existe un objeto de la clase Singleton)");
        }
        
        return singleObj;
    }
}
