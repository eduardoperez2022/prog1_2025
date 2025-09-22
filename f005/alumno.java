package f005;

// POJO
public class alumno {
    
    private Integer edad;
    private String nombre;

    public alumno(String nombre, Integer edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "alumno{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }
    
    
}
