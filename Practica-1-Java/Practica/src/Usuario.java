public class Usuario {
    private String nombre;
    private int edad;
    private String correo;
    private int telefono;

    
    public Usuario() {
        
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public void actualizarPerfil(String correo) {
        this.correo = correo;
        System.out.println("Correo: " + this.correo);
    }

    public void actualizarPerfil(String correo, int telefono) {
        this.correo = correo;
        this.telefono = telefono;
        System.out.println(" Correo: " + this.correo + " | Teléfono: " + this.telefono);
    }

    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', edad=" + edad + "}";
    }
}