import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Scanner snc = new Scanner(System.in);
        // int [] vector = new int [5];

        ArrayList<Person> list = new ArrayList<Person>();

        while (true) {
            System.out.println("Enter your name and your age and dni: ");
            String aux = snc.nextLine();
            // aux = "STALIN 19 SANGOLQUI"
            String[] vector = aux.split(" ");
            // vector[0] = "STALIN"
            // vector[0] = "19"
            // vector[0] = "SANGOLQUI"
            if (aux.equals("")) {
                break;
            }
            String name = vector[0];
            int age = Integer.parseInt(vector[1]);
            String dni = vector[2];

            Person person = new Person(name, age, dni);

            list.add(person);

        }
        System.out.println("\n\nImpresion con for normal: ");
        for (int i = 0; i < list.size(); i++) {
            Person aux = list.get(i);
            System.out.println(aux.getName() + " - " + aux.getAge() + " - " + aux.getDni());

        }

        System.out.println("\n\nImpresion con for each: ");
        for (Person aux : list) {
            System.out.println(aux.getName() + " - " + aux.getAge() + " - " + aux.getDni());

        }
    }
    
}

