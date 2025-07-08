package mystore.acciones;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class Navegar implements Interaction {
    /*Se ejecuta cuando el actor realiza esta interacción.
Usa Open.url(...) para abrir la URL en el navegador.
La anotación @Step mejora los reportes de Serenity.*/
    @Override
    @Step("{0} navega hacia una pagina")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(opcionDeURL));
    }

    /* Permite usar Navegar.hacia("url") en lenguaje fluido.
Usa Instrumented para que Serenity pueda registrar esta acción correctamente en los reportes.*/
    public static Performable hacia(String opcionURL) {
        return Instrumented.instanceOf(Navegar.class).withProperties(opcionURL);
    }

    //constructor Guarda la URL que se recibirá cuando se cree la interacción.
    private final String opcionDeURL;

    public Navegar(String opcionDeURL) {
        this.opcionDeURL = opcionDeURL;
    }

}
