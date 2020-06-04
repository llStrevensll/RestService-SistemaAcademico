package co.com.sa.dao;

import co.com.sa.entidades.Alumno;
import java.util.List;
import javax.persistence.*;

public class AlumnoDaoImpl implements IAlumnoDao{
    
    //Habiliar JPA
    @PersistenceContext( unitName = "SistemaAcademicoPU")
    EntityManager entityManager;
    
    @Override
    public List<Alumno> encontrarTodosAlumnos() {
        //Query especificado en la entidad
        return entityManager.createNamedQuery("Alumno.encontrarTodosAlumnos").getResultList();
    }

    @Override
    public Alumno encontrarAlumno(Alumno alumno) {
        // Buscar la persona por su ID
        return entityManager.find(Alumno.class, alumno.getIdAlumno());
    }

    @Override
    public void insertarAlumno(Alumno alumno) {
        entityManager.persist(alumno);
        //recuperar llave primaria para enviar a front - usar flush
        entityManager.flush();
    }

    @Override
    public void actualizarAlumno(Alumno alumno) {
        //alumno.setIdAlumno(id);
        System.out.println("Alumno" + alumno.toString());
        entityManager.merge(alumno);
    }

    @Override
    public void eliminarAlumno(Alumno alumno) {
        Alumno alumnoEliminar = entityManager.find(Alumno.class, alumno.getIdAlumno());
        System.out.println("LLEGUE FINAL ELIMINAR");
        System.out.println("alumno:" + alumnoEliminar.toString());
        entityManager.remove(entityManager.merge(alumnoEliminar));
    }
    
}
