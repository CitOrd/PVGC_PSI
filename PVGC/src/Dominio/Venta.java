/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author R2
 */
@Entity
@Table(name = "Venta")
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    
    //ATRIBUTOS
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha", nullable = false, length = 50)
    @Temporal(TemporalType.DATE)
    private Calendar fecha;
    @Column(name = "total", nullable = false, length = 50)
    private float total;
    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private List<Orden> ordenes;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idReporteVenta")
    private ReporteVenta reporteV;

    //CONSTRUCTORES

    public Venta() {
        this.ordenes = new ArrayList<>();
    }

    public Venta(Calendar fecha, float total, ReporteVenta reporteV) {
        this.fecha = fecha;
        this.total = total;
        this.reporteV = reporteV;
    }
    
    public Venta(Calendar fecha, float total, List<Orden> ordenes) {
        this.fecha = fecha;
        this.total = total;
        this.ordenes = ordenes;
    }

    public Venta(Calendar fecha, float total, List<Orden> ordenes, ReporteVenta reporteV) {
        this.fecha = fecha;
        this.total = total;
        this.ordenes = ordenes;
        this.reporteV = reporteV;
    }
    
    public Venta(Long id, float total, List<Orden> ordenes, ReporteVenta reporteV) {
        this();
        this.id = id;
        this.fecha = Calendar.getInstance();
        this.total = total;
        this.ordenes = ordenes;
        this.reporteV = reporteV;
    }
    
    
    //MÉTODOS
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(List<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    public ReporteVenta getReporteV() {
        return reporteV;
    }

    public void setReporteV(ReporteVenta reporteV) {
        this.reporteV = reporteV;
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
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Venta[ id=" + id + " ]";
    }
    
}
