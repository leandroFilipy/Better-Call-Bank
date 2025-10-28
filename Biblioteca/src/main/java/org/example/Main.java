package org.example;

import org.example.model.Livro;
import org.example.model.Usuario;
import org.example.service.Gerenciamento;
import org.example.view.Atendente;

import java.sql.SQLException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Atendente atendente = new Atendente();
        Usuario usuario = new Usuario();
        Gerenciamento gerenciamento = new Gerenciamento();
        Livro livro = new Livro();


        while(true){


            try{

                int decisao2 = atendente.menu();

                gerenciamento.gerenciamento(atendente, decisao2);

            }catch (InputMismatchException e){
                main(args);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}