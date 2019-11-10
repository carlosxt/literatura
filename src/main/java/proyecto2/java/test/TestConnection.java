package proyecto2.java.test;

import java.sql.Connection;
import java.sql.Statement;
import proyecto2.java.connector.Connector;

public class TestConnection {
     public static void main(String[] args) {
        try (Connection conn=Connector.getConnection()){
           Statement st=conn.createStatement(); 
           String query="insert into autores (autor_id,nombre,apellido,año_nacimiento,nacionalidad,distinciones) values ("
                   + "15,'Erskine','Caldwell',1903,'Estadounidense','Sin distinciones')";
           st.execute(query);
           
           
           conn.createStatement().execute(
                   "insert into autores (autor_id,nombre,apellido,año_nacimiento,nacionalidad,distinciones) values ("
                           + "16,'Franz','Kafka',1912,'Checa','Sin distinciones')"
           );
           
           
        } catch (Exception e) { e.printStackTrace(); }
    }
}

