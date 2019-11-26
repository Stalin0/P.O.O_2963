/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Usuario
 */
public class Monkey extends Mammal{
    private int tail; 
    public Monkey(int tail, boolean isBreastFeiding, int ID, String name, String gender, float weight, ec.edu.espe.model.cage cage) {
        super(isBreastFeiding, ID, name, gender, weight, cage);
        this.tail = tail;
    }

    /**
     * @return the tail
     */
    public int getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(int tail) {
        this.tail = tail;
    }
    
    
    
}
