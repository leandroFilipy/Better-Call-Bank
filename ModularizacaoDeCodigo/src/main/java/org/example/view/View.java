package org.example.view;

import org.example.model.Usuario;
import org.example.service.UsuarioService;

import java.sql.SQLException;
import java.util.Scanner;

import static org.example.service.UsuarioService.cadastrarUsuario;

public class View {

    private static Scanner read = new Scanner(System.in);

    public static void inicio() throws SQLException {
        System.out.println("Cadastrar usuário");
        int opcao = read.nextInt();

        read.nextLine();

        switch (opcao) {


            case 1 -> {
                cadastrarUsuario();

            }
        }
    }

        public static void cadastrarUsuario() throws SQLException {
            System.out.println("Cadastro do usuário");
            System.out.println("Insira o nome do usuário para cadastro");
            String nome = read.nextLine();

            var usuario = new Usuario(nome);

            try{
                UsuarioService.cadastrarUsuario();

            }catch (Exception e){
                e.printStackTrace();
            }


        }

    }

