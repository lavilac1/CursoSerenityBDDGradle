package co.com.CRUD.tasks;

import co.com.CRUD.constants.Constantes;
import co.com.CRUD.exceptions.TokenGenerationException;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ObtenerTokenOAuth2 implements Task {

    private final Map<String, String> data;

    public ObtenerTokenOAuth2(Map<String, String> data) {
        this.data = data;
    }

    public static ObtenerTokenOAuth2 con(Map<String, String> data) {
        return instrumented(ObtenerTokenOAuth2.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Response response = SerenityRest.given()
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("grant_type", "client_credentials")
                .formParam("client_id", Constantes.CLIENT_ID.value())
                .formParam("client_secret", Constantes.CLIENT_SECRET.value())
                .formParam("scope", Constantes.SCOPE.value())
                .post(Constantes.TOKEN_URL.value());

        if (response.statusCode() != 200) {
            throw new TokenGenerationException("Fallo al obtener token: " + response.getBody().asString());
        }

        String accessToken = response.jsonPath().getString("access_token");

        actor.remember("ACCESS_TOKEN", accessToken);
    }
}
