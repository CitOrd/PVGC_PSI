/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;
import AccesoDatos.BaseDAO;
import Dominio.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
/**
 *
 * @author Citlali Orduño
 */
public class CategoriaDAO extends BaseDAO<Categoria>{

    @Override
    public void agregar(Categoria entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entidad);
        entityManager.getTransaction().commit();
        System.out.println("Se agregó la categoría");
    }

    @Override
    public void eliminar(Long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Categoria categoria = entityManager.find(Categoria.class, id);
        if (categoria != null) {
            entityManager.remove(categoria);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public void actualizar(Categoria entidad) {
          EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Categoria categoria = entityManager.find(Categoria.class, entidad.getId());
        if (categoria != null) {
           
            categoria.setNombre(entidad.getNombre());
            categoria.setDescripcion(entidad.getDescripcion());
            categoria.setProductos(entidad.getProductos());

            entityManager.merge(categoria);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public ArrayList<Categoria> consultarTodos() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Categoria.class));
        Query query = entityManager.createQuery(criteria);
        List<Categoria> categorias = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(categorias);
    }
    
    
    public ArrayList<Categoria> consultarPorNombre(String nombre){
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        List<Categoria> categorias;
        if (!nombre.equals("")) {
            /*Aquí está así por mera intuición, no sé como se llame la tabla ni la BD*/
            String jpql = String.format("SELECT * FROM PVGC.categoria WHERE PVGC.categoria.nombre LIKE '%%"+nombre+"%%'");
            categorias = entityManager.createNativeQuery(jpql, Categoria.class).getResultList();
        } else {
            String jpql = "SELECT * FROM PVGC.categoria";
            categorias = entityManager.createNativeQuery(jpql, Categoria.class).getResultList();
        }
        entityManager.getTransaction().commit();

        return new ArrayList<>(categorias);
    }

    @Override
    public Categoria buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Categoria categoria = entityManager.find(Categoria.class, id);
        entityManager.getTransaction().commit();
        return categoria;
    }
    
}
