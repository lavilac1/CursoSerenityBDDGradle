package mystore.stepsDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import mystore.Utils.AlimentarData;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import mystore.models.Data;
import mystore.questions.Eltitulo;
import mystore.tasks.DiligenciarFormulario;
import mystore.userinterfaces.FormularioUsuario;
import static org.hamcrest.Matchers.equalTo;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;



public class Diligenciar_formularioStep {
     private AlimentarData alimentarData;

    @Before
    public void configurarActor() {
        OnStage.setTheStage(new OnlineCast());
         alimentarData = new AlimentarData();
        alimentarData.extraerDatos("src/test/resources/datos/Data.xlsx", "Hoja1");
    }

    @Dado("que el usuario abre el formulario de registro")
    public void queElUsuarioAbreElFormularioDeRegistro() {
        theActorCalled("Luisa").wasAbleTo(
            Open.url("https://demoqa.com/automation-practice-form")
        );
    }

    @Step("actor diligencia los datos" )
    @Cuando("diligencia los datos del Excel {string}")
    public void diligenciaLosDatosDelExcel(String llave) {

       Data usuario = alimentarData.getDatosExcel().getHashDatosExcel().get(llave);        

    theActorCalled("Luisa").attemptsTo(
        DiligenciarFormulario.conLosDatos(usuario)
    );
    
    }

    @Entonces("deberia ver el mensaje de confirmacion del registro {string}")
    public void deberiaVerMensajeDeConfirmacion(String tituloEsperado) {
        theActorInTheSpotlight()
        .should(
            seeThat(Eltitulo.deLaPagina(FormularioUsuario.LBL_EXITOSO), equalTo(tituloEsperado))
        );
    }
    
}
