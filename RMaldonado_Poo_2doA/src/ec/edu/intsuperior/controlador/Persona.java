
package ec.edu.intsuperior.controlador;

public class Persona {
public Persona(String ci, String nombre, String apellido, String direccion, Tipogenero genero) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.genero = genero;
    }  

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGenero(Tipogenero genero) {
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCi() {
        return ci;
    }

    public String getDireccion() {
        return direccion;
    }

    public Tipogenero getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;

    }

    @Override
    public String toString() {
        return "Los datos de la persona solicitada es:\n"
                + "Cedula:" + getCi() + "\n"
                + "nombre:" + getNombre() + "\n" + "apellido" + getApellido() + "\n" + "Genero:" + getGenero();
    }