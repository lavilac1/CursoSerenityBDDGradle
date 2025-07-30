package co.com.CRUD.exceptions;

public class ServicioFallidoExcepcion extends AssertionError {

        public ServicioFallidoExcepcion (String mensaje, Throwable causa){
            super(mensaje, causa);
        }
    
}
