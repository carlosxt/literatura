package proyecto2.java.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import proyecto2.java.entities.Editoriales;

public interface I_EditorialesRepository {
      void save    (Editoriales editoriales);    // insert into editoriales
      void remove  (Editoriales editoriales);    // delete editoriales
      void update  (Editoriales editoriales);    // update editoriales
      List<Editoriales>getAll();                 // select * from editoriales
      
   default List<Editoriales> getLikeNombre(String nombre){
        if(nombre==null) return new ArrayList<Editoriales>();
        return getAll()
                .stream()
                .filter(e->e.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
}


}