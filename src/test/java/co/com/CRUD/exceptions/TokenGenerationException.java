package co.com.CRUD.exceptions;

public class TokenGenerationException extends RuntimeException {
     public TokenGenerationException(String mensaje) {
        super(mensaje);
    }
}
