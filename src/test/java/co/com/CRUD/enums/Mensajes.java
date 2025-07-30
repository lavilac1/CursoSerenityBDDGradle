package co.com.CRUD.enums;

public enum Mensajes {
    CREACION_EXITOSA("201 Created");

    String msj;

    Mensajes(String msj)
    {
        this.msj=msj;
    }

    public String getMsj(){
        return msj;
    }

    public static String obtenerPorClave(String clave){
        for (Mensajes item : Mensajes.values()){
                if (item.name().equalsIgnoreCase(clave))
                    return item.getMsj();
        }

        throw new IllegalArgumentException("Mensaje no encontrado");


    }

    
}
