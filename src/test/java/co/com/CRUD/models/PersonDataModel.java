package co.com.CRUD.models;

import java.util.HashMap;
import java.util.Map;

public class PersonDataModel {
    
    public static Map<String, Object> obtenerBody (Map<String,Object> informacion){

        Map<String, Object> response= new HashMap<>();

        response.put("name", informacion.get("name"));
        response.put("username", informacion.get("username"));
        response.put("email", informacion.get("email"));
         return response;

    }
    
}
