/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoDatos.CategoriaDAO;
import AccesoDatos.DetalleOrdenDAO;
import AccesoDatos.EmpleadoDAO;
import AccesoDatos.OrdenDAO;
import AccesoDatos.ProductoDAO;
import AccesoDatos.ReporteVentaDAO;
import AccesoDatos.VentaDAO;

import Dominio.Categoria;
import Dominio.DetalleOrden;
import Dominio.Empleado;
import Dominio.Orden;
import Dominio.Producto;
import Dominio.ReporteVenta;
import Dominio.Venta;
import java.util.ArrayList;

/**
 *
 * @author Citlali Orduño
 */
public class Control {

    CategoriaDAO categoriaDao;
    DetalleOrdenDAO detalleOrd;
    EmpleadoDAO empDao;
    OrdenDAO ordenDao;
    ProductoDAO productoDao;
    ReporteVentaDAO repVentaDao;
    VentaDAO ventaDao;

    public Control(CategoriaDAO categoriaDao, DetalleOrdenDAO detalleOrd, EmpleadoDAO empDao, OrdenDAO ordenDao, ProductoDAO productoDao, ReporteVentaDAO repVentaDao, VentaDAO ventaDao) {
        this.categoriaDao = categoriaDao;
        this.detalleOrd = detalleOrd;
        this.empDao = empDao;
        this.ordenDao = ordenDao;
        this.productoDao = productoDao;
        this.repVentaDao = repVentaDao;
        this.ventaDao = ventaDao;
    }

    public void agregar(Categoria categoria) {
        if (categoria != null) {
            this.categoriaDao.agregar(categoria);
        } else {
            System.out.println("No se pudo agregar la categoria");
        }
    }

    public void agregar(DetalleOrden detOrden) {
        if (detOrden != null) {
            this.detalleOrd.agregar(detOrden);
        } else {
            System.out.println("No se pudo agregar el detalle de la orden");
        }
    }

    public void agregar(Producto producto) {
        if (producto != null) {
            this.productoDao.agregar(producto);
        } else {
            System.out.println("No se pudo agregar el producto");
        }
    }

    public void agregar(Orden orden) {
        if (orden != null) {
            this.ordenDao.agregar(orden);
        } else {
            System.out.println("No se pudo agregar la orden");
        }
    }

    public void agregar(Empleado empleado) {
        if (empleado != null) {
            this.empDao.agregar(empleado);
        } else {
            System.out.println("No se pudo agregar al empleado");
        }
    }

    public void agregar(Venta venta) {
        if (venta != null) {
            this.ventaDao.agregar(venta);
        } else {
            System.out.println("No se pudo agregar la venta");
        }
    }

    public void agregar(ReporteVenta repVenta) {
        if (repVenta != null) {
            this.repVentaDao.agregar(repVenta);
        } else {
            System.out.println("No se pudo agregar el reporte de venta");
        }
    }

    public void eliminar(Categoria categoria) {
        if (categoria != null) {
            this.categoriaDao.eliminar(categoria.getId());
        } else {
            System.out.println("No se pudo eliminar la categoria");
        }
    }

    public void eliminar(DetalleOrden detOrden) {
        if (detOrden != null) {
            this.categoriaDao.eliminar(detOrden.getId());
        } else {
            System.out.println("No se pudo eliminar el detalle de la orden");
        }
    }

    public void eliminar(Empleado empleado) {
        if (empleado != null) {
            this.empDao.eliminar(empleado.getId());
        } else {
            System.out.println("No se pudo eliminar el empleado");
        }
    }

    public void eliminar(Orden orden) {
        if (orden != null) {
            this.ordenDao.eliminar(orden.getId());
        } else {
            System.out.println("No se pudo eliminar la orden");
        }
    }

    public void eliminar(Producto producto) {
        if (producto != null) {
            this.productoDao.eliminar(producto.getId());
        } else {
            System.out.println("No se pudo eliminar el producto");
        }
    }

    public void eliminar(ReporteVenta repVenta) {
        if (repVenta != null) {
            this.repVentaDao.eliminar(repVenta.getId());
        } else {
            System.out.println("No se pudo eliminar el reporte de venta");
        }
    }

    public void eliminar(Venta venta) {
        if (venta != null) {
            this.ventaDao.eliminar(venta.getId());
        } else {
            System.out.println("No se pudo eliminar la venta");
        }
    }

    public void actualizar(Categoria categoria) {
        if (categoria != null) {
            this.categoriaDao.actualizar(categoria);
        } else {
            System.out.println("No se pudo actualizar la categoria");
        }
    }

    public void actualizar(DetalleOrden detOrden) {
        if (detOrden != null) {
            this.detalleOrd.actualizar(detOrden);
        } else {
            System.out.println("No se pudo actualizar el detalle de la orden");
        }
    }

