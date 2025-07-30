package co.com.CRUD.enums;

public enum Ambiente {
    COLLECTION("https://jsonplaceholder.typicode.com");

    String valor;

    Ambiente(String ambiente){
        this.valor=ambiente;
    }

    public String obtenerUrl(){
        return valor;
    }
}
