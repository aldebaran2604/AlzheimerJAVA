package com.alzheimer.models;
// Generated 29-jun-2019 21:11:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Usuarios generated by hbm2java
 */
@Entity
@Table(name="usuarios"
    ,catalog="alzheimerdb"
)
public class Usuarios  implements java.io.Serializable {


     private Integer id;
     private Roles roles;
     private String nombres;
     private String apellidoPaterno;
     private String apellidoMaterno;
     private Date fechaNacimiento;
     private short sexo;
     private Set consultases = new HashSet(0);

    public Usuarios() {
    }

	
    public Usuarios(Roles roles, String nombres, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento, short sexo) {
        this.roles = roles;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }
    /*public Usuarios(Roles roles, String nombres, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento, short sexo, Set consultases) {
       this.roles = roles;
       this.nombres = nombres;
       this.apellidoPaterno = apellidoPaterno;
       this.apellidoMaterno = apellidoMaterno;
       this.fechaNacimiento = fechaNacimiento;
       this.sexo = sexo;
       this.consultases = consultases;
    }*/
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="rol_id", nullable=false)
    public Roles getRoles() {
        return this.roles;
    }
    
    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    
    @Column(name="nombres", nullable=false, length=50)
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    
    @Column(name="apellido_paterno", nullable=false, length=50)
    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }
    
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    
    @Column(name="apellido_materno", nullable=false, length=50)
    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }
    
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha_nacimiento", nullable=false, length=10)
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    @Column(name="sexo", nullable=false)
    public short getSexo() {
        return this.sexo;
    }
    
    public void setSexo(short sexo) {
        this.sexo = sexo;
    }

/*@OneToMany(fetch=FetchType.LAZY, mappedBy="usuarios")
    public Set getConsultases() {
        return this.consultases;
    }
    
    public void setConsultases(Set consultases) {
        this.consultases = consultases;
    }


*/

    @Override
    public String toString() {
        return "Usuarios{" + "id=" + id + ", roles=" + roles + ", nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + '}';
    }

}


