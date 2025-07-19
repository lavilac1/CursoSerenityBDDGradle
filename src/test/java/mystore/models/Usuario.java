package mystore.models;

public class Usuario {
//Mapeo los campos que estan en el excel

   private String nombre;
    private String apellido;
    private String email;
    private String genero;
    private String telefono;

    // Constructor
    public Usuario(String nombre, String apellido, String email, String genero, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

 
   

    // Getters y Setters
    /*Los métodos get permiten obtener el valor de un atributo privado de una clase.

    Los métodos set permiten modificar (establecer) el valor de un atributo privado.

    Esto forma parte del principio de encapsulamiento, que es una buena práctica de 
    programación orientada a objetos. Consiste en proteger los datos internos de una clase para que no se modifiquen directamente desde fuera. */
    


}
