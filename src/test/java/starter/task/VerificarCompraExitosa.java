package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;
import starter.ui.CheckoutPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class VerificarCompraExitosa implements Task {



    public static String mensajeVisible() {

        return Tasks.instrumented(VerificarCompraExitosa.class).toString();
    }


    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat("El mensaje de confirmación", Text.of(CheckoutPage.MENSAJE_CONFIRMACION),
                        Matchers.equalTo("THANK YOU FOR YOUR ORDER"))
        );
    }
}


