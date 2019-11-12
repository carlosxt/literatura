package proyecto2.java.interfaces;

import java.util.List;
import proyecto2.java.entities.Autores;

public interface I_AutoresRepository {
    void save    (Autores autores);   // insert into autores
    void remove  (Autores autores);   // delete autores
    void update  (Autores autores);   // update autores
    List<Autores>getAll();            // select * from autores
}
