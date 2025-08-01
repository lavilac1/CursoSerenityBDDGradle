package co.com.CRUD.tasks;

import co.com.CRUD.constants.Constantes;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsumirRecursoProtegido implements Task {

    public static ConsumirRecursoProtegido usandoToken() {
        return instrumented(ConsumirRecursoProtegido.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String token = actor.recall("ACCESS_TOKEN");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .get(Constantes.PROTECTED_URL.value())
                .then()
                .statusCode(200);
    }
}
