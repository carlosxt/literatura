package proyecto2.java.interfaces;

import java.util.List;
import proyecto2.java.entities.Libros;

public interface I_LibrosRepository {
    void save     (Libros libros);  // insert into libros
    void remove   (Libros libros);  // delete libros
    void update   (Libros libros);  // update libros
    List<Libros>getAll();           // select * from libros
}
