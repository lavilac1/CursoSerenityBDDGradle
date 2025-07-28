package co.com.CRUD.enums;

public enum EndPoint {

    USUARIOS("/users"),
    USUARIO_POR_ID("/users/{id}");

    private final String path;

    EndPoint(String path) {
        this.path = path;
    }

    public String path() {
        return path;
    }
    
}
