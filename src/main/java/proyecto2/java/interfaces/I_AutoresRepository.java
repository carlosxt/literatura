package proyecto2.java.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import proyecto2.java.entities.Autores;
import proyecto2.java.entities.Editoriales;

public interface I_AutoresRepository {
    void save    (Autores autores);   // insert into autores
    void remove  (Autores autores);   // delete autores
    void update  (Autores autores);   // update autores
    List<Autores>getAll();            // select * from autores
    default Autores getById(int id){
        return getAll()
                .stream()
                .filter(a->a.getAutor_id()==id)
                .findFirst()
                .orElse(new Autores());
    }
    default List<Autores> getLikeNombre(String nombre){
        if(nombre==null) return new ArrayList<Autores>();
        return getAll()
                .stream()
                .filter(a->a.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    } 
    default List<Autores> getLikeApellido(String apellido){
      if(apellido==null) return new ArrayList<Autores>();
      return getAll()
              .stream()
              .filter(a->a.getApellido().toLowerCase().contains(apellido.toLowerCase()))
              .collect(Collectors.toList());
    }
    default List<Autores> getLikeNacionalidad(String nacionalidad){
      if(nacionalidad==null) return new ArrayList<Autores>();    
      return getAll()
              .stream()
              .filter(a->a.getNacionalidad().toLowerCase().contains(nacionalidad.toLowerCase()))
              .collect(Collectors.toList());
    }
    
    
    
}
