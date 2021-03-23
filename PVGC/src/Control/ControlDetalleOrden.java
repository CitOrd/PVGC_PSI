/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import AccesoDatos.DetalleOrdenDAO;
import Dominio.DetalleOrden;
import java.util.ArrayList;
/**
 *
 * @author Citlali Orduño
 */
public class ControlDetalleOrden {
    
    DetalleOrdenDAO detalleOrd;

    public ControlDetalleOrden(DetalleOrdenDAO detalleOrd) {
        this.detalleOrd = detalleOrd;
    }
    
    public void agregarDetalleOrden(DetalleOrden detOrden){
         if(detOrden != null){
            this.detalleOrd.agregar(detOrden);
        }else{
            System.out.println("No se pudo agregar el detalle");
        }
    }
    
    public void eliminarDetalleOrden(DetalleOrden detOrden){
         if(detOrden != null){
            this.detalleOrd.eliminar(detOrden.getId());
        }else{
            System.out.println("No se pudo eliminar el detalle");
        }
    }
    
    public void actualizarDetalleOrden(DetalleOrden detOrden){
         if(detOrden != null){
            this.detalleOrd.actualizar(detOrden);
        }else{
            System.out.println("No se pudo actualizar el detalle");
        }
    }
    
     public ArrayList<DetalleOrden> consultarOrdenes(DetalleOrden detOrden){
        if(detOrden != null){
            return this.detalleOrd.consultarTodos();
        }else{
            System.out.println("No se pudo consultar el detalle de la orden");
            return null;
        }
   } 
     
  public DetalleOrden buscarPorId(Long id){
      if(id != null){
          return this.detalleOrd.buscarPorId(id);
      }else{
          return null;
      }
  }
}
