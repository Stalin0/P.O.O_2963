/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.referenceddata;

/**
 *
 * @author Usuario
 */
public class ReferencedData {
    static int p = 5;
    static int q = 5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ReferencedData rp = new ReferencedData();
        System.out.println("after calling method");
        System.out.println("p --->" + p);
        System.out.println("q --->" + q);
        int r=0;
        r=sum(p,q);
        System.out.println("after calling method");
        System.out.println("p --->" + p);
        System.out.println("q --->" + q);
        System.out.println("Result --->" + r);
        Person person = new Person(1,"STALIN");
        System.out.println("before calling the method -->" + person);
        viewName(person);
        System.out.println("after calling the method--->" + person);
        
        
    }
    public static int sum(int a, int b){
        a=20;
        a=30;
        int c;
        c=a+b;
        return c;
    }
    public static void viewName(Person p){
        System.out.println("Person at first tine of method--->" + p);
        p.setId(10);
        p.setName("STALIN");
        System.out.println("Person at last Line --->"+p);
    }
}
