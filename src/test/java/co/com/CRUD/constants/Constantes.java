package co.com.CRUD.constants;

public enum Constantes
{
    CLIENT_ID("m2m"),
    CLIENT_SECRET("secret"),
    SCOPE("api"),
    TOKEN_URL("http://localhost:3000/oauth/token"),
    PROTECTED_URL("http://localhost:3000/api/protected/info"),
    PROTECTED_URL_BODY("http://localhost:3000/api/protected");

    private final String value;

    Constantes(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }



}