    public void actualizar(Empleado empleado) {
        if (empleado != null) {
            this.empDao.actualizar(empleado);
        } else {
            System.out.println("No se pudo actualizar el empleado");
        }
    }

    public void actualizar(Orden orden) {
        if (orden != null) {
            this.ordenDao.actualizar(orden);
        } else {
            System.out.println("No se pudo actualizar la orden");
        }
    }

    public void actualizar(Producto producto) {
        if (producto != null) {
            this.productoDao.actualizar(producto);
        } else {
            System.out.println("No se pudo actualizar el producto");
        }
    }

    public void actualizar(ReporteVenta repVenta) {
        if (repVenta != null) {
            this.repVentaDao.actualizar(repVenta);
        } else {
            System.out.println("No se pudo actualizar el reporte de venta");
        }
    }

    public void actualizar(Venta venta) {
        if (venta != null) {
            this.ventaDao.actualizar(venta);
        } else {
            System.out.println("No se pudo actualizar la venta");
        }
    }

    public ArrayList<Categoria> consultar(Categoria categoria) {
        if (categoria != null) {
            return this.categoriaDao.consultarTodos();
        } else {
            System.out.println("No se pudo consultar la categoria");
            return null;
        }
    }

    public ArrayList<DetalleOrden> consultar(DetalleOrden detOrden) {
        if (detOrden != null) {
            return this.detalleOrd.consultarTodos();
        } else {
            System.out.println("No se pudo consultar el detalle de la orden");
            return null;
        }
    }

    public ArrayList<Empleado> consultar(Empleado empleado) {
        if (empleado != null) {
            return this.empDao.consultarTodos();
        } else {
            System.out.println("No se pudo consultar ");
            return null;
        }
    }

    public ArrayList<Orden> consultar(Orden orden) {
        if (orden != null) {
            return this.ordenDao.consultarTodos();
        } else {
            System.out.println("No se pudo consultar ");
            return null;
        }
    }

    public ArrayList<Producto> consultar(Producto producto) {
        if (producto != null) {
            return this.productoDao.consultarTodos();
        } else {
            System.out.println("No se pudo consultar ");
            return null;
        }
    }

    public ArrayList<ReporteVenta> consultar(ReporteVenta repVenta) {
        if (repVenta != null) {
            return this.repVentaDao.consultarTodos();
        } else {
            System.out.println("No se pudo consultar ");
            return null;
        }
    }

    public ArrayList<Categoria> consultarPorNombre(String nombre) {
        if (nombre != "") {
            return this.categoriaDao.consultarPorNombre(nombre);
        } else {
            System.out.println("No se pudo consultar el nombre");
            return null;
        }
    }

    public ArrayList<Producto> consultarPorNombre(Producto producto) {
        if (producto != null) {
            return this.productoDao.consultarPorNombre(producto.getNombre());
        } else {
            System.out.println("No se pudo consultar el nombre");
            return null;
        }
    }

    public ArrayList<Empleado> consultarPorNombre(Empleado empleado) {
        if (empleado != null) {
            return this.empDao.consultarPorNombre(empleado.getNombre());
        } else {
            System.out.println("No se pudo consultar el nombre");
            return null;
        }
    }

    public Categoria buscarPorId(Long id) {
        if (id != null) {
            return this.categoriaDao.buscarPorId(id);
        } else {
            return null;
        }
    }

    public DetalleOrden buscarPorId(DetalleOrden detOrden) {
        if (detOrden != null) {
            return this.detalleOrd.buscarPorId(detOrden.getId());
        } else {
            return null;
        }
    }

    public Empleado buscarPorId(Empleado empleado) {
        if (empleado != null) {
            return this.empDao.buscarPorId(empleado.getId());
        } else {
            return null;
        }
    }

    public Orden buscarPorId(Orden orden) {
        if (orden != null) {
            return this.ordenDao.buscarPorId(orden.getId());
        } else {
            return null;
        }
    }

    public Producto buscarPorId(Producto producto) {
        if (producto != null) {
            return this.productoDao.buscarPorId(producto.getId());
        } else {
            return null;
        }
    }

    public ReporteVenta buscarPorId(ReporteVenta repVenta) {
        if (repVenta != null) {
            return this.repVentaDao.buscarPorId(repVenta.getId());
        } else {
            return null;
        }
    }

    public Venta buscarPorId(Venta venta) {
        if (venta != null) {
            return this.ventaDao.buscarPorId(venta.getId());
        } else {
            return null;
        }
    }

    public ArrayList<Orden> consultarPorNumOrden(int numOrden) {
        if (numOrden >= 0) {
            return this.ordenDao.consultarPorNumOrden(numOrden);

        } else {
            System.out.println("No se pudo consultar");
            return null;
        }
    }
}
