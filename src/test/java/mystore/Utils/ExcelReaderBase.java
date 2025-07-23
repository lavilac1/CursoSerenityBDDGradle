package mystore.Utils;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReaderBase {
    /*Usamos un método genérico <T>, para que T pueda ser cualquier tipo de objeto (por ejemplo: Usuario, Cliente, etc.).

        Recibimos como parámetros:
        filePath: ruta del archivo Excel.
        sheetName: nombre de la hoja.
        clazz: la clase modelo a la que queremos mapear los datos (ej. Usuario.class). */
      public static <T> List<T> readExcel(String filePath, String sheetName, Class<T> clazz) {
        
        List<T> dataList = new ArrayList<>();


        /*Abrimos el archivo Excel (.xlsx) y accedimos a la hoja por nombre.
        Leímos la primera fila, que es donde se esperan los nombres de las columnas (cabeceras). */

        try (FileInputStream fis = new FileInputStream(filePath);
        
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            Row headerRow = sheet.getRow(0);


        /*Recorremos desde la fila 1 (porque la fila 0 es la cabecera).
        Usamos clazz.getDeclaredConstructor().newInstance() para crear una nueva instancia
         del objeto T, es decir, del modelo (Usuario, Cliente, etc.). */

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                T instance = clazz.getDeclaredConstructor().newInstance();

        /*Obtenemos el nombre de la columna (clave) desde la cabecera.
        Obtenemos el valor de la celda actual (valor).
        Buscamos en la clase clazz un campo con ese nombre (getDeclaredField(key)).
        Si lo encuentra, lo hacemos accesible (setAccessible(true)) y le asignamos el valor 
        (field.set(instance, value)). */

                for (int j = 0; j < headerRow.getLastCellNum(); j++) {
                    String key = headerRow.getCell(j).getStringCellValue().trim().toLowerCase();
                    Cell cell = row.getCell(j);
                    String value = (cell != null) ? cell.toString().trim() : "";

                    try {
                        Field field = clazz.getDeclaredField(key);
                        field.setAccessible(true);
                        field.set(instance, value);
                    } catch (NoSuchFieldException e) {
                        // Si la propiedad no existe, solo ignórala
                        System.out.println("Campo ignorado: " + key);
                    }
                }
                //Una vez que llenamos un objeto con los datos de una fila, lo agregamos a la lista.
                dataList.add(instance);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        //Retornamos la lista de objetos (Usuario, Cliente, etc.) con todos los datos del Excel.
        return dataList;
    }
}
