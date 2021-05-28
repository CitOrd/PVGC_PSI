package Dominio;

import Dominio.ReporteVenta;
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
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, String> puesto;
    public static volatile SingularAttribute<Empleado, String> correoE;
    public static volatile SingularAttribute<Empleado, String> direccion;
    public static volatile ListAttribute<Empleado, ReporteVenta> reportes;
    public static volatile SingularAttribute<Empleado, Long> id;
    public static volatile SingularAttribute<Empleado, String> telefono;
    public static volatile SingularAttribute<Empleado, String> nombre;
    public static volatile SingularAttribute<Empleado, String> RFC;

}