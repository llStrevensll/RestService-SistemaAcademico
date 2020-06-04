package co.com.sa.service;

import co.com.sa.dao.IAlumnoDao;
import co.com.sa.entidades.Alumno;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Stateless
@Path("/alumnos")
public class AlumnoServiceRs {
    
    @Inject
    private IAlumnoDao IAlumnoDao;
    
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Alumno> listarAlumnos(){
        
        List<Alumno> alumnos = IAlumnoDao.encontrarTodosAlumnos();
        
        System.out.println("Alumnos encontrados: " + alumnos);
        return alumnos;
    }
    
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}") //path: /alumnos/(id)
    public Alumno encontrarAlumno(@PathParam("id") int id){
        
        Alumno alumno = IAlumnoDao.encontrarAlumno(new Alumno(id));
        
        System.out.println("Alumno Encontrado:");
        return alumno;
    }
    
    @POST
    @Consumes(value = MediaType.APPLICATION_JSON) 
    @Produces(value = MediaType.APPLICATION_JSON)
    public Alumno insertarAlumno(Alumno alumno){
        IAlumnoDao.insertarAlumno(alumno);
        
        System.out.println("Alumno Insertado: " + alumno);
        return alumno;
    }
    
    @PUT
    @Consumes(value = MediaType.APPLICATION_JSON) 
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response modificarAlumno(@PathParam("id") int id, Alumno alumnoModificado){
        
        
        //Obtener id
        Alumno alumno = IAlumnoDao.encontrarAlumno(new Alumno(id));
        
        if(alumno != null){ // Si alumno existe en la BD
            
            //Actualizar
            alumnoModificado.setIdAlumno(id);
            IAlumnoDao.actualizarAlumno(alumnoModificado);
            
            System.out.println("Alumno Modificado");
            return Response.ok().entity(alumnoModificado).build(); //responde con el alumno modificado
        }else {
            return Response.status(Status.NOT_FOUND).build();
        }
    }
    
    @DELETE
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response eliminarAlumno(@PathParam("id") int id){
        System.out.println("Entre eliminar alumno: " + id);
        try{
            IAlumnoDao.eliminarAlumno(new Alumno(id));

            System.out.println("Alumno Eliminado con el id:" + id);
            return Response.ok().build();
        }catch(Exception e){
            e.printStackTrace(System.out);
            return Response.status(404).build();
        }
    }
}
