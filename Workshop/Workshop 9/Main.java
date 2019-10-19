import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    public static void main(String [] arg){
        Scanner scn = new Scanner(System.in);

        //int [] vector = new int [5];

        ArrayList<Person> list = new ArrayList<Person>();

        while(true){
            System.out.println("Enter your name and your age: ");
            String aux = scn.nextLine();

            // aux = "STALIN  19 SANGOLQUI"

            String [] vector = aux.split(" ");
            // vector[0] = "STALIN"
            // vector[0] = "19"
            // vector[0] = "SANGOLQUI"
            if(aux.equals("")){
                break;
            }
            String name = vector[0];
            int age = Integer.parseInt(vector[1]);


            Person person = new Person(name, age);

            list.add(person);

        }

        System.out.println("\n\nImpresion con for normal: ");
        for(int i=0; i < list.size(); i++){
            Person aux = list.get(i);
            System.out.println(aux.getName()+" - " + aux.getAge());

        }

        System.out.println("\n\nImpresion con for each: ");
        for(Person aux : list){
            System.out.println(aux.getName()+" - " + aux.getAge());

        }

    }
}