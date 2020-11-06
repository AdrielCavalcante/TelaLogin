package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class factory{
        public Connection getConnection() {

        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3308/LoginJava?useTimezone=true&serverTimezone=UTC","root","");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
        }
}