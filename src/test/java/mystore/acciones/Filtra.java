package mystore.acciones;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import mystore.ui.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;



public class Filtra implements Task {

    private final String ciudad;

    public Filtra(String ciudad){
        this.ciudad=ciudad;
    }

    public static Performable por(String ciudad) {
         return instrumented(Filtra.class,ciudad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( 
            Enter.theValue(ciudad).into(PaginaInicial.BTN_BUSQUEDA).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER));
       
    }



}
