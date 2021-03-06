package com.alzheimer.models;
// Generated 29-jun-2019 21:11:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Parentescos generated by hbm2java
 */
@Entity
@Table(name="parentescos"
    ,catalog="alzheimerdb"
)
public class Parentescos extends Modelo<Parentescos>  implements java.io.Serializable {


     private Integer id;
     private String descripcion;
     private Set imageneses = new HashSet(0);

    public Parentescos() {
    }

	
    public Parentescos(String descripcion) {
        this.descripcion = descripcion;
    }
    /*public Parentescos(String descripcion, Set imageneses) {
       this.descripcion = descripcion;
       this.imageneses = imageneses;
    }*/
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="descripcion", nullable=false, length=50)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

/*@OneToMany(fetch=FetchType.LAZY, mappedBy="parentescos")
    public Set getImageneses() {
        return this.imageneses;
    }
    
    public void setImageneses(Set imageneses) {
        this.imageneses = imageneses;
    }
*/



}


