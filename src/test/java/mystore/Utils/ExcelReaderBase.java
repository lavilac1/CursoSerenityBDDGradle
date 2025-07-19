package mystore.Utils;

/*Workbook, Sheet, Row, Cell: representan las partes del archivo Excel.
XSSFWorkbook: se usa para leer archivos .xlsx (Excel modernos).
FileInputStream: para leer el archivo Excel desde el sistema de archivos.
IOException: para manejar errores de lectura.
List, Map, ArrayList, HashMap: para manejar los datos leídos del Excel como listas de mapas.
 */
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelReaderBase {
    /*Recibe la ruta del archivo (filePath) y el nombre de la hoja (sheetName).

Retorna una lista de mapas, donde cada mapa representa una fila con sus valores:
Ejemplo de una fila como mapa:
{ "nombre"="Luisa", "monto"="5000000", "cedula"="123456789" } */
    public static List<Map<String, String>> getData(String filePath, String sheetName) {

        // Crea una lista vacía para guardar todos los mapas (cada fila de Excel será un mapa en esta lista).
        List<Map<String, String>> dataList = new ArrayList<>();

        /*Abre el archivo Excel con FileInputStream y lo carga en un objeto Workbook.
El try (...) se llama try-with-resources y cierra automáticamente los recursos al finalizar (buena práctica).
 */
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

                // Accede a la hoja específica por nombre.
            Sheet sheet = workbook.getSheet(sheetName);
                /*Lee la primera fila del Excel (fila 0), que normalmente contiene los nombres de las columnas (cabecera).
Esto se usará como claves en cada mapa. */
            Row headerRow = sheet.getRow(0);

                /* Comienza un ciclo que recorre desde la segunda fila (índice 1) hasta la última fila del Excel.
sheet.getLastRowNum() retorna el número de la última fila con contenido. */
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                /*Crea un nuevo mapa para cada fila y obtiene la fila actual (row). */
                Map<String, String> dataMap = new HashMap<>();
                Row row = sheet.getRow(i);

                /*Recorre todas las columnas (celdas) de la fila actual.
                headerRow.getLastCellNum() indica cuántas columnas hay. */
                for (int j = 0; j < headerRow.getLastCellNum(); j++) {

                    /*key: obtiene el nombre de la columna (desde la cabecera).
                    value: obtiene el valor de la celda de esa columna en la fila actual.
                    Guarda el par clave-valor en el dataMap. */
                    String key = headerRow.getCell(j).getStringCellValue();
                    Cell cell = row.getCell(j);
                    String value = cell != null ? cell.toString() : "";
                    dataMap.put(key, value);
                }
                // Una vez que termina de leer toda la fila, la agrega a la lista general dataList.
                dataList.add(dataMap);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //Retorna la lista de filas leídas como mapas. Cada elemento representa una fila del Excel.
        return dataList;
    }
    
}
