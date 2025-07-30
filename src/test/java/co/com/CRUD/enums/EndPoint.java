package co.com.CRUD.enums;

public enum EndPoint {

    CREAR_USUARIO("/users");

    private final String path;


    EndPoint(String path ) {
        this.path = path;
        
    }

    public String path() {
        return path;
    }

   

    
}
