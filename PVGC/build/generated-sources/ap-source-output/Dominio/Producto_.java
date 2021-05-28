package Dominio;

import Dominio.Categoria;
import Dominio.DetalleOrden;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< Updated upstream
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-27T20:15:42")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-27T23:34:16")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-27T20:15:42")
>>>>>>> d1417f6f56c2826856ec3b6638e7b576f9bacba7
>>>>>>> Stashed changes
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile ListAttribute<Producto, DetalleOrden> detalleOrdenes;
    public static volatile SingularAttribute<Producto, Float> precio;
    public static volatile SingularAttribute<Producto, Boolean> disponibilidad;
    public static volatile SingularAttribute<Producto, Categoria> categoria;
    public static volatile SingularAttribute<Producto, Long> id;
    public static volatile SingularAttribute<Producto, String> nombre;

}