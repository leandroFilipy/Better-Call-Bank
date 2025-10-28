package org.example;


import org.example.model.Participante;
import org.example.service.Gerenciador;
import org.example.view.View;

import java.sql.SQLException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        var participante = new Participante();
        var gerenciador = new Gerenciador();
        var view = new View();

        while (true){


            try{

                int decisao2 = view.menu();

                gerenciador.gerenciar(decisao2);
            }catch (InputMismatchException e){
                main(args);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}