import java.util.ArrayList;
import java.util.Scanner;

public class Person{

    private String name;
    private int age;
    private String dni;

    public Person(){


    }

    public Person(String name, int age, String dni){
        this.name=name;
        this.age=age;
        this.dni=dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

	public static void main(String [] arg){
	
	    Scanner scn = new Scanner(System.in);
	    Scanner lec = new Scanner(System.in);
	    //int [] vector = new int [5];
	
	    ArrayList<Person> list = new ArrayList<Person>();
	
	    while(true){
	        System.out.println("Enter your name and your age: ");
	        String aux = scn.nextLine();
	
	        String aux1=lec.nextLine();
	        
	
	        // aux = "STALIN  19 SANGOLQUI"
	
	        String [] vector = aux.split(" ");
	        String [] vector = aux1.split(" ");
	        // vector[0] = "STALIN"
	        // vector[0] = "19"
	        // vector[0] = "SANGOLQUI"
	        if(aux.equals("")){
	            break;
	        }
	        String name = vector[0];
	        int age = Integer.parseInt(vector[1]);
	        String aux1 =vector[2];
	
	
	
	        Person person = new Person(name, age, dni);
	
	        list.add(person);
	
	    }
	    String aux1=lec.next();
	    int c, suma=0, acum, resta=0;
	    for (int i = 0; i < aux1.length()-1; i++){
	        c=Integer.parseInt(aux1.charAt(i)+"");
	        if(i%2==0){
	            c=c*2;
	            if(c>9){
	                c=c-9;
	            }
	        }
	        
	        suma=suma+c;
	        }
	        if (suma%10 !=0) {
	            acum=((suma/10)+1)*10;
	            resta=acum-suma;
	        }
	    int ultimo=Integer.parseInt(aux1.charAt(9)+"");
	    
	    if (ultimo==resta) {
	        System.out.println("la cédula ingresa es correcta");
	        }else{
	            System.out.println("la cedula es incorrecta");
	            }
	
	
	    System.out.println("\n\nImpresion con for normal: ");
	    for(int i=0; i < list.size(); i++){
	        Person aux = list.get(i);
	        System.out.println(aux.getName()+" - " + aux.getAge()+" - " + aux1.getDni());
	
	    }
	
	    System.out.println("\n\nImpresion con for each: ");
	    for(Person aux : list){
	        System.out.println(aux.getName()+" - " + aux.getAge()+" - " + aux1.getDni());
	
	    }
	
	}
    

}