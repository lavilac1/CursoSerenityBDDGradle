package co.com.CRUD.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Question;

public class ElCodigoDeRespuesta implements Question<Integer> {
    public static ElCodigoDeRespuesta fue() {
        return new ElCodigoDeRespuesta();
    }

    @Override
    public Integer answeredBy(net.serenitybdd.screenplay.Actor actor) {
        return SerenityRest.lastResponse().statusCode();
    }
    
}
