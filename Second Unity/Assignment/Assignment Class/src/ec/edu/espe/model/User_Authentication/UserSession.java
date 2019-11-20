/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model.User_Authentication;
import ec.edu.espe.model.KeyClass.User;

/**
 *
 * @author Usuario
 */
public class UserSession {
    private User user;

    public UserSession(User user) {
        this.user = user;
    }

    public UserSession() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
  
    public void ClearUser(){
        
    }
   
}
