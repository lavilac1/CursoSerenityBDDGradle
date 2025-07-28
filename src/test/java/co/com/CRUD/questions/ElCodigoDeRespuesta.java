package co.com.CRUD.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Question;

public class ElCodigoDeRespuesta  {
    public static Question<Integer> fue() {
        return actor -> {
            int statusCode = SerenityRest.lastResponse().statusCode();
            System.out.println("📡 Código de respuesta: " + statusCode);
            return statusCode;
        };
    }
}
