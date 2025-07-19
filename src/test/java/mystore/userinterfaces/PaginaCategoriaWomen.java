package mystore.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaCategoriaWomen  {

    public static Target PRODUCTO= Target.the("Titulo del primer producto")
            .located(org.openqa.selenium.By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]"));

    public static final Target SELECT_ORDEN =
            Target.the("Selector de ordenamiento")
                    .located(org.openqa.selenium.By.id("selectProductSort"));
    public static final Target SUBTITULO_CAT =
            Target.the("Selector de ordenamiento")
                    .located(org.openqa.selenium.By.xpath("//span[@class='cat-name']"));

}
