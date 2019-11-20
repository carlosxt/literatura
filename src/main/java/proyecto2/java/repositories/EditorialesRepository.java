package proyecto2.java.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import proyecto2.java.entities.Editoriales;
import proyecto2.java.interfaces.I_EditorialesRepository;

public class EditorialesRepository implements I_EditorialesRepository {

    private Connection conn;

    public EditorialesRepository(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void save(Editoriales editoriales) {
        if (editoriales == null) {
            return;
        }
        try ( PreparedStatement ps = conn.prepareStatement(
                "insert into editoriales (editorial_id, nombre) values (?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS
        )) {
            ps.setInt(1, editoriales.getEditorial_id());
            ps.setString(2, editoriales.getNombre());

//            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                editoriales.setEditorial_id(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(Editoriales editoriales) {
        if (editoriales == null) {
            return;
        }
        try ( PreparedStatement ps = conn.prepareStatement(
                "delete from editoriales where editorial_id=?")) {
            ps.setInt(1, editoriales.getEditorial_id());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Editoriales editoriales) {
        if (editoriales == null) {
            return;
        }
        try ( PreparedStatement ps = conn.prepareStatement(
                "update editoriales set nombre=? where editorial_id=?"
        )) {

            ps.setString(1, editoriales.getNombre());
            ps.setInt(2, editoriales.getEditorial_id());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Editoriales> getAll() {
     List<Editoriales>list=new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery(
                "select * from editoriales")) {
            while(rs.next()){
                list.add(new Editoriales(
        //       rs.getInt("id"),
                        rs.getString("nombre")
                        
                ));
            }
        } catch (Exception e) { e.printStackTrace();  }
        return list;   
    
      }
}

