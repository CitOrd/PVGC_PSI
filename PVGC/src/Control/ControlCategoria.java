/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import AccesoDatos.CategoriaDAO;
import Dominio.Categoria;
import Dominio.Empleado;
import java.util.ArrayList;
/**
 *
 * @author Citlali Orduño
 */
public class ControlCategoria {
    CategoriaDAO categoriaDao;

    public ControlCategoria() {
        this.categoriaDao = new CategoriaDAO();
    }
    
    public void agregarCategoria(Categoria categoria){
         if(categoria != null){
            this.categoriaDao.agregar(categoria);
        }else{
            System.out.println("No se pudo agregar la categoria");
        }
    }
    
    public void eliminarCategoria(Categoria categoria){
        if(categoria != null){
            this.categoriaDao.eliminar(categoria.getId());
        }else{
            System.out.println("No se pudo eliminar la categoria");
        }
    }
    
    public void actualizarCategoria(Categoria categoria){
        if(categoria != null){
            this.categoriaDao.actualizar(categoria);
        }else{
            System.out.println("No se pudo actualizar la categoria");
        }
    }
    
    public ArrayList<Categoria> consultarCategorias(){
            return this.categoriaDao.consultarTodos();
   } 
    
    public ArrayList<Categoria> consultarCategoriaPorNombre(String nombre){
          if(nombre != ""){
            return this.categoriaDao.consultarPorNombre(nombre);
        }else{
            System.out.println("No se pudo consultar el nombre de la categoria");
            return null;
        }
     } 
    
  public Categoria buscarPorId(Long id){
      if(id != null){
          return this.categoriaDao.buscarPorId(id);
      }else{
          return null;
      }
  }
  
}
