package co.com.sa.dao;

import co.com.sa.entidades.Alumno;
import java.util.List;

public interface IAlumnoDao {
    
    //Metodos
    
    //Lista de todos los alumnos
    public List<Alumno> encontrarTodosAlumnos();
    
    //Encontrar Alumno
    public Alumno encontrarAlumno(Alumno alumno);
    
    //Insertar Alumno
    public void insertarAlumno(Alumno alumno);
    
    //Actualizar Alumno
    public void actualizarAlumno(Alumno alumno);
    
    //Eliminar Alumno
    public void eliminarAlumno(Alumno alumno);
}
