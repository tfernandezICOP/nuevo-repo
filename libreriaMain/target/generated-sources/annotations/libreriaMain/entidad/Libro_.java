package libreriaMain.entidad;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import libreriaMain.entidad.Autor;
import libreriaMain.entidad.Editorial;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-06T18:34:20", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Libro.class)
public class Libro_ { 

    public static volatile SingularAttribute<Libro, Editorial> editorial;
    public static volatile SingularAttribute<Libro, Integer> ejemplares;
    public static volatile SingularAttribute<Libro, Boolean> alta;
    public static volatile SingularAttribute<Libro, Long> isbn;
    public static volatile SingularAttribute<Libro, Integer> ejemplaresPrestados;
    public static volatile SingularAttribute<Libro, String> titulo;
    public static volatile SingularAttribute<Libro, Integer> id;
    public static volatile SingularAttribute<Libro, Integer> ejemplaresRestantes;
    public static volatile SingularAttribute<Libro, Integer> anio;
    public static volatile SingularAttribute<Libro, Autor> autor;

}