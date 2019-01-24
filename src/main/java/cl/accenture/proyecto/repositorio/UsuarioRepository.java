package cl.accenture.proyecto.repositorio;

import cl.accenture.proyecto.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{




    Usuario findByEmailAndContrasena(String email,String contrasena);
    List<Usuario> findByEmail(String email);
    Usuario findByNombre(String nombre);
    Usuario findByIdUser(String idUser);



}
