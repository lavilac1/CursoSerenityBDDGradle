package mystore.Utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.logging.Logger;
import java.util.logging.Level;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReader {

    private static final Logger LOGGER = Logger.getLogger(ExcelReader.class.getName());

   
    public static Sheet ObtenerDatosHojaExcel(String strRutaArchivo, String strHoja){
        Sheet hojaExcel=null;
        try {
            InputStream archivoExcel= new FileInputStream(strRutaArchivo);
            Workbook libroExcel= WorkbookFactory.create(archivoExcel);
            hojaExcel=libroExcel.getSheet(strHoja);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error leyendo archivo Excel: " + e.getMessage(), e);
        }
        return hojaExcel;
    }

    public static String obtenerValorStringCeldaExcel (Row filaArchivo, Integer columnaArchivo){
        String strValorCelda="";
        try {
            strValorCelda=filaArchivo.getCell(columnaArchivo).getStringCellValue();
        } catch (Exception e) {
            strValorCelda =String.format("%.0f", new Double(filaArchivo.getCell(columnaArchivo).getNumericCellValue()));
        }
        return strValorCelda.trim();
    }
}
