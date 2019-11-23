package proyecto2.java.test;

import java.sql.Connection;
import proyecto2.java.connector.Connector;
import proyecto2.java.entities.Libros;
import proyecto2.java.interfaces.I_LibrosRepository;
import proyecto2.java.repositories.LibrosRepository;

public class TestLibros {
    public static void main(String[] args) {
    try(Connection conn=Connector.getConnection()) {
            I_LibrosRepository lr = new LibrosRepository(conn);
            Libros libros=new Libros("Perros Hambrientos","Novela",7,6);
            lr.save(libros);
            System.out.println(libros);
            
            lr.remove(lr.getById(35));
            
            libros = lr.getById(6);
            libros.setNombre_libro("Galatea");
            lr.update(libros);
            
            lr.getAll().forEach(System.out::println);
            
            lr.getAll().forEach(System.out::println);
        } catch (Exception e) { e.printStackTrace();}
    
    
    
    }
}
