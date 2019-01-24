package cl.accenture.proyecto.services;


import cl.accenture.proyecto.model.Proyecto;
import cl.accenture.proyecto.model.Usuario;
import cl.accenture.proyecto.repositorio.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProyectoService {

    private ProyectoRepository proyectoRepository;

    @Autowired
    public ProyectoService(ProyectoRepository proyectoRepository) {
        this.proyectoRepository = proyectoRepository;
    }


   // public Proyecto validacionProyecto(Proyecto proyecto) {
   //     Proyecto pro = new Proyecto();
   //     List<Proyecto> proyectos;
    //    proyectos = proyectoRepository.findBynombreProyecto(proyecto.getNombreProyecto());
    //    switch(proyectos.size()){
    //        case 0:
    //            pro.setMensaje("inexistente");
    //            break;
    //        case 1:
    //            if(pro.getIdProyecto().equals(proyectos.get(0).getIdProyecto())){
    //                pro.setMensaje("Correcto");
    //            }else{
    //                pro.setMensaje("contraseña");
    //            }
    //            break;
     //   }
     //   return pro;
   // }
   // public Proyecto obtenerProyecto(Integer idProyecto){
   //     return proyectoRepository.findById(idProyecto).get();
   // }
   // public Proyecto obtenerNombre(String nombre){return  proyectoRepository.findByNombre(nombre);}

  //  public List<Proyecto> obtenerEmail(String email){
  //      return proyectoRepository.findByEmail(email);
  //  }
   // public List<Proyecto> encontrarTodos(){
    //    List<Proyecto> proyectos=new ArrayList<>();
    //    proyectoRepository.findAll().forEach(Proyecto -> proyectos.add(Proyecto));
    //    return proyectos;
   // }
   // public void guardarProyecto(Proyecto proyecto){
   //     proyectoRepository.save(proyecto);
   // }



    //public void eliminarProyecto(Proyecto proyecto){proyectoRepository.delete(proyecto);}


}
