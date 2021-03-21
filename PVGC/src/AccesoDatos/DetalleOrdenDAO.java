/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import AccesoDatos.BaseDAO;
import Dominio.DetalleOrden;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Citlali Orduño
 */
public class DetalleOrdenDAO extends BaseDAO<DetalleOrden> {

    @Override
    public void agregar(DetalleOrden entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entidad);
        entityManager.getTransaction().commit();
    }

    @Override
    public void eliminar(Long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        DetalleOrden detalleOrden = entityManager.find(DetalleOrden.class, id);
        if (detalleOrden != null) {
            entityManager.remove(detalleOrden);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public void actualizar(DetalleOrden entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        DetalleOrden detalleOrd = entityManager.find(DetalleOrden.class, entidad.getId());
        if (detalleOrd != null) {
            detalleOrd.setOrden(entidad.getOrden());
            detalleOrd.setProducto(entidad.getProducto());

            entityManager.merge(detalleOrd);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public ArrayList<DetalleOrden> consultarTodos() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(DetalleOrden.class));
        Query query = entityManager.createQuery(criteria);
        List<DetalleOrden> detalleOrds = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(detalleOrds);
    }

    @Override
    public DetalleOrden buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        DetalleOrden detalleOrd = entityManager.find(DetalleOrden.class, id);
        entityManager.getTransaction().commit();
        return detalleOrd;
    }
    
}
