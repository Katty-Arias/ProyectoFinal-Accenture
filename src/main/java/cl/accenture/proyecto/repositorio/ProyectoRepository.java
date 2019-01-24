package cl.accenture.proyecto.repositorio;

import cl.accenture.proyecto.model.Proyecto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProyectoRepository extends CrudRepository<Proyecto, String> {

    @Override
    long count();

   // List<Proyecto> findBynombreProyecto(String nombre);
    //Proyecto findByStatus(boolean status);
   // Optional<Proyecto> findById(Integer idProyecto);
   // List<Proyecto> findByStatus(boolean status);
   // Proyecto findByNombre(String nombre);
   // List<Proyecto> findByEmail(String email);





}
