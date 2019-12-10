/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class A {
        public A() {
        this.b=b;
        this.f=f;
        this.g=g;
        this.h=h;
        System.out.println("Building an A");
    }
    private B b [] = new B[3];
    private ArrayList<F> f = new ArrayList<>();
    private ArrayList<G> g = new ArrayList<>();
    private ArrayList<H>h = new ArrayList<>();
    @Override
    public String toString() {
        return "A{" + "b=" + b + ", f=" + f + ", g=" + g + ", h=" + h + '}';
    }



    
     }

