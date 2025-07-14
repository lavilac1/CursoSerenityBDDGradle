package mystore.acciones;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
import org.openqa.selenium.Keys;

import mystore.ui.PaginaInicial;
import mystore.ui.PaginaMiCuenta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;



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
            WaitUntil.the(PaginaInicial.BTN_LISTO, isVisible()).forNoMoreThan(15).seconds(),
            Click.on(PaginaInicial.BTN_LISTO),
            WaitUntil.the(PaginaInicial.BTN_BUSQUEDA, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(PaginaInicial.BTN_BUSQUEDA),
            WaitUntil.the(PaginaInicial.BTN_BUSQUEDA, isVisible()).forNoMoreThan(10).seconds(),
            Enter.theValue(ciudad).into(PaginaInicial.TXT_BUSQUEDA).thenHit(Keys.ENTER),
            WaitUntil.the(PaginaInicial.BTN_BUSCAR, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(PaginaInicial.BTN_BUSCAR));
            //WaitUntil.the(PaginaInicial.BTN_HABITACION, isVisible()).forNoMoreThan(10).seconds(),
            //Click.on(PaginaInicial.BTN_HABITACION),
             //WaitUntil.the(PaginaInicial.BTN_AGREGAR, isVisible()).forNoMoreThan(10).seconds(),
            //Click.on(PaginaInicial.BTN_AGREGAR),
             
       
    }



}
