package org.example.dao;

import org.example.model.Livro;
import org.example.util.ConnectionClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {




    public void registrarLivro(Livro livro) throws SQLException{

        String query = "INSERT INTO Livro (titulo, autor, isbn, estoque) VALUES (?,?,?,?);";


        try(Connection conn = ConnectionClass.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getIsbn());
            stmt.setInt(4, livro.getQuantidadeInicialEmEstoque());
            stmt.executeUpdate();


        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public boolean verificaISBNDuplicado(String isbn) throws SQLException{

        String query = "SELECT COUNT(*) FROM Livro WHERE isbn = ?;";

        try(Connection conn = ConnectionClass.connect();
        PreparedStatement stmt = conn.prepareStatement(query)){


            stmt.setString(1, isbn);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return rs.getInt(1)>0;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return false;
    }

    public List<Livro> listarLivros()throws SQLException{
        ArrayList<Livro> livros = new ArrayList<>();

        String query = "SELECT id, titulo, autor, isbn, estoque FROM Livro;";

        try(Connection conn = ConnectionClass.connect();
        PreparedStatement stmt = conn.prepareStatement(query)){

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){

                Livro livro = new Livro(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("isbn"),
                        rs.getInt("estoque")
                );

                System.out.println("===========================");
                System.out.println("            Livro          ");
                System.out.println("---------------------------");
                System.out.println("ID: " + livro.getId());
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("ISBN: " + livro.getIsbn());
                System.out.println("Estoque: " + livro.getQuantidadeInicialEmEstoque());

                livros.add(livro);
            }

        }

        return livros;
    }

    public boolean estoquePorId(int id) throws SQLException {

        String query = "SELECT quantidade FROM Livro WHERE id = ?;";

        int estoqueAgr =0;

        try (Connection conn = ConnectionClass.connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            if(rs.next()){

                estoqueAgr = rs.getInt("estoque");

            }
        }
        return estoqueAgr;
    }
}
