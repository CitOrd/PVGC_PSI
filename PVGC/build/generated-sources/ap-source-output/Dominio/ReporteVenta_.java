package Dominio;

import Dominio.Empleado;
import Dominio.Venta;
import Enums.Periodo;
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
@StaticMetamodel(ReporteVenta.class)
public class ReporteVenta_ { 

    public static volatile SingularAttribute<ReporteVenta, Periodo> periodo;
    public static volatile SingularAttribute<ReporteVenta, Empleado> empleado;
    public static volatile ListAttribute<ReporteVenta, Venta> ventas;
    public static volatile SingularAttribute<ReporteVenta, Long> id;

}