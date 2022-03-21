package orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyConnector {
    private static Connection connection;
    private  static  final String jdbcSting = "jdbc:mysql://localhost:3306/";

    private static void createConnection(String user, String password, String dbName) throws SQLException {
        Properties properties = new Properties();
        properties.setProperty("user", user);
        properties.setProperty("password",password);

        connection = DriverManager.getConnection(jdbcSting + dbName,properties);
    }

    public static Connection getConnection(){
        return  connection;
    }
}
