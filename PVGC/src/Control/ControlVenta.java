/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import AccesoDatos.VentaDAO;
import Dominio.Venta;
import java.util.ArrayList;

/**
 *
 * @author Citlali Orduño
 */
public class ControlVenta {

    public VentaDAO ventaDao;

    public ControlVenta() {
        this.ventaDao= ventaDao;
    }
    
    
   public void agregarVenta(Venta venta){
       if(venta != null){
            this.ventaDao.agregar(venta);
        }else{
            System.out.println("No se pudo agregar la venta");
        }
   }
   
   public void eliminarVenta(Venta venta){
       if(venta != null){
            this.ventaDao.eliminar(venta.getId());
        }else{
            System.out.println("No se pudo eliminar la venta");
        }
   }
   
   public void actualizarVenta(Venta venta){
       if(venta != null){
            this.ventaDao.actualizar(venta);
        }else{
            System.out.println("No se pudo actualizar la venta");
        }
   }
   
   public ArrayList<Venta> consultarVenta(Venta venta){
        if(venta != null){
           return this.ventaDao.consultarTodos();
            
        }else{
            System.out.println("No se pudo consultar el producto");
        return null;
        }
    }
   
   public Venta buscarPorId(Long id){
      if(id != null){
          return this.ventaDao.buscarPorId(id);
      }else{
          return null;
      }
  }
   
}
