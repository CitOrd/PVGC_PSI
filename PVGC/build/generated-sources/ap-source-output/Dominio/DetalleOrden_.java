package Dominio;

import Dominio.Orden;
import Dominio.Producto;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-04-27T19:43:19")
@StaticMetamodel(DetalleOrden.class)
public class DetalleOrden_ { 

    public static volatile SingularAttribute<DetalleOrden, Double> total;
    public static volatile SingularAttribute<DetalleOrden, List> notas;
    public static volatile SingularAttribute<DetalleOrden, Long> id;
    public static volatile SingularAttribute<DetalleOrden, Orden> orden;
    public static volatile SingularAttribute<DetalleOrden, Producto> producto;
    public static volatile SingularAttribute<DetalleOrden, Integer> cantidad;

}