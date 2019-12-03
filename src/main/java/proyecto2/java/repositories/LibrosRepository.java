package proyecto2.java.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import proyecto2.java.entities.Libros;
import proyecto2.java.interfaces.I_LibrosRepository;

public class LibrosRepository implements I_LibrosRepository {
private Connection conn;

    public LibrosRepository(Connection conn) {
        this.conn = conn;
    }
    @Override
    public void save(Libros libros) {
   if (libros == null) {
            return;
        }
        try ( PreparedStatement ps = conn.prepareStatement(
                "insert into libros (nombre_libro, genero_libro, editorial_id, autor_id ) values (?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS
        )) {
            
            ps.setString(1, libros.getNombre_libro());
            ps.setString(2, libros.getGenero_libro());
            ps.setInt(3, libros.getEditorial_id());
            ps.setInt(4, libros.getAutor_id());

            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                libros.setLibro_id(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void remove(Libros libros) {
     if (libros == null) {
            return;
        }
        try ( PreparedStatement ps = conn.prepareStatement(
                "delete from libros where libro_id=?")) {
            ps.setInt(1, libros.getLibro_id());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void update(Libros libros) {
     if (libros == null) {
            return;
        }
        try ( PreparedStatement ps = conn.prepareStatement(
                "update libros set nombre_libro=?, genero_libro=?, editorial_id=?, autor_id=?  where libro_id=?"
        )) {

            ps.setString(1, libros.getNombre_libro());
            ps.setString(2, libros.getGenero_libro());
            ps.setInt(3, libros.getEditorial_id() );
            ps.setInt(4, libros.getAutor_id());
            ps.setInt(5, libros.getLibro_id());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public List<Libros> getAll() {
    List<Libros>list=new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery(
                "select * from libros")) {
            while(rs.next()){
                list.add(new Libros(
                        rs.getInt("libro_id"),
                        rs.getString("nombre_libro"),
                        rs.getString("genero_libro"),
                        rs.getInt("editorial_id"),
                        rs.getInt("autor_id")
                        
                ));
            }
        } catch (Exception e) { e.printStackTrace();  }
        return list;
    
      }
}