package org.example.repository;

import org.example.infraestruture.database.Conexao;
import org.example.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao {

    public boolean usuarioExiste(String nome) throws SQLException {

        String query = """
                SELECT nome
                FROM usuario
                WHERE nome = ?;
                """;

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return true;
            }

        }
        return false;

    }

    public void inserirUsuario(Usuario usuario)throws SQLException{

        String query = """
                INSERT INTO usuarios (nome) VALUES (?);
                """;

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, usuario.getNome());
        }
    }
}
