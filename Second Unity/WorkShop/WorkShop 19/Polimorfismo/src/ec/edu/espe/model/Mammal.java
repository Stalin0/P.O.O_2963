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
public class Mammal extends Animal {
    private boolean isBreastFeiding;

    public Mammal(boolean isBreastFeiding, int ID, String name, String gender, float weight, ec.edu.espe.model.cage cage) {
        super(ID, name, gender, weight, cage);
        this.isBreastFeiding = isBreastFeiding;
    }
    @Override
    public String toString(){
        String mammal;
        mammal = isBreastFeiding + "," ;
        return mammal;
        
    }
        
    
   

    /**
     * @return the isBreastFeiding
     */
    public boolean isIsBreastFeiding() {
        return isBreastFeiding;
    }

    /**
     * @param isBreastFeiding the isBreastFeiding to set
     */
    public void setIsBreastFeiding(boolean isBreastFeiding) {
        this.isBreastFeiding = isBreastFeiding;
    }
    
}
