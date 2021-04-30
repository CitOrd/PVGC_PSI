package Dominio;

import Dominio.Orden;
import Dominio.Producto;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-30T16:46:38")
@StaticMetamodel(DetalleOrden.class)
public class DetalleOrden_ { 

    public static volatile SingularAttribute<DetalleOrden, Double> total;
    public static volatile SingularAttribute<DetalleOrden, List> notas;
    public static volatile SingularAttribute<DetalleOrden, Long> id;
    public static volatile SingularAttribute<DetalleOrden, Orden> orden;
    public static volatile SingularAttribute<DetalleOrden, Producto> producto;
    public static volatile SingularAttribute<DetalleOrden, Integer> cantidad;

}