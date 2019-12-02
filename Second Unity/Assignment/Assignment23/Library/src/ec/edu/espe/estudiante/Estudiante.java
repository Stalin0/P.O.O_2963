/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.estudiante;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author STALIN RIVERA y DENNIS PARRA
 */
public class Estudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name = null, last_name = null;
        int number = 0, dni = 0;
        Scanner read = new Scanner(System.in);
        int opcion;
        Scanner entrada = new Scanner(System.in);
        int notas;

        File estudiante = new File("Estudiante.csv");
        do {

            System.out.println("*********Menu de opciones*******");
            System.out.println("1.- Ingresar");
            System.out.println("2.- Leer");
            System.out.println("3.- Salir");

            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos");
                    if (!estudiante.exists()) {
                        try {
                            estudiante.createNewFile();
                            System.out.println("Escriba su nombre: ");
                            name = entrada.next();
                            System.out.println("Escriba su apellido: ");
                            last_name = entrada.next();
                            System.out.print("Enter number of phone: ");
                            number = entrada.nextInt();
                            System.out.println("Escriba su numero de cedula: ");
                            dni = entrada.nextInt();
                            PrintWriter mostrar;
                            try (FileWriter escribir = new FileWriter(estudiante, true)) {
                                mostrar = new PrintWriter(escribir);
                                mostrar.println("Nombre: " + name);
                                mostrar.println("Apellido: " + last_name);
                                mostrar.println("Numero celular: " + number);
                                mostrar.println("Numero de cedula: " + dni);
                                mostrar.println("");
                            }
                            mostrar.close();
                        } catch (IOException ex) {
                        }

                    } else {
                        try {
                            //arch.createNewFile();
                            System.out.print("Escriba su nombre: ");
                            name = entrada.next();
                            System.out.print("Escriba su apellido:  ");
                            last_name = entrada.next();
                            System.out.print("Ingrese el numero de celular personal: ");
                            number = entrada.nextInt();
                            System.out.println("Ingrese su numero de cedula: ");
                            dni = entrada.nextInt();
                            PrintWriter mostrar;
                            try (FileWriter escribir = new FileWriter(estudiante, true)) {
                                mostrar = new PrintWriter(escribir);
                                mostrar.println("Nombre: " + name);
                                mostrar.println("Apellido: " + last_name);
                                mostrar.println("Numero celular: " + number);
                                mostrar.println("Numero de cedula: " + dni);
                                mostrar.println("");
                            }
                            System.out.println("Muestra de los datos");

                            System.out.println("");
                            System.out.println("Nombre: " + name);
                            System.out.println("Apellido: " + last_name);
                            System.out.println("Numero de celular personal: " + number);
                            System.out.println("Numero de cedula: " + dni);
                            mostrar.close();
                        } catch (IOException ex) {
                        }
                    }

                    break;

                case 2:
                    CSVReader reader = null;
                    String archCSV = "Estudiante.csv";
                   
                    String[] fila = null;
                    while ((fila = reader.readNext()) != null) {
                        System.out.println(fila[0]
                                + " | " + fila[1]
                                + " |  " + fila[2]);
                    }
                    System.out.println("");
                            System.out.println("Nombre: " + name);
                            System.out.println("Apellido: " + last_name);
                            System.out.println("Numero de celular personal: " + number);
                            System.out.println("Numero de cedula: " + dni);                       

                    reader.close();

                    break;

                default:
                    System.out.println("Gracias por utilizar este programa, hasta pronto!");
                    break;
            }

        } while (opcion != 3);
    }

}
