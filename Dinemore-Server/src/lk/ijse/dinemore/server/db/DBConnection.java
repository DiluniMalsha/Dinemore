package lk.ijse.dinemore.server.db;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private Connection connection;
    private static DBConnection dBConnection;
    private DBConnection() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        Class.forName("com.mysql.jdbc.Driver");
        String jdbc = "jdbc:mysql://localhost:3306/Dinemore";
        connection = DriverManager.getConnection(jdbc, "root", "9899");
    }
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException, IOException {
        if(dBConnection==null){
            dBConnection=new DBConnection();
        }
        return dBConnection;
    }
    public Connection getConnection(){
        return connection;
    }

}
