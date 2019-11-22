/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model.Accounts;

import java.util.Date;
import ec.edu.espe.model.Accounts.Username;

/**
 *
 * @author Usuario
 */
public class Account {
    private String label;
    private String createOndate;
    private Date lastModifiedOn;
    
    private Password[] password;
    private Username[] userName;
}
