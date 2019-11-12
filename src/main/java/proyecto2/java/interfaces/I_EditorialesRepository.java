package proyecto2.java.interfaces;

import java.util.List;
import proyecto2.java.entities.Editoriales;

public interface I_EditorialesRepository {
      void save    (Editoriales editoriales);    // insert into editoriales
      void remove  (Editoriales editoriales);    // delete editoriales
      void update  (Editoriales editoriales);    // update editoriales
      List<Editoriales>getAll();                 // select * from editoriales
}
