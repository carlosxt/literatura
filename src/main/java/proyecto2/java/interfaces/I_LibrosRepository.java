package proyecto2.java.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import proyecto2.java.entities.Autores;
import proyecto2.java.entities.Editoriales;
import proyecto2.java.entities.Libros;

public interface I_LibrosRepository {
    void save     (Libros libros);  // insert into libros
    void remove   (Libros libros);  // delete libros
    void update   (Libros libros);  // update libros
    List<Libros>getAll();           // select * from libros
    
    default List<Libros> getLikeNombre_libro(String nombre_libro){
        if(nombre_libro==null) return new ArrayList<Libros>();
        return getAll()
                .stream()
                .filter(a->a.getNombre_libro().toLowerCase().contains(nombre_libro.toLowerCase()))
                .collect(Collectors.toList());
   }
    
   default List<Libros> getLikeGenero_libro(String genero_libro){
        if(genero_libro==null) return new ArrayList<Libros>();
        return getAll()
                .stream()
                .filter(a->a.getGenero_libro().toLowerCase().contains(genero_libro.toLowerCase()))
                .collect(Collectors.toList());
   }
    
   default List<Libros> getByAutores(Autores autores){
        if(autores==null) return new ArrayList<Libros>();
        return getAll()
                .stream()
                .filter(a->a.getAutor_id()==autores.getAutor_id())
                .collect(Collectors.toList());
    }
   
   default List<Libros> getByEditoriales(Editoriales editoriales){
        if(editoriales==null) return new ArrayList<Libros>();
        return getAll()
                .stream()
                .filter(l->l.getEditorial_id()==editoriales.getEditorial_id())
                .collect(Collectors.toList());
   }


}