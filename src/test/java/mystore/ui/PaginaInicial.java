package mystore.ui;

import net.serenitybdd.screenplay.targets.Target;

import net.serenitybdd.core.annotations.findby.By;

public class PaginaInicial {
    public static Target LBL_TITULO=Target.the("Titulo pantalla")
    .located(By.xpath("//h1[@xpath='1']"));

    public static Target BTN_BUSQUEDA=Target.the("Campo ciudad")
    .located(By.id(":rh:"));

    public static Target BTN_HABITACION=Target.the("Campo habitaciones")
    .located(By.xpath("//button[@data-stid='open-room-picker']"));

    public static Target BTN_BUSCAR=Target.the("Boton buscar")
    .located(By.xpath("//button[@type='submit']"));
    
   
    

    

}
