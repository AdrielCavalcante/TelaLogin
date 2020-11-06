package dao;

import Modelo.usuarios;
import factory.factory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class usuariosdao {
    private final Connection connection;
    int id;
    String login;
    String senha;
    public usuariosdao(){
        this.connection = new factory().getConnection();
    }
     public void adiciona(usuarios usuario){String sql = "INSERT INTO usuarios (login,senha) VALUES(?,?)";
    try {
            PreparedStatement stmt = connection.prepareStatement(sql); 
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.execute();
        
    }
    catch (SQLException u) {
    throw new RuntimeException(u);
    }
    }
}
