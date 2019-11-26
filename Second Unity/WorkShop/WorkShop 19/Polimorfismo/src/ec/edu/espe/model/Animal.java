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
public class Animal {
    
    private int ID;
    private String name;

    public Animal(int ID, String name, String gender, float weight, cage cage) {
        System.out.println("Animal constructor");
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.cage = cage;
    }

    public Animal(int i, String pepito, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
        String animal;
        animal = ID + "," + name + "," + gender + "," + weight + "," + cage + ",";
        return animal;
    }
    private String gender;
    private float weight;
    private cage cage;

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the cage
     */
    public cage getCage() {
        return cage;
    }

    /**
     * @param cage the cage to set
     */
    public void setCage(cage cage) {
        this.cage = cage;
    }
    public static boolean Feed(){
        
        return true;
        
    }
    
}
