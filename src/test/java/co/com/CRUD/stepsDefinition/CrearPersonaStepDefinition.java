package co.com.CRUD.stepsDefinition;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import co.com.CRUD.enums.Ambiente;
import co.com.CRUD.questions.ValidarmensajeQuestion;
import co.com.CRUD.tasks.CrearPersonaTask;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import static org.hamcrest.Matchers.equalTo;


public class CrearPersonaStepDefinition  {

    @Dado("necesita agregar un cliente")
    public void necesitaagregaruncliente(){
        theActorInTheSpotlight().whoCan(CallAnApi.at(Ambiente.COLLECTION.obtenerUrl()));
    }
    
    @Cuando("realiza creacion cliente")
    public void realizacreacioncliente(DataTable dataTable){
        theActorInTheSpotlight().attemptsTo(
            CrearPersonaTask.conBody(dataTable));
    }

     @Entonces("valida respuesta")
    public void validrespuesta(DataTable table){
        theActorInTheSpotlight().should(
            seeThat(ValidarmensajeQuestion.deRespuesta(table), equalTo(true))
        );
    }
    
}
