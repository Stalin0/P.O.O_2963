import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    public static void main(String [] arg){

        Scanner lec = new Scanner(System.in);
        //int [] vector = new int [5];

        ArrayList<Person> list = new ArrayList<Person>();

        while(true){
            System.out.println("Enter your name and your age and dni: ");
            String aux = lec.nextLine();
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
            String dni =vector[2];



            Person person = new Person(name, age, dni);

            list.add(person);

        }
        String aux1=lec.next();
        int c, add=0, acum, subtract=0;
        for (int i = 0; i < aux1.length()-1; i++){
            c=Integer.parseInt(aux1.charAt(i)+"");
            if(i%2==0){
                c=c*2;
                if(c>9){
                    c=c-9;
                }
            }
            
            add=add+c;
            }
            if (add%10 !=0) {
                acum=((add/10)+1)*10;
                subtract=acum-add;
            }
        int ultimo=Integer.parseInt(aux1.charAt(9)+" ");
        
        if (ultimo==subtract) {
            System.out.println("The DNI does exist");
            }else{
                System.out.println("The DNI does not exist");
                }


        System.out.println("\n\nImpresion con for normal: ");
        for(int i=0; i < list.size(); i++){
            Person aux = list.get(i);
            System.out.println(aux.getName()+" - " + aux.getAge()+" - " + aux.getDni());

        }

        System.out.println("\n\nImpresion con for each: ");
        for(Person aux : list){
            System.out.println(aux.getName()+" - " + aux.getAge()+" - " + aux.getDni());

        }

    }
}