package mystore.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class PaginaLogin {
   public static final Target EMAIL=Target.the("campo usuario")
            .located(By.name("email"));
   public static final Target PASSWORD=Target.the("campo password")
            .located(By.name("passwd"));
   public static final Target BOTON_SIGN_IN=Target.the("Boton iniciar sesion")
            .located(By.name("SubmitLogin"));
}
