package cl.accenture.proyecto.controller;

import cl.accenture.proyecto.model.*;
import cl.accenture.proyecto.services.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@RequestMapping("/proyectos")
public class ProyectoController {

    private ProyectoService proyectoService;

    @Autowired
    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }


  //  @PutMapping("/agregarProyecto")//funciona
  //  protected String agregarProyecto(@RequestParam("idProyecto") Integer idProyecto, @RequestParam("nombre") String nombreProyecto, ModelMap map, @RequestParam ("status")boolean status, @RequestParam Date fechaInicio, @RequestParam Date fechaTermino, @RequestParam ("idEmpresa")Empresa empresa ) {
  //      String destino = "";
   //     Proyecto proyecto = new Proyecto();
     //   proyecto.setIdProyecto(idProyecto);
    //    proyecto.setNombreProyecto(nombreProyecto);
    //    proyecto = proyectoService.validacionProyecto(proyecto);
    //    if (true) {
    //        switch (proyecto.getMensaje()) {
    //            case "Correcto":
    //                map.addAttribute("idProyecto", idProyecto);
    //                destino = "El proyecto, y la contraseña ya se encuentran registrados en la base de datos.";
    //                break;
    //            case "inexistente":
    //                map.addAttribute( "El proyectoo no existe.");
    //                destino = "Proyecto creado";
  //Proyecto pro = new Proyecto();
  //                  pro.setIdProyecto(idProyecto);
  //                  pro.setNombreProyecto(nombreProyecto);
  //                  pro.setFechaInicio(fechaInicio);
  //                  pro.setFechaTermino(fechaTermino);
  //                  pro.setStatus(status);
  //                  pro.setEmpresa(empresa);
  //                  proyectoService.guardarProyecto(pro);
  //                  break;
  //          }
  //          return destino;
  //      }else{
  //          return "Problema con algun dato.";
   //     }
   // }

 //   @PutMapping("/editarProyecto")//funcionaaaaaaaaaaaaaaaaaaaaaaaa
 //   public String editPro(@RequestParam("idProyecto") Integer idProyecto, @RequestParam("nombre") String nombreProyecto, ModelMap map, @RequestParam ("status")boolean status, @RequestParam Date fechaInicio, @RequestParam Date fechaTermino, @RequestParam ("idEmpresa")Empresa empresa) {
 //       Proyecto proyecto = proyectoService.obtenerProyecto(idProyecto);
 //       Assert.notNull(proyecto, "Proyecto not found");
 //       proyecto.setIdProyecto(idProyecto);
 //       proyecto.setNombreProyecto(nombreProyecto);
 //     //  proyecto.setStatus(status);
 //       proyecto.setFechaInicio(fechaInicio);
 //       proyecto.setFechaTermino(fechaTermino);
 //       proyectoService.guardarProyecto(proyecto);
 //       return "que se guarde ";
 //   }

   // @DeleteMapping("/eliminarProyecto") //funciona
   // public boolean deleteProyecto(@RequestParam Integer idProyecto) {
   //     Proyecto proyecto = proyectoService.obtenerProyecto(idProyecto);
   //     System.out.println("Usuario DELETE" + proyecto);
   //     proyectoService.eliminarProyecto(proyecto);
   //     return true;
   // }
}
