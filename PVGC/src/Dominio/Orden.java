/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Enums.Estado;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author R2
 */
@Entity
@Table(name = "Orden")
public class Orden implements Serializable {

    
    
    //ATRIBUTOS
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numMesa", nullable = false)
    private int numMesa;
    @Column(name = "numOrden", nullable = false)
    private int numOrden;
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private Estado estado;
    
    @OneToMany(mappedBy = "orden", cascade = CascadeType.ALL)
    private List<DetalleOrden> detalleOrdenes;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idVenta")
    private Venta venta;

    //CONSTRUCTORES
    
    public Orden() {
        detalleOrdenes = new ArrayList<>();
    }

    public Orden(int numMesa, int numOrden, Estado estado, Venta venta) {
        this.numMesa = numMesa;
        this.numOrden = numOrden;
        this.estado = estado;
        this.venta = venta;
    }
    
    public Orden(int numMesa, int numOrden, Estado estado, List<DetalleOrden> detalleOrdenes, Venta venta) {
        this.numMesa = numMesa;
        this.numOrden = numOrden;
        this.estado = estado;
        this.detalleOrdenes = detalleOrdenes;
        this.venta = venta;
    }

    public Orden(int numMesa, int numOrden, List<DetalleOrden> detalleOrdenes) {
        this.numMesa = numMesa;
        this.numOrden = numOrden;
        this.detalleOrdenes = detalleOrdenes;
    }

    
    public Orden(Long id, int numMesa, int numOrden, Estado estado, Venta venta) {
        this();
        this.id = id;
        this.numMesa = numMesa;
        this.numOrden = numOrden;
        this.estado = estado;
        this.venta = venta;
    }
    
    //MÉTODOS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<DetalleOrden> getDetalleOrdenes() {
        return detalleOrdenes;
    }

    public void setDetalleOrdenes(List<DetalleOrden> detalleOrdenes) {
        this.detalleOrdenes = detalleOrdenes;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    
    
    
    //OVERRIDE MÉTODOS

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    
    @Override
    public String toString(){
        return id + "(" + id + ")";
    }    
    
   
    
     public Object [] toArray(){
        return new Object[]{
            this.getNumOrden(),
            this.getEstado(),
            this.getNumMesa(),

           
        };
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orden)) {
            return false;
        }
        Orden other = (Orden) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /*@Override
    public String toString() {
        return "Dominio.Orden[ id=" + id + " ]";
    }
*/
    
}
