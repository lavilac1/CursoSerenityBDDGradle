package co.com.CRUD.questions;

import java.util.HashMap;
import java.util.Map;

import co.com.CRUD.enums.Mensajes;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarmensajeQuestion implements Question<Boolean> {

    private Map<String, String> informacion = new HashMap<>();

    public ValidarmensajeQuestion(DataTable informacion){
        this.informacion= informacion.asMap();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        /* Para comparar con el contenido de la respuesta 
        String bodyRespuesta= SerenityRest.lastResponse().getBody().asString();
        return(bodyRespuesta.contains(Mensajes.obtenerPorClave(informacion.get("Respuesta"))) || bodyRespuesta.contains("Time out"));*/
       
        int statusCode = SerenityRest.lastResponse().statusCode();
        
        // Ej: "201 Created" → 201
        String codigoEsperadoString = Mensajes.obtenerPorClave(informacion.get("Respuesta")).split(" ")[0];
        int codigoEsperado = Integer.parseInt(codigoEsperadoString);
        return statusCode == codigoEsperado;
    }

    public static ValidarmensajeQuestion deRespuesta(DataTable informacion){
        return new ValidarmensajeQuestion(informacion);
    }
    
    
}
