package org.example.dao;

import org.example.model.Usuario;
import org.example.util.ConnectionClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {


    public void cadastrarUsuario(Usuario usuario)throws SQLException{

        String query = "INSERT INTO Usuario (nome, matricula, tipo) VALUES (?,?,?);";


        try(Connection conn = ConnectionClass.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){


                stmt.setString(1, usuario.getNome());
                stmt.setString(2, usuario.getMatricula());
                stmt.setString(3, usuario.getTipo());
                stmt.executeUpdate();



        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public boolean verificaDuplicidadeMatricula(String matricula)throws SQLException{

        String query = "SELECT COUNT(*) FROM Usuario WHERE matricula = ?;";

        try(Connection conn = ConnectionClass.connect();
        PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, matricula);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return rs.getInt(1) > 0;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return false;
    }



}
