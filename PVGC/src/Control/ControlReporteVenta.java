/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoDatos.ReporteVentaDAO;
import Dominio.ReporteVenta;
import java.util.ArrayList;

/**
 *
 * @author R2
 */
public class ControlReporteVenta {

    ReporteVentaDAO reporteVenta;

    public ControlReporteVenta() {
        this.reporteVenta = new ReporteVentaDAO();
    }

    public void agregarReporteVenta(ReporteVenta reporte) {
        if (reporte != null) {
            this.reporteVenta.agregar(reporte);
        } else {
            System.out.println("No se pudo agregar la categoria");
        }
    }

    public void eliminarReporteVenta(ReporteVenta reporte) {
        if (reporte != null) {
            this.reporteVenta.eliminar(reporte.getId());
        } else {
            System.out.println("No se pudo eliminar la categoria");
        }
    }

    public void actualizarReporteVenta(ReporteVenta reporte) {
        if (reporte != null) {
            this.reporteVenta.actualizar(reporte);
        } else {
            System.out.println("No se pudo actualizar la categoria");
        }
    }

    public ArrayList<ReporteVenta> consultarReportesVenta(ReporteVenta reporte) {
        if (reporte != null) {
            return this.reporteVenta.consultarTodos();
        } else {
            System.out.println("No se pudo consultar la categoria");
            return null;
        }
    }

    public ReporteVenta buscarPorId(Long id) {
        if (id != null) {
            return this.reporteVenta.buscarPorId(id);
        } else {
            return null;
        }
    }
}
