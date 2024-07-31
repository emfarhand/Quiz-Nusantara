package javaquiz;

import java.sql.*;

public class class_koneksi {
    
    Connection conn;
    public Connection getConSQL(){
        try{
            String url = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=history_quiz;user=sa;password=612003";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return conn;
    }
}
