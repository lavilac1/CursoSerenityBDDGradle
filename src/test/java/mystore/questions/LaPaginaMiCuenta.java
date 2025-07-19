package mystore.questions;

import mystore.userinterfaces.PaginaCategoriaWomen;
import mystore.userinterfaces.PaginaMiCuenta;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaPaginaMiCuenta {
    public static Question <String> subtitulo(){
        return actor -> Text.of(PaginaMiCuenta.SUBTITULO)
                .answeredBy(actor);
    }
    public static Question <String> primertituloproducto(){
        return actor -> Text.of(PaginaCategoriaWomen.PRODUCTO)
                .answeredBy(actor);
    }
}
