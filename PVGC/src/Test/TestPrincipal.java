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
import Dominio.DetalleOrden;
import Dominio.Orden;
import Dominio.Producto;
import Dominio.Venta;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

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
        
        
        //Creación de categorias
        Categoria cat1= new Categoria("Comidas", "Categoria para comidas fuertes");
        Categoria cat2= new Categoria("Bebidas frías", "Categoria para las bebidas preparadas heladas");
        Categoria cat3= new Categoria("Postres", "Categoría para guardar pasteles o algún chuchuluco dulce");
        
        cc.agregarCategoria(cat1);
        cc.agregarCategoria(cat2);
        cc.agregarCategoria(cat3);
        
        
        //Creacion de Productos
        Producto prod1= new Producto("Panini de pollo", 30f, true, cat1);
        Producto prod2= new Producto("Frape oreo", 30f, true, cat2);
        Producto prod3= new Producto("Pastel de Zanahoria rebanada", 20f, true, cat3);
        
        cp.agregarProducto(prod1);
        cp.agregarProducto(prod2);
        cp.agregarProducto(prod3);
        
        
       //Creación de orden 
        Orden orden1 = new Orden();
        orden1.setNumOrden(1);
        orden1.setNumMesa(5);
        
        Orden orden2 = new Orden();
        orden2.setNumOrden(2);
        orden2.setNumMesa(3);
        
        Orden orden3 = new Orden();
        orden3.setNumOrden(3);
        orden3.setNumMesa(2);
       
        
        //Creación de detalles de orden
        DetalleOrden detOrd1 = new DetalleOrden();
        DetalleOrden detOrd2 = new DetalleOrden();
        DetalleOrden detOrd3 = new DetalleOrden();
        
        detOrd1.setOrden(orden1);
        detOrd1.setProducto(prod1);
        
        detOrd2.setOrden(orden2);
        detOrd2.setProducto(prod2);
        
        detOrd3.setOrden(orden3);
        detOrd3.setProducto(prod3);
        
        //Creación de lista de detalles de orden para guardar en la orden 1
        List<DetalleOrden> detOrdenes1 = new ArrayList<DetalleOrden>();
        detOrdenes1.add(detOrd1);
        detOrdenes1.add(detOrd2);
        detOrdenes1.add(detOrd3);
        
        //Detalle de orden para la orden 2
        List<DetalleOrden> detOrdenes2 = new ArrayList<DetalleOrden>();
        detOrdenes2.add(detOrd2);
        detOrdenes2.add(detOrd1);
        detOrdenes2.add(detOrd3);
        
        List<DetalleOrden> detOrdenes3 = new ArrayList<DetalleOrden>();
        detOrdenes3.add(detOrd3);
        detOrdenes3.add(detOrd1);
        detOrdenes3.add(detOrd2);
        
        //Seteo de los detalle de orden
        orden1.setDetalleOrdenes(detOrdenes1);
        orden2.setDetalleOrdenes(detOrdenes2);
        orden3.setDetalleOrdenes(detOrdenes3);
        
        
        //registro de ordenes
       co.agregarOrden(orden1);
       cdo.agregarDetalleOrden(detOrd1);
        
        
        //Creación de venta
        Calendar fecha = new GregorianCalendar();
        
        List<Orden> ordenes1 = new ArrayList<Orden>();
        ordenes1.add(orden1);
        ordenes1.add(orden2);
        ordenes1.add(orden3);
       
        Venta venta1= new Venta(fecha, 324f, ordenes1);
        Venta venta2= new Venta(fecha, 200f, ordenes1);
        
        //Registro de venta
        cv.agregarVenta(venta1);
        cv.agregarVenta(venta2);
     
    }
    
}
