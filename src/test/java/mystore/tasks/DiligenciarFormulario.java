package mystore.tasks;

import mystore.models.Data;
import mystore.userinterfaces.FormularioUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.actions.Click;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class DiligenciarFormulario implements Task {

private Data datos;

    public DiligenciarFormulario(Data datos) {
        this.datos = datos;
    }

     public static DiligenciarFormulario conLosDatos(Data datos) {
        return Tasks.instrumented(DiligenciarFormulario.class, datos);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Scroll.to(FormularioUsuario.INPUT_NOMBRE),
            WaitUntil.the(FormularioUsuario.INPUT_NOMBRE, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(FormularioUsuario.INPUT_NOMBRE),
            Enter.theValue(datos.getNombre()).into(FormularioUsuario.INPUT_NOMBRE),
            Enter.theValue(datos.getApellido()).into(FormularioUsuario.INPUT_APELLIDO),
            Scroll.to(FormularioUsuario.INPUT_EMAIL),
            Enter.theValue(datos.getEmail()).into(FormularioUsuario.INPUT_EMAIL),
            Click.on(FormularioUsuario.genero(datos.getGenero())),
            Enter.theValue(datos.getTelefono()).into(FormularioUsuario.INPUT_TELEFONO),
            Scroll.to(FormularioUsuario.BTN_SUBMIT),
            Click.on(FormularioUsuario.BTN_SUBMIT)
               );
        
    }

    
}
