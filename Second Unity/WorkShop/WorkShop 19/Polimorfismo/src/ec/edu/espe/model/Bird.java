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
public class Bird extends Animal {
    /**
     * wingSize Este se usa para medir a las aves
     */
    int wingSize;
    /**
     * fly vuela o no vuela Tru si vuela o False si no vuela
     */
    boolean fly;

    public Bird(int wingSize, boolean fly, int ID, String name, String gender, float weight, ec.edu.espe.model.cage cage) {
        super(ID, name, gender, weight, cage);
        this.wingSize = wingSize;
        this.fly = fly;
    }

    public Bird(int ID, String name, String gender, float weight, ec.edu.espe.model.cage cage) {
        super(ID, name, gender, weight, cage);
    }

    public int getWingSize() {
        return wingSize;
    }

    public void setWingSize(int wingSize) {
        this.wingSize = wingSize;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }
    
    
}
