/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Tax;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class TaxTest {
    
    public TaxTest() {
    }
    


    /**
     * Test of computeIVA method, of class Tax.
     */
    @Test
    public void testComputeIVA() {
        System.out.println("computeIVA");
        float base = 10f;
        float expResult = 1.2F;
        
        float result = Tax.computeIVA(base);
        assertEquals(expResult, result, 10);
        assertEquals(expResult, result, 10.00f);
        
        
        
    }
    @Test
    public void testComputeIVAdecimal() {
        System.out.println("computeIVA");
        float base = 50388.37f;
        float expResult = 6046.F;
        
        float result = Tax.computeIVA(base);
        assertEquals(expResult, result, 50388.37f);
        
        
    }
    
    
}
