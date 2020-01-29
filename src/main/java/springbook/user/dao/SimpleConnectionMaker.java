package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_springframework?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF8&autoReconnect=true&autoReconnectForPools=true","root","1234");
        return c;
    }
}
