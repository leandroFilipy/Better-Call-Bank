package org.example.dao;

import org.example.database.ConnectionClass;
import org.example.model.Participante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ParticipanteDao {


    public void cadastrarParticipante(Participante participante) throws SQLException {

        String query = "INSERT INTO Participante (nome, email, telefone) VALUES (?,?,?);";


        try (Connection conn = ConnectionClass.conectar();
             PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, participante.getNome());
            stmt.setString(2, participante.getEmail());
            stmt.setString(3, participante.getTelefone());
            stmt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public boolean verificaSeTelefoneExist(String telefone) throws SQLException{

        String query = "SELECT COUNT(*) FROM Participante WHERE telefone = ?;";

        try(Connection conn = ConnectionClass.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, telefone);

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
