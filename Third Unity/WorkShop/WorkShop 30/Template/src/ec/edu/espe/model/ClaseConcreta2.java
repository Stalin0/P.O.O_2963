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

public class ClaseConcreta2 extends ClaseAbstracta
{
    public ClaseConcreta2(){
    }
    // ------------------------------------
    @Override
     public int multiplicar( int num )
    {
        return num * 1000;
    }
    // ------------------------------------
    @Override
     public int sumar( int num )
    {
        return num + 100;
    }
}