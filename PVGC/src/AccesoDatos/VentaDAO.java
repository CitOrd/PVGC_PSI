/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import AccesoDatos.BaseDAO;
import Dominio.Venta;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Citlali Orduño
 */
public class VentaDAO extends BaseDAO<Venta> {

    @Override
    public void agregar(Venta entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entidad);
        entityManager.getTransaction().commit();
    }

    @Override
    public void eliminar(Long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Venta venta = entityManager.find(Venta.class, id);
        if (venta != null) {
            entityManager.remove(venta);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public void actualizar(Venta entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Venta venta = entityManager.find(Venta.class, entidad.getId());
        if (venta != null) {
            venta.setFecha(entidad.getFecha());
            venta.setOrdenes(entidad.getOrdenes());
           
            
            entityManager.merge(venta);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public ArrayList<Venta> consultarTodos() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Venta.class));
        Query query = entityManager.createQuery(criteria);
        List<Venta> ventas = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(ventas);
    }

    @Override
    public Venta buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Venta venta = entityManager.find(Venta.class, id);
        entityManager.getTransaction().commit();
        return venta;
    }
    
}
