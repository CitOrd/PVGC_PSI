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
import Control.ControlReporteVenta;
import Control.ControlVenta;
import Dominio.Categoria;
import Dominio.DetalleOrden;
import static Dominio.DetalleOrden_.notas;
import Dominio.Empleado;
import Dominio.Orden;
import Dominio.Producto;
import Dominio.ReporteVenta;
import Dominio.Venta;
import Enums.Estado;
import Enums.Periodo;
import Frames.EliminarOrden;
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
        
        ControlCategoria cc = new ControlCategoria();
        ControlDetalleOrden cdo = new ControlDetalleOrden();
        ControlEmpleado ce = new ControlEmpleado();
        ControlOrden co= new ControlOrden();
        ControlProducto cp = new ControlProducto();
        ControlVenta cv = new ControlVenta();
        ControlReporteVenta crv = new ControlReporteVenta();
        
        
        //Creación de categorias
        Categoria cat1= new Categoria("Comidas", "Categoria para comidas fuertes");
        Categoria cat2= new Categoria("Bebidas frías", "Categoria para las bebidas preparadas heladas");
        Categoria cat3= new Categoria("Postres", "Categoría para guardar pasteles o algún chuchuluco dulce");
        Categoria cat4 = new Categoria("Bebidas calientes", "Categoría para las bebidas preparadas calientes");
        Categoria cat5 = new Categoria("Desayunos", "Categoría para los platillos para iniciar bien el día");
        
        
        cc.agregarCategoria(cat1);
        cc.agregarCategoria(cat2);
        cc.agregarCategoria(cat3);
        cc.agregarCategoria(cat5);
        cc.agregarCategoria(cat4);
        
      
       
        
//        
//         
//        //Crear empleados
//        
        Empleado empleado1= new Empleado("Cajero", "Juan Jimenez Mercado", "juanJM_25@gmail.com", "a2asd123dasdasd", "6441923234", "de las mancha #456 entre blvd torre de la viena");
        Empleado empleado2= new Empleado("Gerente", "Pedro Montes Jimenez", "PedroMJ_12@gmail.com", "gsgkfks244aksdk", "6442924235", "Fierro viejo #45 entre casa blanca y las fuentes");
        
//        //Registrarlos en BD
        ce.agregarEmpleado(empleado1);
        ce.agregarEmpleado(empleado2);
//        
//
//        // Crear reporte de venta
//        
        ReporteVenta rv1 = new ReporteVenta(Periodo.VESPERTINO, empleado1);
        ReporteVenta rv2 = new ReporteVenta(Periodo.MATUTINO, empleado2);
//        
//        //registrar en BD reporte de venta de empleados
       crv.agregarReporteVenta(rv1);
       crv.agregarReporteVenta(rv2);
//        
//        //Creación de venta
        Calendar fecha = new GregorianCalendar();
//       
        Venta venta1= new Venta(fecha, 324f, rv1);
        Venta venta2= new Venta(fecha, 200f, rv2);
       
//        
//        //Registro de venta
        cv.agregarVenta(venta1);
        cv.agregarVenta(venta2);
//        
//        
//        EliminarOrden eliminarorden = new EliminarOrden();
//        
//       //Creación de orden 
       Orden orden1 = new Orden(5, Estado.CONCLUIDO, venta1);
//        
        Orden orden2 = new Orden(5,Estado.CONCLUIDO, venta1);
//        
        Orden orden3 = new Orden(2, Estado.PROCESANDO, venta2);
//       
//        //registro de ordenes
       co.agregarOrden(orden1);
       co.agregarOrden(orden2);
       co.agregarOrden(orden3);
//        
//       List<String> notas = new ArrayList<String>();
//       String nota1= "Con mucha carne, queso y tocino";
//       String nota2= "Sin queso";
//       
//       notas.add(nota1);
//       notas.add(nota2);
        //Creación de detalles de orden
//       DetalleOrden detOrd1 = new DetalleOrden(orden1, prod1, notas, 2, 80f);
     //  DetalleOrden detOrd2 = new DetalleOrden(orden2, prod2,notas, 1, 35f );
//        DetalleOrden detOrd3 = new DetalleOrden(orden3, prod3,notas, 3, 120f);
//        
//        
//           List<DetalleOrden> detOrds= cdo.consultarOrdenes(detOrd3);
//           for (DetalleOrden detOrd : detOrds) {
//            System.out.println(detOrd);
//        }
        
//        //Creación de lista de detalles de orden para guardar en la orden 1
//        List<DetalleOrden> detOrdenes1 = new ArrayList<DetalleOrden>();
//        detOrdenes1.add(detOrd1);
//        detOrdenes1.add(detOrd2);
//        detOrdenes1.add(detOrd3);
////        
////        //Detalle de orden para la orden 2
//        List<DetalleOrden> detOrdenes2 = new ArrayList<DetalleOrden>();
//        detOrdenes2.add(detOrd2);
//        detOrdenes2.add(detOrd1);
//        detOrdenes2.add(detOrd3);
////        
//        List<DetalleOrden> detOrdenes3 = new ArrayList<DetalleOrden>();
//        detOrdenes3.add(detOrd3);
//        detOrdenes3.add(detOrd1);
//        detOrdenes3.add(detOrd2);
//        
//        cdo.agregarDetalleOrden(detOrd1);
//        cdo.agregarDetalleOrden(detOrd2);
//        cdo.agregarDetalleOrden(detOrd3);
////        
////        //Seteo de los detalle de orden
//        orden1.setDetalleOrdenes(detOrdenes1);
//        orden2.setDetalleOrdenes(detOrdenes2);
//        orden3.setDetalleOrdenes(detOrdenes3);
        
////        
//        cdo.agregarDetalleOrden(detOrd1);
//        cdo.agregarDetalleOrden(detOrd2);
//        cdo.agregarDetalleOrden(detOrd3);
//        
//        //lista ordenes para venta
        List<Orden> ordenes1 = new ArrayList<Orden>();
       ordenes1.add(orden1);
        ordenes1.add(orden2);
        ordenes1.add(orden3);
//        
//        //Actualizar las ventas con sus ordenes
//        venta1.setOrdenes(ordenes1);
//        cv.actualizarVenta(venta1);
    }
    
}
