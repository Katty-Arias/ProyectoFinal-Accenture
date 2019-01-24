package cl.accenture.proyecto.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "proyectos")
public class Proyecto {


    @Id
    @Column(name = "idProyecto")
    private String idProyecto;

    @Column
    private String nombreProyecto;
    @Column
    private Date fechaInicio;
    @Column
    private Date fechaTermino;
  //  @Column
  //  private boolean Status;
    @ManyToOne
    @JoinColumn(name = "idEmpresa")
    private Empresa empresa;


    private String mensaje;

    public Proyecto(){
    }
    public Proyecto(String idProyecto, String nombreProyecto,Date fechaInicio,Date fechaTermino, boolean Status, String mensaje, Empresa empresa){

        this.idProyecto = idProyecto;
        this.nombreProyecto=nombreProyecto;
        this.fechaInicio=fechaInicio;
        this.fechaTermino=fechaTermino;
     //   this.Status=Status;
        this.mensaje=mensaje;
        this.empresa=empresa;
    }

    //public boolean isStatus() {
    //    return Status;
   // }

   // public void setStatus(boolean status) {
   //     Status = status;
   // }

    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(java.sql.Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(java.sql.Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "idProyecto=" + idProyecto +
                ", nombreProyecto='" + nombreProyecto + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaTermino=" + fechaTermino +
             //   ", Status=" + Status +
                ", empresa=" + empresa +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }
}
