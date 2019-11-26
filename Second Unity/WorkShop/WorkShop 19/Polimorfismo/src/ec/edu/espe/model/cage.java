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
class cage {
    private int ID;
    private String material;
    private int xPosition;

    @Override
    public String toString() {
        return "cage{" + "ID=" + ID + ", material=" + material + ", xPosition=" + xPosition + ", yPosition=" + yPosition + '}';
    }
    

    public cage(int ID, String material, int xPosition, int yPosition) {
        this.ID = ID;
        this.material = material;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        
    }
    
    private int yPosition;

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
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the xPosition
     */
    public int getxPosition() {
        return xPosition;
    }

    /**
     * @param xPosition the xPosition to set
     */
    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    /**
     * @return the yPosition
     */
    public int getyPosition() {
        return yPosition;
    }

    /**
     * @param yPosition the yPosition to set
     */
    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
    
    
}
