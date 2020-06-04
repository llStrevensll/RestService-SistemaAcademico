package co.com.sa.entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQueries({
    @NamedQuery(name = "Alumno.encontrarTodosAlumnos", query = "SELECT a FROM Alumno a ORDER BY a.idAlumno ")
})
@Table(name = "alumnos")
public class Alumno implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private Integer idAlumno;
    
    private String nombre;
    private String apellido;
    private String telefono;
    
    public Alumno(){
    }

    public Alumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }
    
    public Alumno(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + '}';
    }
    
    
    
    
}
