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
public class Movie {
    private String title;
    private String synopsis;
    private int year;
    private String genre;
    private String country;
    private Director director;
    
    public void dataEntry(){
        Scanner enter = new Scanner(System.in);
        System.out.println("*****Informacion de la pelicula****");
        try {
            System.out.println("Title: ");
            title = enter.nextLine();
            System.out.println("Synopsis: ");
            synopsis = enter.nextLine();
            System.out.println("Year: ");
            year = enter.nextInt();
            System.out.println("Genre: ");
            genre = enter.nextLine();
            System.out.println("country: ");
            country = enter.nextLine();  
        } catch (Exception e) {
            System.out.println("Opcion no existente");
            e.printStackTrace();
            
        }
        Director director = new Director();
        director.dataEntryDirector();
        this.director = director;
    }
    

    public void showInformation() {
        System.out.println("Informacion de las peliculas");
        System.out.println("Title: " + title);
        System.out.println("Synopsis: " + synopsis);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Country: " + country);
        this.director.showInformationS();
        
        
    }
}
