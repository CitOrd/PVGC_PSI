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
    @JoinColumn(name = "notas")
    private String notas;
    @JoinColumn(name = "cantidad")
    private int cantidad;
    @JoinColumn(name = "total")
    private double total;
    
    
    //notas, 

    //CONSTRUCTORES
    
    public DetalleOrden() {
    }

    public DetalleOrden(Long id, Orden orden, Producto producto, String notas, int cantidad, double total) {
        this.id = id;
        this.orden = orden;
        this.producto = producto;
        this.notas = notas;
        this.cantidad = cantidad;
        this.total = total;
    }

    public DetalleOrden(Orden orden, Producto producto, String notas, int cantidad, double total) {
        this.orden = orden;
        this.producto = producto;
        this.notas = notas;
        this.cantidad = cantidad;
        this.total = total;
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

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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
