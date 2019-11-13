/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie;

import ec.espe.edu.model.Movie;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author STALIN RIVERA
 * 
 */
public class MovieManage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Movie> listMovie = new ArrayList<>();
        Scanner enter = new Scanner(System.in);
        
        
        int option;
        boolean exist = false;
        while(!exist){
            System.out.println("****Sistema de peliculas********");
            System.out.println("1.-Ingresar pelicula: ");
            System.out.println("2.-Mostrar pelicula: ");
            System.out.println("3.-Salir pelicula: ");
            
            System.out.println("******GRACIAS POR SU ATENCION****");
            option = enter.nextInt();
            
            switch(option){
                case 1:
                    Movie pelicula = new Movie();
                    pelicula.dataEntry();
                    listMovie.add(pelicula);
                    break;
                case 2:
                    for (int i = 0; i<listMovie.size();i++){
                        listMovie.get(i).showInformation();
                    }
                    break;
                case 3:
                    exist = true;
                    break;
                default:
                    System.out.println("Esta opcion no existe");
            }
            
        }
    }
    
}
