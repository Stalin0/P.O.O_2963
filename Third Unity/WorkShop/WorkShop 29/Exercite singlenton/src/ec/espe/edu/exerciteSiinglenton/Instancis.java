/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.exerciteSiinglenton;

/**
 *
 * @author Cristian Arauz
 */
public class Instancis {
    private  static Instancis log;
    private String value;
    
    private Instancis(){
        
    }
public static Instancis getInstance(){
        
        if(log == null){
            log = new Instancis();
        }return log;
    }
public void log(String msg){
    System.out.println(msg);
    }
public void setValue(String msg){
    value = msg;
}
public String getValue(){
    return value;
}

}
