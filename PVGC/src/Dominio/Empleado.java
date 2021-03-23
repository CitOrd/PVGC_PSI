/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author R2
 */
@Entity
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    
    //ATRIBUTOS
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "puesto", nullable = false, length = 50)
    private String puesto;
     @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    
    @Column(name = "correoE", nullable = false, length = 50)
    private String correoE;
    @Column(name = "RFC", nullable = false, length = 50)
    private String RFC;
    @Column(name = "telefono", nullable = false, length = 50)
    private String telefono;
    @Column(name = "direccion", nullable = false, length = 50)
    private String direccion;
    
    
    //CONSTRUCTORES

    public Empleado(Long id, String puesto,String nombre, String correoE, String RFC, String telefono, String direccion) {
        this.id = id;
        this.puesto = puesto;
        this.nombre= nombre;
        this.correoE = correoE;
        this.RFC = RFC;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Empleado() {}
    
    //MÉTODOS
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //OVERRIDE MÉTODOS

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Empleado[ id=" + id + " ]";
    }
    
}
