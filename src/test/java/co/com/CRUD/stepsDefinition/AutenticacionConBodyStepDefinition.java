package co.com.CRUD.stepsDefinition;


import co.com.CRUD.questions.ValidarRespuestaBodyProtegido;
import co.com.CRUD.tasks.ConsumirconBody2;
import co.com.CRUD.tasks.ConsumoirRecursoConBody;
import co.com.CRUD.tasks.ObtenerTokenOAuth2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;
import java.util.Map;
import io.restassured.response.Response;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.MatcherAssert.assertThat;  // ✅ Este es el correcto
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
//import static org.junit.Assert.assertThat;

public class AutenticacionConBodyStepDefinition {

   

   @Given("que el cliente solicita el token")
public void queElClienteSolicitaElToken() {
    theActorInTheSpotlight().attemptsTo(
        ConsumirconBody2.porDefecto()
    );
}

    @When("el cliente envia el siguiente body al servicio protegido")
public void enviaBodyConToken(DataTable dataTable) {
    Map<String, String> body = dataTable.asMap();
    theActorInTheSpotlight().attemptsTo(
        ConsumoirRecursoConBody.conBody(body)
    );
}

@Then("la respuesta debe contener")
public void validarRespuesta(DataTable expectedTable) {
   Map<String, String> expected = expectedTable.asMap();
    theActorInTheSpotlight().should(
        seeThat(ValidarRespuestaBodyProtegido.con(expected),equalTo(true))
    );
}
}
