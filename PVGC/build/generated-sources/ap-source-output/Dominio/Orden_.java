package Dominio;

import Dominio.DetalleOrden;
import Dominio.Venta;
import Enums.Estado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-01T00:31:11")
@StaticMetamodel(Orden.class)
public class Orden_ { 

    public static volatile ListAttribute<Orden, DetalleOrden> detalleOrdenes;
    public static volatile SingularAttribute<Orden, Estado> estado;
    public static volatile SingularAttribute<Orden, Venta> venta;
    public static volatile SingularAttribute<Orden, Integer> numMesa;
    public static volatile SingularAttribute<Orden, Long> id;

}