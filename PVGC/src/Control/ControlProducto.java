/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import AccesoDatos.ProductoDAO;
import Dominio.Producto;
import java.util.ArrayList;
/**
 *
 * @author Citlali Orduño
 */
public class ControlProducto {
    
    ProductoDAO productoDao;

    public ControlProducto() {
        this.productoDao= productoDao;
    }
    
    public void agregarProducto(Producto producto){
        
        if(producto != null){
            this.productoDao.agregar(producto);
        }else{
            System.out.println("No se pudo agregar el producto");
        }
    }
    
    public void eliminarProducto(Producto producto){
       
        if(producto != null){
             this.productoDao.eliminar(producto.getId());
        }else{
            System.out.println("No se pudo eliminar el producto");
        }
    }
    
    
    public void actualizarProducto(Producto producto){
        if(producto != null){
            this.productoDao.actualizar(producto);
        } else{
            System.out.println("No se pudo eliminar el producto");
        }
    }
    
    public ArrayList<Producto> consultarProducto(Producto producto){
        if(producto != null){
           return this.productoDao.consultarTodos();
            
        }else{
            System.out.println("No se pudo consultar el producto");
        return null;
        }
    }
    
    public ArrayList<Producto> consultarProductoPorNombre(String nombre){
          if(nombre != ""){
            return this.productoDao.consultarPorNombre(nombre);
        }else{
            System.out.println("No se pudo consultar el nombre del producto");
            return null;
        }
     } 
    public Producto buscarPorId(Long id){
      if(id != null){
          return this.productoDao.buscarPorId(id);
      }else{
          return null;
      }
  }
    
}
