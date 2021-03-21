/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import AccesoDatos.BaseDAO;
import Dominio.Empleado;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Citlali Orduño
 */
public class EmpleadoDAO extends BaseDAO<Empleado> {

    @Override
    public void agregar(Empleado entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entidad);
        entityManager.getTransaction().commit();
    }

    @Override
    public void eliminar(Long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Empleado empleado = entityManager.find(Empleado.class, id);
        if (empleado != null) {
            entityManager.remove(empleado);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public void actualizar(Empleado entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Empleado empleado = entityManager.find(Empleado.class, entidad.getId());
        if (empleado != null) {
            empleado.setNombre(entidad.getNombre());
            empleado.setPuesto(entidad.getPuesto());
            empleado.setCorreoE(entidad.getCorreoE());
            empleado.setRFC(entidad.getRFC());
            empleado.setTelefono(entidad.getTelefono());
            empleado.setDireccion(entidad.getDireccion());

            entityManager.merge(empleado);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public ArrayList<Empleado> consultarTodos() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Empleado.class));
        Query query = entityManager.createQuery(criteria);
        List<Empleado> productos = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(productos);
    }

    @Override
    public Empleado buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Empleado empleado = entityManager.find(Empleado.class, id);
        entityManager.getTransaction().commit();
        return empleado;
    }

}
