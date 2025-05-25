package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;
import starter.ui.CheckoutPage;
import starter.ui.ProductosPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class VerificarBotonAdd implements Task {

    public static VerificarBotonAdd BagregarCarrito() {
        return Tasks.instrumented(VerificarBotonAdd.class);
    }


    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat("El mensaje del boton", Text.of(ProductosPage.BTN_BACKPACK),
                        Matchers.equalTo("ADD TO CART"))
        );
    }
}
