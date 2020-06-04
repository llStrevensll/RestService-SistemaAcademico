package co.com.sa.entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "profe_mate")
public class ProfesorMateria implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profe_mate")
    private Integer idProfeMate;
    
    @Column(name = "id_profesor")
    private Integer idProfesor;
    
    @Column(name = "id_materia")
    private Integer idMateria;
    
    private String estado;
    
    public ProfesorMateria(){
    }

    public ProfesorMateria(Integer idProfeMate, Integer idProfesor, Integer idMateria, String estado) {
        this.idProfeMate = idProfeMate;
        this.idProfesor = idProfesor;
        this.idMateria = idMateria;
        this.estado = estado;
    }
    
    public Integer getIdProfeMate() {
        return idProfeMate;
    }

    public void setIdProfeMate(Integer idProfeMate) {
        this.idProfeMate = idProfeMate;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
