/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoDatos.EmpleadoDAO;
import Dominio.Empleado;
import java.util.ArrayList;

/**
 *
 * @author Citlali Orduño
 */
public class ControlEmpleado {

    EmpleadoDAO empDao;

    public ControlEmpleado(EmpleadoDAO empDao) {
        this.empDao = empDao;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (empleado != null) {
            this.empDao.agregar(empleado);
        } else {
            System.out.println("No se pudo agregar al empleado");
        }
    }

    public void eliminarEmpleado(Empleado empleado) {
        if (empleado != null) {
            this.empDao.eliminar(empleado.getId());
        } else {
            System.out.println("No se pudo eliminar el empleado");
        }
    }

    public void actualizarEmpleado(Empleado empleado) {
        if (empleado != null) {
            this.empDao.actualizar(empleado);
        } else {
            System.out.println("No se pudo actualizar el empleado");
        
        }
        
    }

     public ArrayList<Empleado> consultarEmpleados(Empleado empleado){
          if(empleado != null){
            return this.empDao.consultarTodos();
        }else{
            System.out.println("No se pudo consultar los empleados");
            return null;
        }
     }  
     
     public ArrayList<Empleado> consultarEmpleadoPorNombre(String nombre){
          if(nombre != ""){
            return this.empDao.consultarPorNombre(nombre);
        }else{
            System.out.println("No se pudo consultar los empleados");
            return null;
        }
     } 
     
      public Empleado buscarPorId(Long id){
      if(id != null){
          return this.empDao.buscarPorId(id);
      }else{
          return null;
      }
  }
        
    }
