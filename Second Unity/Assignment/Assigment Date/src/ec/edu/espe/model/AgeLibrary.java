package ec.edu.espe.model;
import java.text.DateFormat;
import java.util.Date;

public class AgeLibrary {

    public String restar_fecha(String fe_nacimiento) {

        String fechaInicio = fe_nacimiento;//"22/04/1988";
        String fechaActual;// = "";
        Date date = new Date();//Toma la fecha del sistema
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        fechaActual = df.format(date);
        String[] aFechaIng = fechaInicio.split("/");
        Integer diaInicio = Integer.parseInt(aFechaIng[0]);
        Integer mesInicio = Integer.parseInt(aFechaIng[1]);
        Integer anioInicio = Integer.parseInt(aFechaIng[2]);

        String[] aFecha = fechaActual.split("/");
        Integer diaActual = Integer.parseInt(aFecha[0]);
        Integer mesActual = Integer.parseInt(aFecha[1]);
        Integer anioActual = Integer.parseInt(aFecha[2]);

        System.out.println(diaActual);
        System.out.println(mesActual);
        System.out.println(anioActual);
        int b = 0;
        int day = 0;
        int mes = 0;
        int year = 0;
        int months = 0;
        mes = mesInicio - 1;
        if (mes == 2) {
            if ((anioActual % 4 == 0) && ((anioActual % 100 != 0) || (anioActual % 400 == 0))) {
                b = 29;
            } else {
                b = 28;
            }
        } else if (mes <= 7) {
            if (mes == 0) {
                b = 31;
            } else if (mes % 2 == 0) {
                b = 30;
            } else {
                b = 31;
            }
        } else if (mes > 7) {
            if (mes % 2 == 0) {
                b = 31;
            } else {
                b = 30;
            }
        }
        if ((anioInicio > anioActual) || (anioInicio == anioActual && mesInicio > mesActual)
                || (anioInicio == anioActual && mesInicio == mesActual && diaInicio > diaActual)) {
            System.out.println("La fecha de inicio debe ser anterior a la fecha Actual");
        } else {
            if (mesInicio <= mesActual) {
                year = anioActual - anioInicio;
                if (diaInicio <= diaActual) {
                    months = mesActual - mesInicio;
                    day = b - (diaInicio - diaActual);
                } else {
                    if (mesActual == mesInicio) {
                        year = year - 1;
                    }
                    months = (mesActual - mesInicio - 1 + 12) % 12;
                    day = b - (diaInicio - diaActual);
                }
            } else {
                year = anioActual - anioInicio - 1;
                System.out.println(year);
                if (diaInicio > diaActual) {
                    months = mesActual - mesInicio - 1 + 12;
                    day = b - (diaInicio - diaActual);
                } else {
                    months = mesActual - mesInicio + 12;
                    day = diaActual - diaInicio;
                }
            }
        }

        System.out.println("Años: " + year);
        System.out.println("Meses: " + months);
        System.out.println("Días: " + day);
        return "Years="+year+"Months="+months+"Day="+day;

    }

    public static void main(String[] args) {
        //new restar_fechas().restar_fecha();
    }
}