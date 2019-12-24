/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Matrices.controller;

/**
 *
 * @author Usuario
 */
import java.util.*;

public class Matrix {

    public void Matrix() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the number row: ");
        int Filas = enter.nextInt();
        System.out.println("Enter the number Columns: ");
        int Columnas = enter.nextInt();

        int matrix1[][] = new int[Filas][Columnas];
        int matrix2[][] = new int[Filas][Columnas];
        System.out.println("The matrix is ​​filled A");
        System.out.println();
        for (int m = 0; m < Filas; m++) {
            for (int n = 0; n< Columnas; n++) {
                System.out.print("Enter the value of the row " + m + " of the Column " + n + ": ");
                matrix1[m][n] = enter.nextInt();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(" The matrix is ​​filled B");
        System.out.println();
        for (int m = 0; m < Filas; m++) {
            for (int n = 0; n < Columnas; n++) {
                System.out.print("Enter the value of the row " + m + " of the Column " + n + ": ");
                matrix2[m][n] = enter.nextInt();
            }
            System.out.println();
        }
        
        int xRs[][] = new int[Filas][Columnas];
        for (int i = 0; i < Filas; i++) {
            for (int w = 0; w < Columnas; w++) {
                xRs[i][w] = matrix1[i][w] + matrix2[i][w];
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("      Suma de las Matrices A y B");

        for (int i = 0; i < Filas; i++) {
            for (int w = 0; w < Columnas; w++) {
                System.out.println("   " + matrix1[i][w] + " + " + matrix2[i][w] + " = " + xRs[i][w]);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("      Matriz Resultante");

        for (int i = 0; i < Filas; i++) {
            System.out.print("\t");
            for (int w = 0; w < Columnas; w++) {
                System.out.print(xRs[i][w] + "\t");
            }
            System.out.println();
        }

    }

}
