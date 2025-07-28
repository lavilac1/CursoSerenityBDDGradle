package co.com.CRUD.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElCuerpoDeLaRespuesta implements Question <String> {

     @Override
    public String answeredBy(Actor actor) {
        String response = SerenityRest.lastResponse().asPrettyString();
        System.out.println("📥 Respuesta del servicio:\n" + response);
        return response;
    }

    public static ElCuerpoDeLaRespuesta es() {
        return new ElCuerpoDeLaRespuesta();
    }
    
}
