package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.CheckoutPage;


public class IngresarDatosCheckout   implements Task {
    private final String nombre;
    private final String apellido;
    private final String postal;

    public IngresarDatosCheckout(String nombre, String apellido, String postal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.postal = postal;
    }

    public static Performable conDatos(String nombre, String apellido, String postal) {
        return Tasks.instrumented(IngresarDatosCheckout.class, nombre, apellido, postal);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(CheckoutPage.INPUT_NOMBRE),
                Enter.theValue(apellido).into(CheckoutPage.INPUT_APELLIDO),
                Enter.theValue(postal).into(CheckoutPage.INPUT_POSTAL),
                net.serenitybdd.screenplay.actions.Click.on(CheckoutPage.BTN_CONTINUAR)
        );
    }
}
