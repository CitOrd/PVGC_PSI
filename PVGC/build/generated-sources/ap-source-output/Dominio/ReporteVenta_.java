package Dominio;

import Dominio.Empleado;
import Dominio.Venta;
import Enums.Periodo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-04-14T15:25:06")
@StaticMetamodel(ReporteVenta.class)
public class ReporteVenta_ { 

    public static volatile SingularAttribute<ReporteVenta, Periodo> periodo;
    public static volatile SingularAttribute<ReporteVenta, Empleado> empleado;
    public static volatile ListAttribute<ReporteVenta, Venta> ventas;
    public static volatile SingularAttribute<ReporteVenta, Long> id;

}