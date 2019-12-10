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
public abstract class F extends C{
    private K k;
   

    public F(D d, E e) {
        super(d, e);
    }

    @Override
    public String toString() {
        return "F{" + "k=" + k + '}';
    }

}
