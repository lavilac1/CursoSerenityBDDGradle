package mystore.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaMiCuenta {
//PONERLO PUBLIC STATIC FINAL paa usar la variable en otra case sin tener que instanciar
    public static Target LINK_NOMBRERESULTADO=Target.the("Resultado busqueda")
    .located(By.xpath( "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h3[1]/a[1]/div[1]"));


}
