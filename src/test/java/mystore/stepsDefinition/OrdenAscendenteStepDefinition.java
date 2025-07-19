package mystore.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mystore.questions.LaPaginaMiCuenta;
import mystore.tasks.Darclick;
import mystore.tasks.Ordenar;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class OrdenAscendenteStepDefinition   {

       @And("dza click a la categoria Women")
    public void daClickALaCategoria() {
           theActorInTheSpotlight().attemptsTo(Darclick.enMenu());
    }

    @And("zordena de A a la Z")
    public void ordenaDeAALaZ() {
        theActorInTheSpotlight()
                .attemptsTo(Ordenar.ordenaAlfabeticamenteAsc());
    }

    @Then("z")
    public void deberiaVerComoPrimerResultado(String nombreProducto) {
        theActorInTheSpotlight().should(
                seeThat("El titulo del primer producto es Blouse",
                        LaPaginaMiCuenta.primertituloproducto(),
                        equalTo(nombreProducto))
        );
    }
}
