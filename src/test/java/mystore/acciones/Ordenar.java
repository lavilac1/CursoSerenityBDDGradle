package mystore.acciones;


import io.cucumber.java.nl.Stel;
import mystore.ui.PaginaCategoriaWomen;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class Ordenar implements Task {

        private String orden;

    public Ordenar(String orden) {
        this.orden=orden;
    }

    public static Performable ordenaAlfabeticamenteAsc() {
        return Instrumented.instanceOf(Ordenar.class)
                .withProperties("Product Name: A to Z");
    }

    @Override
    @Step("{0} ordena los productos en orden ascendente")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PaginaCategoriaWomen.SELECT_ORDEN),
                SelectFromOptions.byVisibleText(orden).from(PaginaCategoriaWomen.SELECT_ORDEN),
                Click.on(PaginaCategoriaWomen.SUBTITULO_CAT)
        );
    }
}
