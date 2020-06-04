package co.com.sa.entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "notas")
public class Nota implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nota")
    private Integer idNota;
    
    private String nombre;
    private String apellido;
    private String telefono;
    
    public Nota(){
    }
    
    public Nota(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Integer getIdNota() {
        return idNota;
    }

    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
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
    
    
}
