package teroria;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;

    public Persona(String nombre, String apellidos, int edad, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //método que nos dice si la persona es mayor de edad o no
    public boolean esMayorDeEdad() {

        return edad >= 18;
    }
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d", dni, apellidos, nombre, edad);
    }
}
