package mystore.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaMiCuenta {
//PONERLO PUBLIC STATIC FINAL paa usar la variable en otra case sin tener que instanciar
    public static final   Target SUBTITULO= Target.the("Subtitulo del login")
            .located(By.xpath("//p[@class=\'info-account\']"));

    public static final   Target WOMEN= Target.the("Menu Women")
            .located(By.xpath("//a[@class='sf-with-ul'][normalize-space()='Women']"));



}
