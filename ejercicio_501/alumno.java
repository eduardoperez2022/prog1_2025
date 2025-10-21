package ejercicio_501;

// DTO  o POJO
public class alumno {
    // Puesto,Nombre/s,Apellido/s,DNI,Puntaje
    
    private String puesto;
    private String nombre;
    private String apellido;
    private String dni;
    private String puntaje;

    public alumno(String puesto, String nombre, String apellido, String dni, String puntaje) {
        this.puesto = puesto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.puntaje = puntaje;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "alumno{" + "puesto=" + puesto + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", puntaje=" + puntaje + '}';
    }
    
}
