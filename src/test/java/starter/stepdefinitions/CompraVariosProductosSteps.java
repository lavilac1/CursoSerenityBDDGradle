package starter.stepdefinitions;

import io.cucumber.java.en.When;
import starter.task.AgregarVariosProducto;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraVariosProductosSteps {

    @When("agrego los primeros  articulos al carrito")
    public void agregoLosPrimerosArticulosAlCarrito() {
        theActorInTheSpotlight().attemptsTo(AgregarVariosProducto.Carrito());
    }
}
