package ec.edu.espe.chickenfarmer.view;

import ec.edu.espe.chickenfarmers.model.Chicken;

/**
 *
 * @author Satalin Rivera
 */
public class ChickenFarmers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chicken chicken;
        chicken = new Chicken();
        chicken.setName("Lucy");
        chicken.doStuff(0);
        
    }
    
}
