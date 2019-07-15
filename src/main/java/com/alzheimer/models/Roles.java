package com.alzheimer.models;
// Generated 29-jun-2019 21:11:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Roles generated by hbm2java
 */
@Entity
@Table(name="roles"
    ,catalog="alzheimerdb"
)
public class Roles extends Modelo<Roles> implements java.io.Serializable {
    
     private Integer id;
     private String nombre;
     private String descripcion;
     private Set usuarioses = new HashSet(0);

    public Roles() {
        super();
    }

	
    public Roles(String nombre, String descripcion) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    /*public Roles(String nombre, String descripcion, Set usuarioses) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.usuarioses = usuarioses;
    }*/
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
    }

    
    @Column(name="nombre", nullable=false, length=50)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
    }

    
    @Column(name="descripcion", nullable=false)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
    }

/*@OneToMany(fetch=FetchType.LAZY, mappedBy="roles")
    public Set getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set usuarioses) {
        this.usuarioses = usuarioses;
    }
*/

    @Override
    public String toString() {
        return id + " - " + nombre;
    }
    
    
}


