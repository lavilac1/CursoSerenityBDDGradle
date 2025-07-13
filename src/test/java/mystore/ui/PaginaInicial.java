package mystore.ui;

import net.serenitybdd.screenplay.targets.Target;

import net.serenitybdd.core.annotations.findby.By;

public class PaginaInicial {
    public static Target BTN_CONTINUAR_TITULO=Target.the("CONTINUAR ")
    .located(By.xpath("//button[@id='continue']"));

    public static Target BTN_BUSQUEDA=Target.the("Campo ciudad")
    .located(By.xpath("//input[@id=':rh:']"));

    public static Target BTN_HABITACION=Target.the("Campo habitaciones")
    .located(By.xpath("//span[@data-testid='searchbox-form-button-icon']"));

     public static Target  BTN_AGREGAR=Target.the("Agregar habitaciones")
    .located(By.xpath(""));

    public static Target BTN_BUSCAR=Target.the("Boton buscar")
    .located(By.xpath("//button[@type='submit']"));

   
    
   
    

    

}
