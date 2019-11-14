package proyecto2.java.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import proyecto2.java.entities.Autores;
import proyecto2.java.interfaces.I_AutoresRepository;

public class AutoresRepository implements I_AutoresRepository{
private Connection conn;
    public AutoresRepository(Connection conn) { this.conn=conn; } 
    @Override
    public void save(Autores autores) {
    if(autores==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
            "insert into autores (autor_id,nombre,apellido,año_nacimiento,nacionalidad,distinciones) values (?,?,?,?,?,?)",
            PreparedStatement.RETURN_GENERATED_KEYS
        )) {
            ps.setInt(1, autores.getAutor_id());
            ps.setString(2, autores.getNombre());
            ps.setString(3, autores.getApellido());
            ps.setInt(4, autores.getAño_nacimiento());
            ps.setString(5, autores.getNacionalidad());
            ps.setString(6, autores.getDistinciones());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()) autores.setAutor_id(rs.getInt(1));
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void remove(Autores autores) {
    if(autores==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "delete from autores where autor_id=?")){
            ps.setInt(1, autores.getAutor_id());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void update(Autores autores) {
    if(autores==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
            "update autores set nombre=?, apellido=?, año_nacimiento=?, nacionalidad=?, distinciones=? where autor_id=?"
        )) {
            
            ps.setString(1, autores.getNombre());
            ps.setString(2, autores.getApellido());
            ps.setInt(3, autores.getAño_nacimiento());
            ps.setString(4, autores.getNacionalidad());
            ps.setString(5, autores.getDistinciones());
            ps.setInt(6, autores.getAutor_id());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<Autores> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
