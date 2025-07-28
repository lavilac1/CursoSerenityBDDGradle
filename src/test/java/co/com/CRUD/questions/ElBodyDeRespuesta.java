package co.com.CRUD.questions;

import net.serenitybdd.rest.SerenityRest;

public class ElBodyDeRespuesta {
     public static String comoTexto() {
        return SerenityRest.lastResponse().getBody().asPrettyString();
    }
}
