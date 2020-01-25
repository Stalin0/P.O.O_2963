/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.exerciteSiinglenton;

/**
 *
 * @author Cristian Arauz
 */
public class Singlenton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instancis instancis_1 = Instancis.getInstance();
        Instancis instancis_2 = Instancis.getInstance();
        
        instancis_1.setValue("Soy el precidente");
        System.out.println(instancis_2.getValue());
    }
    
}
