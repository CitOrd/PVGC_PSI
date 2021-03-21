/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Enums.Periodo;
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
@Table(name = "ReporteVenta")
public class ReporteVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    
    //ATRIBUTOS
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "periodo", nullable = false, length = 50)
    private Periodo periodo;
    @OneToMany(mappedBy = "reporteV", cascade = CascadeType.ALL)
    private List<Venta> ventas;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idEmpleado")
    private Empleado empleado;

    //CONSTRUCTORES

    public ReporteVenta() {
        this.ventas = new ArrayList<>();
    }

    public ReporteVenta(Long id, Periodo periodo, Empleado empleado) {
        this.id = id;
        this.periodo = periodo;
        this.empleado = empleado;
    }
    
    
    //MÉTODOS
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
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
        if (!(object instanceof ReporteVenta)) {
            return false;
        }
        ReporteVenta other = (ReporteVenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.ReporteVenta[ id=" + id + " ]";
    }
    
}
