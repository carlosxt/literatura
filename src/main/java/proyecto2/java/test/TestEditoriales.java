package proyecto2.java.test;

import java.sql.Connection;
import proyecto2.java.connector.Connector;
import proyecto2.java.entities.Editoriales;
import proyecto2.java.interfaces.I_EditorialesRepository;
import proyecto2.java.repositories.EditorialesRepository;

public class TestEditoriales {
    public static void main(String[] args) {
        try(Connection conn=Connector.getConnection()) {
            I_EditorialesRepository er = new EditorialesRepository(conn);
            Editoriales editoriales=new Editoriales("Caralt");
            er.save(editoriales);
            System.out.println(editoriales);
            
            er.remove(er.getById(35));
            
            editoriales = er.getById(6);
            editoriales.setNombre("Booket");
            er.update(editoriales);
            
            er.getAll().forEach(System.out::println);
            
            
           
            
            er.getAll().forEach(System.out::println);
        } catch (Exception e) { e.printStackTrace();}
    }
}
