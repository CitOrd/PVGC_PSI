/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import AccesoDatos.BaseDAO;
import Dominio.Orden;
import Enums.Estado;
import Frames.EliminarOrden;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.swing.JOptionPane;

/**
 *
 * @author Citlali Orduño
 */
public class OrdenDAO extends BaseDAO<Orden> {

    @Override
    public void agregar(Orden entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entidad);
        entityManager.getTransaction().commit();
    }

    @Override
    public void eliminar(Long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Orden orden = entityManager.find(Orden.class, id);
        if (orden != null) {
            entityManager.remove(orden);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public void actualizar(Orden entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Orden orden = entityManager.find(Orden.class, entidad.getId());
        if (orden != null) {
            orden.setNumOrden(entidad.getNumOrden());
            orden.setNumMesa(entidad.getNumMesa());
            orden.setEstado(entidad.getEstado());
            orden.setDetalleOrdenes(entidad.getDetalleOrdenes());

            entityManager.merge(orden);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public ArrayList<Orden> consultarTodos() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Orden.class));
        Query query = entityManager.createQuery(criteria);
        List<Orden> ordenes = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(ordenes);
        
    }
    public void actualizarEstadoOrden(){
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        
    }
       
    

    public ArrayList<Orden> consultarPorNumOrden(int numOrden) {
         EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        List<Orden> ordenes;
        if (numOrden >= 0) {
            /*Aquí está así por mera intuición, no sé como se llame la tabla ni la BD*/
            String jpql = String.format("SELECT * FROM PVGC.orden WHERE PVGC.orden.numOrden LIKE '%%"+numOrden+"%%'");
            ordenes = entityManager.createNativeQuery(jpql, Orden.class).getResultList();
        } else {
            String jpql = "SELECT * FROM PVGC.orden;";
            ordenes = entityManager.createNativeQuery(jpql, Orden.class).getResultList();
        }
        entityManager.getTransaction().commit();

        return new ArrayList<>(ordenes);
    }
    
    @Override
    public Orden buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Orden orden = entityManager.find(Orden.class, id);
        entityManager.getTransaction().commit();
        return orden;
    }
    
    public  void  modificarEstadoOrden(long numOrden) {
      
             EntityManager em = this.createEntityManager();
             Orden orden2 = em.find(Orden.class, numOrden);
        
        if (numOrden >= 0) {
            try{  
            
                em.getTransaction().begin();
                orden2.setEstado(Estado.CONCLUIDO);
                em.getTransaction().commit();
                
            }catch(Exception e){
                e.printStackTrace();
        }finally{
                em.close();
            }
            //entityManager.persist(orden2);
           // String jpql = String.format("update pvgc.orden set pvgc.orden.estado='CONCLUIDO' WHERE PVGC.orden.numOrden='"+numOrden+"'");
            
              
            //entityManager.getTransaction().commit();
            //entityManager.close();
            
        } else {
           // String jpql = "SELECT * FROM PVGC.orden;";
           // ordenes = entityManager.createNativeQuery(jpql, Orden.class).getResultList();
        }
        

        
    }
    
    
}
