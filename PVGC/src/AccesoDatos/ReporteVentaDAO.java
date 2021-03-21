/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Dominio.ReporteVenta;
import Dominio.Venta;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author R2
 */
public class ReporteVentaDAO extends BaseDAO<ReporteVenta>{

    @Override
    public void agregar(ReporteVenta entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entidad);
        entityManager.getTransaction().commit();
    }

    @Override
    public void eliminar(Long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        ReporteVenta ReporteVenta = entityManager.find(ReporteVenta.class, id);
        if (ReporteVenta != null) {
            entityManager.remove(ReporteVenta);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public void actualizar(ReporteVenta entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        ReporteVenta reporte = entityManager.find(ReporteVenta.class, entidad.getId());
        if (reporte != null) {
            reporte.setPeriodo(entidad.getPeriodo());
            reporte.setVentas(entidad.getVentas());
            reporte.setEmpleado(entidad.getEmpleado());
           
            
            entityManager.merge(reporte);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public ArrayList<ReporteVenta> consultarTodos() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(ReporteVenta.class));
        Query query = entityManager.createQuery(criteria);
        List<ReporteVenta> reporte = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(reporte);
    }

    @Override
    public ReporteVenta buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        ReporteVenta reporte = entityManager.find(ReporteVenta.class, id);
        entityManager.getTransaction().commit();
        return reporte;
    }
    
}
