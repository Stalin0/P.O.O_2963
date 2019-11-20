/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import ec.edu.espe.model.Byte;
import ec.edu.espe.model.Char;
import ec.edu.espe.model.Int;
import ec.edu.espe.model.Short;
import ec.edu.espe.model.Long;
import ec.edu.espe.model.Float;
import ec.edu.espe.model.Double;
import ec.edu.espe.model.Boolean;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner read = new Scanner(System.in);
        int opcion;
        try {
            do{
            
        
        System.out.println("****Menu de opciones**");
        System.out.println("1.- byte");
        System.out.println("2.- short");
        System.out.println("3.- int");
        System.out.println("4.- long");
        System.out.println("5.- float");
        System.out.println("6.- double");
        System.out.println("7.- char");
        System.out.println("8.- boolean");
        System.out.println("9.- exit");
        opcion = read.nextInt();
        
        
        switch(opcion)
        {
            case 1:
                System.out.println("The byte have a size of 8 bits and goes from -128 to 127");
                System.out.println("byte");
                Byte a = new Byte();
                a.Byte();
    
                
                
                break;
                
            case 2:
                System.out.println("The short have a size of 16 bits and goes from -32,768 a 32,767");
                System.out.println("short");
                Short b = new Short();
                b.Short();
                break;
            case 3:
                System.out.println("The int have a size 32 bits and goes from -2,147,483,648 a 2,147,483,647 ");
                System.out.println("int");
                Int c = new Int();
                c.Int();
                break;
            case 4: 
                System.out.println("The long have a size 64 bits and goes from -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807");
                System.out.println("long");
                Long d = new Long();
                d.Long();
                break;
            case 5:
                System.out.println("The float have a size 32 bits and goes form 1.4e-045 a 3.4e+0.38 ");
                System.out.println("float");
                Float e = new Float();
                e.Float();
                break;
            case 6:
                System.out.println("The double have a size 64 bits and goes form 4.9e-324 a 1.8e+308");
                System.out.println("double");
                Double f = new Double();
                f.Double();
                break;
            case 7:
                System.out.println("****The caracter****");
                System.out.println("char");
                Char g = new Char();
                g.Char();
                break;
            case 8:
                System.out.println("*****The boolean******");
                System.out.println("boolean");
                Boolean h = new Boolean();
                h.Boolean();
            
        }
        
        }while(opcion !=9);
            
        } catch (Exception e) {
        }

        
    }

    
}
        
    
    

