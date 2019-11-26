/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.runtime.regexp.RegExpFactory.validate;

/**
 *
 * @author STALIN RIVERA
 */
public class Age {
    private Date actualDate = new Date();
    public Date validateDate(String date){
        Date validate = null;
        Date dates;
        try {
            dates = new SimpleDateFormat("dd/MM/YYYY").parse(date);
            String dateString = new SimpleDateFormat("dd/MM/YYYY").format(dates);
            
            
            if(dateString.equals(date)){
                validate = dates;
                if(dates.before(actualDate)){
                    
                    return dates;
                }
            }
        } catch (ParseException e) {
            Logger.getLogger(Age.class.getName().log(Level.SEVERE));
            Logger.getLogger(Age.class.getName().log(Level.SEVERE, null, ex));
        }
        return null;
        
        
    }
    return validate;
    
}
