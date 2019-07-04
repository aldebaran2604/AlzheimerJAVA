package com.alzheimer.models;
// Generated 29-jun-2019 21:11:18 by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Imagenes generated by hbm2java
 */
@Entity
@Table(name="imagenes"
    ,catalog="alzheimerdb"
)
public class Imagenes  implements java.io.Serializable {


     private ImagenesId id;
     private Pacientes pacientes;
     private Parentescos parentescos;
     private String directorio;
     private String descripcion;

    public Imagenes() {
    }

    public Imagenes(ImagenesId id, Pacientes pacientes, Parentescos parentescos, String directorio, String descripcion) {
       this.id = id;
       this.pacientes = pacientes;
       this.parentescos = parentescos;
       this.directorio = directorio;
       this.descripcion = descripcion;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="parentescoId", column=@Column(name="parentesco_id", nullable=false) ), 
        @AttributeOverride(name="pacienteId", column=@Column(name="paciente_id", nullable=false) ) } )
    public ImagenesId getId() {
        return this.id;
    }
    
    public void setId(ImagenesId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="paciente_id", nullable=false, insertable=false, updatable=false)
    public Pacientes getPacientes() {
        return this.pacientes;
    }
    
    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="parentesco_id", nullable=false, insertable=false, updatable=false)
    public Parentescos getParentescos() {
        return this.parentescos;
    }
    
    public void setParentescos(Parentescos parentescos) {
        this.parentescos = parentescos;
    }

    
    @Column(name="directorio", nullable=false)
    public String getDirectorio() {
        return this.directorio;
    }
    
    public void setDirectorio(String directorio) {
        this.directorio = directorio;
    }

    
    @Column(name="descripcion", nullable=false)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


