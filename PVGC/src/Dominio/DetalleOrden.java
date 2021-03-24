/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author R2
 */
@Entity
@Table(name = "DetalleOrden")
public class DetalleOrden implements Serializable {

    private static final long serialVersionUID = 1L;
    
    //ATRIBUTOS
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idOrden")
    private Orden orden;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idProducto")
    private Producto producto;

    //CONSTRUCTORES
    
    public DetalleOrden() {
    }

    public DetalleOrden(Long id, Orden orden, Producto producto) {
        this.id = id;
        this.orden = orden;
        this.producto = producto;
    }

    public DetalleOrden(Orden orden, Producto producto) {
        this.orden = orden;
        this.producto = producto;
    }
    
    //MÉTODOS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
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
        if (!(object instanceof DetalleOrden)) {
            return false;
        }
        DetalleOrden other = (DetalleOrden) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.DetalleOrden[ id=" + id + " ]";
    }
    
}
