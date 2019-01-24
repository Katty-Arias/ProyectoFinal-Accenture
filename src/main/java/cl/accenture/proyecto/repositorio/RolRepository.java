package cl.accenture.proyecto.repositorio;

import cl.accenture.proyecto.model.Rol;
import org.springframework.data.repository.CrudRepository;

public interface RolRepository extends CrudRepository<Rol, String> {


    Rol findBynombre(String Nombre);
    Rol findBydescripcion(String descripcion);
    Rol findByIdRol(String id);

}
