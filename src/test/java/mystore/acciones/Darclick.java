package mystore.acciones;

import mystore.constantes.Constantes;
import mystore.ui.PaginaLogin;
import mystore.ui.PaginaMiCuenta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Darclick implements Task {
    public Darclick() {
    }

    public static Performable enMenu() {
        return instrumented(Darclick.class);
    }
    @Override
    @Step ("{0} se dirige a la categoria Women")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PaginaMiCuenta.WOMEN, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PaginaMiCuenta.WOMEN));
    }


}
