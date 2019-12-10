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
public class G extends C{

    public G(I i, D d, E e) {
        super(d, e);
        this.i = i;
    }
    I i;

    


  

    @Override
    public String toString() {
        return "G{" + "i=" + i + '}';
    }
    
}
