package proyecto2.java.test;

import java.sql.Connection;
import proyecto2.java.connector.Connector;
import proyecto2.java.entities.Autores;
import proyecto2.java.interfaces.I_AutoresRepository;
import proyecto2.java.repositories.AutoresRepository;

public class TestAutores {
    public static void main(String[] args) {
        try(Connection conn=Connector.getConnection()) {
            I_AutoresRepository ar = new AutoresRepository(conn);
            Autores autores=new Autores(45,"Ciro","Alegría",1909,"Peruana","Sin distinciones");
            ar.save(autores);
            System.out.println(autores);
            
            ar.remove(ar.getById(4));
            
            autores = ar.getById(6);
            autores.setNombre("Mario");
            autores.setApellido("Llosa");
            ar.update(autores);
            
            ar.getAll().forEach(System.out::println);
            //cr.getLikeProfesor("go").forEach(System.out::println);
            
           
            
            ar.getAll().forEach(System.out::println);
        } catch (Exception e) { e.printStackTrace();}
    }
}
