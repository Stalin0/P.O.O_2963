/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.SubtractDate;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

/**;
 *
 * @author Usuario
 */
public class SubtractDate {

    public Date subtract() {
        Scanner enter = new Scanner(System.in);
        try {
            
        

        String fechaInicio; // = "17/09/2000";
        System.out.println("Ingrese la fecha de nacimiento");
        fechaInicio=enter.next();
        
        String fechaActual = "21/11/2019";
        Date date = new Date();
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
        int month = 0;
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
            System.out.println("Esa fecha no existe no sea pendenjo");
            System.out.println("Esa fecha es muy avanzada ");
        } else {
            if (mesInicio <= mesActual) {
                year = anioActual - anioInicio;
                if (diaInicio <= diaActual) {
                    month = mesActual - mesInicio;
                    day = b - (diaInicio - diaActual);
                } else {
                    if (mesActual == mesInicio) {
                        year = year - 1;
                    }
                    month = (mesActual - mesInicio - 1 + 12) % 12;
                    day = b - (diaInicio - diaActual);
                }
            } else {
                year = anioActual - anioInicio - 1;
                System.out.println(year);
                if (diaInicio > diaActual) {
                    month = mesActual - mesInicio - 1 + 12;
                    day = b - (diaInicio - diaActual);
                } else {
                    month = mesActual - mesInicio + 12;
                    day = diaActual - diaInicio;
                }
            }
        }

        System.out.println("Your years is: " + year);
        System.out.println("Meses: " + month);
        System.out.println("Días: " + day);
        return date;
        } catch (Exception e) {
        }
        return null;

    }
  
}