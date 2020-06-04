package co.com.sa.entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "materias")
public class Materia implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia")
    private Integer idMateria;
    
    private String nombre;
    
    public Materia(){
    }
    
    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
