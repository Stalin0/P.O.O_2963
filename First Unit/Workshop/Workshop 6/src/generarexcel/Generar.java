/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generarexcel;

import java.io.File;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 *
 * @author Usuario
 */
public class Generar {
    public void generarExcel(String [][] entrada, String ruta){
        WorkbookSetting conf=new WorkbookSetting();
        conf.setEncoding("ISO-8859-1");
        WritableWorkbook woorbook.createWorkbook(new File(ruta),conf);
        
        WritableSheet sheet=woorbook.createSheet("Resultado",0);
        WritableFont h=new WritableFont(WritableFont)
    }

    
}
