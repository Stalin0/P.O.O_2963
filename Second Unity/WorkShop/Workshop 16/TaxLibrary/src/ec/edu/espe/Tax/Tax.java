/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Tax;
/** 
 * Tax computation class
 * @author STALIN RIVERA
 * @version version 0.0.1
 * @since 21 / 11 / 2019
 */


public class Tax {
    /**
     * tax value by ECUADOR
     */
    private static float ivaPorcentaje=12;
    
    /**
     * 
     * @param base the amount of money 
     * @return 
     */
    

    
    
    
    
    public static float computeIVA(float base){
        float iva;
        iva=base*0.12f;
        return iva;
    }
    
}
