/**
 *
 * @author Stalin Rivera
 */
public class Main {

    /**
     */
   //public static Method g=new Method();
    public static Method g=new Method();
    public static void main(String[] args) {     
        
       String [][] entrada=new String[7][7];
        entrada[0][0]="Name";
        entrada[0][1]="last name";
        entrada[0][2]="day_Birth";
        entrada[0][3]="month_Birth";
        entrada[0][4]="year_Birth";
        entrada[0][5]="ID";
        entrada[0][6]="email";
        
        entrada[1][0]="Stalin";
        entrada[1][1]="Rivera";
        entrada[1][2]="17";
        entrada[1][3]="September";
        entrada[1][4]="2000";
        entrada[1][5]="0202472221";
        entrada[1][6]="stalinrivera1980@gmail.com";
        
       Method m=new Method();
      //  m.ruta("Hoja.xlsx")
        String ruta = ("Hoja1.xls");
       // String ruta="C:\Users\Usuario\Documents\NetBeansProjects\Data_2\hoja.xls";
       g.Datas(entrada, ruta);
    }
    
}
