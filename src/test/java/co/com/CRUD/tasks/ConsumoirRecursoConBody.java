package co.com.CRUD.tasks;

import java.util.Map;

import org.apache.poi.ss.formula.functions.T;

import co.com.CRUD.constants.Constantes;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import io.restassured.http.ContentType;

public class ConsumoirRecursoConBody implements Task {
    private final Map<String, String> body;

    public ConsumoirRecursoConBody(Map<String, String> body) {
        this.body = body;
    }

    public static ConsumoirRecursoConBody conBody(Map<String, String> body) {
        return instrumented(ConsumoirRecursoConBody.class, body);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String token = actor.recall("ACCESS_TOKEN");

        SerenityRest.given()
            .header("Authorization", "Bearer " + token)
            .contentType(ContentType.JSON)
            .body(body)
            .post(Constantes.PROTECTED_URL_BODY.value())
            .then().log().all();
    }


    
}
