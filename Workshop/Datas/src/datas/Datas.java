/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datas;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Stalin Rivera
 */


public class Datas {

    
    public static void main(String[] args) {
        
    Scanner enter= new Scanner(System.in);
    
    File estudiante = new File ("Datas.xls");
    
    String name, last_name, month_birth, email;
    int day_birth, year_birth, ID, phone_ = 0;
        
    if(!estudiante.exists()){
        try {
            estudiante.createNewFile();
            System.out.println("Enter your name please: ");
            name = enter.next();
            System.out.println("Enter your last name please: ");
            last_name = enter.next();
            System.out.println("Enter the month of your birth: ");
            month_birth = enter.next();
            System.out.println("Enter the day of your birth: ");
            day_birth = enter.nextInt();            
            System.out.print("Enter the year of your birth: ");
            year_birth = enter.nextInt();            
            System.out.print("Enter your personal ID: ");
            ID = enter.nextInt();
            System.out.print("Enter your phone number please: ");
            phone_ = enter.nextInt();
            System.out.print("Enter your mail please: ");
            email = enter.next();
                            
            PrintWriter show;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
            show = new PrintWriter(escribir);
                show.println("Name: " + name );
                show.println("Last name: " + last_name );
                show.println("date of birth: " + month_birth + " / " + day_birth + " / " + year_birth );
                show.println("ID: " + ID);
                show.print("Phone number: "+ phone_);
                show.print("Personal mail: "+ email);
                show.println("");
            }
            show.close();
        } catch (IOException ex) {
        }
               
    }
    else{
        try {
            System.out.print("Enter your name please: ");
            name = enter.next();
            System.out.print("Enter your last name please: ");
            last_name = enter.next();
            System.out.print("Enter the month of your birth: ");
            month_birth = enter.next();
            System.out.print("Enter the day of your birth: ");
            day_birth = enter.nextInt();            
            System.out.print("Enter the year of your bith: ");
            year_birth = enter.nextInt();            
            System.out.print("Enter your personal ID: ");
            ID = enter.nextInt();
            System.out.print("Enter your phone number please: ");
            phone_ = enter.nextInt();
            System.out.print("Enter your mail please: ");
            email = enter.next();
            
           
                
            PrintWriter Show;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
                Show = new PrintWriter(escribir);
                Show.println("Name: "+ name);
                Show.println("Last name: "+ last_name);
                Show.println("Date of birth: " + month_birth +  " / " + day_birth + " / " + year_birth );
                Show.println("ID: "+ ID);
                Show.println("Phone number: "+ phone_);
                Show.println("Personal mail: "+ email);
                
               
                Show.println("");
            }
            Show.close();
        } catch (IOException ex) {
        }
    }
    }
    
}