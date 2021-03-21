/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Dominio.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author R2
 */
public class ProductoDAO extends BaseDAO<Producto> {

    @Override
    public void agregar(Producto entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entidad);
        entityManager.getTransaction().commit();
    }

    @Override
    public void eliminar(Long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Producto producto = entityManager.find(Producto.class, id);
        if (producto != null) {
            entityManager.remove(producto);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public void actualizar(Producto entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Producto producto = entityManager.find(Producto.class, entidad.getId());
        if (producto != null) {
            producto.setNombre(entidad.getNombre());
            producto.setCategoria(entidad.getCategoria());
            producto.setDetalleOrdenes(entidad.getDetalleOrdenes());
            producto.setDisponibilidad(entidad.isDisponibilidad());
            producto.setPrecio(entidad.getPrecio());

            entityManager.merge(producto);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public ArrayList<Producto> consultarTodos() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Producto.class));
        Query query = entityManager.createQuery(criteria);
        List<Producto> productos = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(productos);
    }

    
    public ArrayList<Producto> consultarPorNombre(String nombre){
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        List<Producto> productos;
        if (!nombre.equals("")) {
            /*Aquí está así por mera intuición, no sé como se llame la tabla ni la BD*/
            String jpql = String.format("SELECT * FROM PVGC.producto WHERE PVGC.producto.nombre LIKE '%%"+nombre+"%%'");
            productos = entityManager.createNativeQuery(jpql, Producto.class).getResultList();
        } else {
            String jpql = "SELECT * FROM PVGC.producto;";
            productos = entityManager.createNativeQuery(jpql, Producto.class).getResultList();
        }
        entityManager.getTransaction().commit();

        return new ArrayList<>(productos);
    }
    @Override
    public Producto buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Producto producto = entityManager.find(Producto.class, id);
        entityManager.getTransaction().commit();
        return producto;
    }

}
