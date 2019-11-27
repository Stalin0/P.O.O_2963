
package ec.edu.espe.model;

/**
 *
 * @author Lenovo
 */
public class Bird extends Animal {
    /**
     * the whing size in milimeters
     */
    private int wingSize;
    private String feathers;
    /**
     *  true if it flies, false if it flies
     */
    private String name;

    
    private boolean fly;
    public Bird(int id, String name, String gender, float weight, Cage cage, boolean feed) {
        super(id, name, gender, weight, cage, feed);
        System.out.println("Bird Constructor");
        this.wingSize = wingSize;
        this.feathers = feathers;
        this.name = name;
        this.fly = fly;
        this.feather = feather;
        this.cage = cage;
    }
    
    

    @Override
    public String toString() {
        return "Bird{" + "wingSize= 2" + getWingSize() + ", feathers=RED" + getFeathers() + ", name=" + getName() + ", fly=" + isFly() + ", feather=" + getFeather() + ", cage=" + getCage() + '}';
    }

    public int getWingSize() {
        return wingSize;
    }

    public void setWingSize(int wingSize) {
        this.wingSize = wingSize;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public String getFeather() {
        return feather;
    }

    public void setFeather(String feather) {
        this.feather = feather;
    }

    @Override
    public Cage getCage() {
        return cage;
    }

    @Override
    public void setCage(Cage cage) {
        this.cage = cage;
    }

    
    private String feather;
    private Cage cage;

    


    
    

    
}
