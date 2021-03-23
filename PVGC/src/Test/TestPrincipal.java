/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import AccesoDatos.CategoriaDAO;
import AccesoDatos.DetalleOrdenDAO;
import AccesoDatos.EmpleadoDAO;
import AccesoDatos.OrdenDAO;
import Control.ControlCategoria;
import Control.ControlDetalleOrden;
import Control.ControlEmpleado;
import Control.ControlOrden;
import Control.ControlProducto;
import Control.ControlVenta;
import Dominio.Categoria;

/**
 *
 * @author R2
 */
public class TestPrincipal {
    
    public static void main(String[] args) {
        
        ControlCategoria cc = new ControlCategoria(new CategoriaDAO());
        ControlDetalleOrden cdo = new ControlDetalleOrden(new DetalleOrdenDAO());
        ControlEmpleado ce = new ControlEmpleado(new EmpleadoDAO());
        ControlOrden co= new ControlOrden(new OrdenDAO());
        ControlProducto cp = new ControlProducto();
        ControlVenta cv = new ControlVenta();
        
        cc.agregarCategoria(new Categoria("furros", "dan asco"));
        
    }
    
}
