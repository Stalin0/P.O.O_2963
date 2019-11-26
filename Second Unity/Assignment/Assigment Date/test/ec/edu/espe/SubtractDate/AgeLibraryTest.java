/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.SubtractDate;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class AgeLibraryTest {
    
    public AgeLibraryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of subtract method, of class AgeLibrary.
     */
    @Test
    public void testSubtract(int GMT) {
        System.out.println("subtract");
        AgeLibrary instance = new AgeLibrary();
        Date expDate=util.Date: Thu May 20 19:01:46 GMT-05:00 2004

//Date expResult = null;
        Date result = instance.subtract();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
