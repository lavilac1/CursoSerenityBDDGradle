package mystore.Utils;

import static org.mockito.Mockito.never;
import mystore.models.Data;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import net.bytebuddy.asm.Advice.This;

public class AlimentarData {

    HaspDatosExcel datosExcel= new HaspDatosExcel();

    public void extraerDatos(String strRutaArchivo,String strHoja){
        Data data;
        Sheet datosHojaExcel=ExcelReader.ObtenerDatosHojaExcel(strRutaArchivo, strHoja);
        Row filaDatosHojaExcel=null;

        for (int i=1; i<= datosHojaExcel.getLastRowNum(); i++){
            filaDatosHojaExcel= datosHojaExcel.getRow(i);
            data = new Data(
                ExcelReader.obtenerValorStringCeldaExcel(filaDatosHojaExcel, 0),
                ExcelReader.obtenerValorStringCeldaExcel(filaDatosHojaExcel, 1),
                ExcelReader.obtenerValorStringCeldaExcel(filaDatosHojaExcel, 2),
                ExcelReader.obtenerValorStringCeldaExcel(filaDatosHojaExcel, 3),
                ExcelReader.obtenerValorStringCeldaExcel(filaDatosHojaExcel, 4));

        this.llenarMap(ExcelReader.obtenerValorStringCeldaExcel(filaDatosHojaExcel, 0),data);
        }

    }
     private void llenarMap(String llave, Data data){
            datosExcel.getHashDatosExcel().put(llave, data);
        }

        public HaspDatosExcel getDatosExcel() {
        return datosExcel;
    }
    
}
