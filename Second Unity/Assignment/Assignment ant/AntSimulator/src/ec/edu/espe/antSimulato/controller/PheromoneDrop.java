/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antSimulato.controller;

/**
 *
 * @author STALIN RIVERA y JORGE RAMOS
 */
public class PheromoneDrop {
    String mone =("hojas" + "azucar" + "Polen");
String pheromone = ("sobrevive" + " trabaja" + " forman colonias");
	private int currentLevel;

	public void run() {
		// TODO - implement PheromoneDrop.run
        System.out.println("Las pheromonas de la hormiga son: " + " " + pheromone);
            System.out.println("las hormigas su comida es: " + " " + mone);
	}

}