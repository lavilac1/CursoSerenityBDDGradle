package mystore.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;



public class Eltitulo  implements Question<String>{

    private final Target titulo;

    public Eltitulo(Target titulo) {
        this.titulo = titulo;
    }


    public static Eltitulo deLaPagina(Target titulo) {
        return new Eltitulo(titulo);
    }

    @Override
    public String answeredBy(Actor actor) {
        return titulo.resolveFor(actor).getText();
    }
}
