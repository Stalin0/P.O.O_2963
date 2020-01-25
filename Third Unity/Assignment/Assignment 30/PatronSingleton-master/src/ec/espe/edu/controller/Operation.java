/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel Castillo
 */
public class Operation {
    
    private static Operation instancia;
    
    private Operation(){}
    
    public static Operation getInstancia(){
        if (instancia == null){
            instancia = new Operation();
        }
        return instancia;
        
    }
    
    public void Principal (){
        
        int opcion = 0;
        do{
           opcion = Integer.parseInt(JOptionPane.showInputDialog("Operaciones calculo"
            +"\n\n1. Sumar.\n2. Restar.\n3. Multiplicar.\n4. Salir"));
        switch(opcion){
            case 1:
                sumar();
                break;
            case 2:
                restar();
                break;
            case 3:
                multiplicar();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Fin de la ejecucion");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida");
        }
        
        
        } while (opcion !=3);
    }

    private void sumar() {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
        JOptionPane.showMessageDialog(null, "Suma: "+(numero1+numero2));
    }

    private void restar() {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
        JOptionPane.showMessageDialog(null, "Suma: "+(numero1-numero2));
    }
    private void multiplicar(){
        int numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
        JOptionPane.showMessageDialog(null, "Multiplicar: "+(numero1*numero2));
    }
    
}
