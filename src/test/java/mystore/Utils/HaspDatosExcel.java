package mystore.Utils;

import java.util.LinkedHashMap;
import java.util.Map;

import mystore.models.Data;



public class HaspDatosExcel {

    private static Map<String, Data> HaspDatosExcel= new LinkedHashMap<>();
    public Map<String, Data> getHashDatosExcel(){
        return  HaspDatosExcel;
    }    

    public void setHasDatosExcel(Map<String,Data>hashDatosExcel){
        HaspDatosExcel=hashDatosExcel;
    }
}
