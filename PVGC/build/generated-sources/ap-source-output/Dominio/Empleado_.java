package Dominio;

import Dominio.ReporteVenta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-25T20:47:34")
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