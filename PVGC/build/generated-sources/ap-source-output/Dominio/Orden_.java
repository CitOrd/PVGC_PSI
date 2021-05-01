package Dominio;

import Dominio.DetalleOrden;
import Dominio.Venta;
import Enums.Estado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-05-01T04:04:42")
@StaticMetamodel(Orden.class)
public class Orden_ { 

    public static volatile ListAttribute<Orden, DetalleOrden> detalleOrdenes;
    public static volatile SingularAttribute<Orden, Estado> estado;
    public static volatile SingularAttribute<Orden, Venta> venta;
    public static volatile SingularAttribute<Orden, Integer> numMesa;
    public static volatile SingularAttribute<Orden, Long> id;

}