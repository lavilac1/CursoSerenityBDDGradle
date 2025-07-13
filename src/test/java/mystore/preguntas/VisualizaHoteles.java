package mystore.preguntas;


import mystore.ui.PaginaMiCuenta;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class VisualizaHoteles  {

   public static Question <String> subtitulo(){
        return actor -> Text.of(PaginaMiCuenta.LINK_NOMBRERESULTADO)
                .answeredBy(actor);
    }

}
