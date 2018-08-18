package Database;

import java.sql.*;

public class SqliteConnection {
    public static Connection Connector() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:studentsDB.sqlite");
            return conn;
        } catch (Exception e) {
            // if nothing is obtained, then return null
            System.out.println(e);
            return null;
        }
    }
}
