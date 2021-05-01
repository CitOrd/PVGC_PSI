package Dominio;

import Dominio.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-01T00:31:11")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile SingularAttribute<Categoria, String> descripcion;
    public static volatile SingularAttribute<Categoria, Long> id;
    public static volatile SingularAttribute<Categoria, String> nombre;
    public static volatile ListAttribute<Categoria, Producto> productos;

}