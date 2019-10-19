import java.io.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author Stalin Rivera
 */
public class Method {

    public void Datas(String[][] entrada, String ruta) {
        try {

            WorkbookSettings conf = new WorkbookSettings();
            conf.setEncoding("Hoja1");

            WritableWorkbook woorBook = Workbook.createWorkbook(new File(ruta), conf);

            WritableSheet sheet = woorBook.createSheet("Resultados", 0);

            WritableFont h = new WritableFont(WritableFont.COURIER, 16, WritableFont.NO_BOLD);
            WritableCellFormat hFormat = new WritableCellFormat(h);

            for (int i = 0; i < entrada.length; i++) {
                for (int j = 0; j < entrada[i].length; j++) {

                    sheet.addCell(new jxl.write.Label(j, i, entrada[i][j], hFormat));

                }
            }
            woorBook.write();
            woorBook.close();

        } catch (IOException | WriteException ex) {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
