/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.model;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Director {
    private String name;
    private String last_name;
    private String country;
    

    public void dataEntryDirector() {
        Scanner enter = new Scanner(System.in);
        System.out.println("******Informacion del director****");
        try {
            System.out.println("Name: ");
            name = enter.nextLine();
            System.out.println("Last Name: ");
            last_name = enter.nextLine();
            System.out.println("Country: ");
            country = enter.nextLine();
            
        } catch (Exception e) {
            System.out.println("Formato no exixstente: ");
            e.printStackTrace();
        }
        
        
    }


    void showInformationS() {
        System.out.println("Informacion del director");
        System.out.println("Name : " + name);
        System.out.println("Last Name : " + last_name);
        System.out.println("Country : " + country);
    }
    
}
