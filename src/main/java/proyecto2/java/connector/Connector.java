package proyecto2.java.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    
    private static String driver="com.mysql.cj.jdbc.Driver";
    //Localhost
    //private static String url="jdbc:mysql://localhost:3306/literatura?useTimezone=true&serverTimezone=UTC";
    //private static String user="root";
    //private static String pass="tripode18";
    // useTimezone=true&serverTimezone=UTC  
    private static String url="jdbc:mysql://remotemysql.com:3306/pzpmsCDtRr";
    private static String user="pzpmsCDtRr";
    private static String pass="wOUIB423M5";
   
    private static Connection conn=null;
    private Connector(){}
    public synchronized static Connection getConnection(){
        if(conn==null){
            try {
                Class.forName(driver);
                conn=DriverManager.getConnection(url,user,pass);
            } catch (Exception e) { e.printStackTrace(); }
        }
        return conn;
   }
}