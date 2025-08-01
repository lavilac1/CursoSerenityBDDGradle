package co.com.CRUD.questions;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidarRespuestaBodyProtegido implements Question<Boolean>{
   private final Map<String, String> expected;

    public ValidarRespuestaBodyProtegido(Map<String, String> expected) {
        this.expected = expected;
    }

    public static ValidarRespuestaBodyProtegido con(Map<String, String> expected) {
        return new ValidarRespuestaBodyProtegido(expected);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Response response = SerenityRest.lastResponse();

        for (Map.Entry<String, String> entry : expected.entrySet()) {
            String actual = response.jsonPath().getString(
                entry.getKey().equals("mensaje") ? "mensaje" : "datos." + entry.getKey()
            );
            System.out.println(SerenityRest.lastResponse().getBody().asPrettyString());
            assertThat("Validando campo: " + entry.getKey(), actual, is(entry.getValue()));
        }

        return true;
    }
}
