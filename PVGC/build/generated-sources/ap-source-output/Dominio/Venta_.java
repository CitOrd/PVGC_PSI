package Dominio;

import Dominio.Orden;
import Dominio.ReporteVenta;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-28T00:58:38")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Calendar> fecha;
    public static volatile SingularAttribute<Venta, Float> total;
    public static volatile ListAttribute<Venta, Orden> ordenes;
    public static volatile SingularAttribute<Venta, Long> id;
    public static volatile SingularAttribute<Venta, ReporteVenta> reporteV;

}