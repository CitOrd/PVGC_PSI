/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import AccesoDatos.OrdenDAO;
import Dominio.Orden;
import java.util.ArrayList;
/**
 *
 * @author Citlali Orduño
 */
public class ControlOrden {
    public OrdenDAO ordenDao;

    public ControlOrden() {
        this.ordenDao = new OrdenDAO();
    }
    
    public void agregarOrden(Orden orden){
         if(orden != null){
            this.ordenDao.agregar(orden);
        }else{
            System.out.println("No se pudo agregar la orden");
        }
    }
    
   /*  public void eliminarOrden(Orden orden){
         if(orden != null){
            this.ordenDao.eliminar(orden.getId());
        }else{
            System.out.println("No se pudo eliminar la orden");
        }
    }*/
    
    
    public void eliminarOrden(Long numOrden){
         if(numOrden != 0){
            this.ordenDao.eliminar(numOrden);
        }else{
            System.out.println("No se pudo eliminar la orden");
        }
    }
    
     public void actualizarOrden(Orden orden){
         if(orden != null){
            this.ordenDao.actualizar(orden);
        }else{
            System.out.println("No se pudo actualizar la orden");
        }
    } 
     
    public ArrayList<Orden> consultarOrdenPorNumOrden(int numOrden){
        if(numOrden >= 0){
           return this.ordenDao.consultarPorNumOrden(numOrden);
            
        }else{
            System.out.println("No se pudo consultar el producto");
        return null;
        }
    }
    
   public ArrayList<Orden> consultarOrdenes(){
        
            return this.ordenDao.consultarTodos();
        
   } 
   
   
   public Orden buscarPorId(Long id){
      if(id != null){
          return this.ordenDao.buscarPorId(id);
      }else{
          return null;
      }
  }
}
