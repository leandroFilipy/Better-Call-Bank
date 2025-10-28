package org.example.view;

import java.util.Scanner;

public class View {

    Scanner read = new Scanner(System.in);

    public int menu(){

        System.out.println("||=======================================================||");
        System.out.println("||                Bem vindo ao sistema                   ||");
        System.out.println("||-------------------------------------------------------||");
        System.out.println("|| 1 - Cadastrar Participante                            ||");
        System.out.println("|| 2 - ");
        System.out.println("||-------------------------------------------------------||");
        System.out.print("|| Insira aqui: ");
        int decisao = read.nextInt();

        read.nextLine();

        return decisao;
    }

    public String nomeParticipante(){

        System.out.println("||-------------------------------------------------------||");
        System.out.println("||             Insira o nome do participante             ||");
        System.out.println("||-------------------------------------------------------||");
        System.out.print("|| Insira aqui: ");
        String nomeParticipante = read.nextLine();

        return nomeParticipante;
    }
    public String emailParticipante(){

        System.out.println("||-------------------------------------------------------||");
        System.out.println("||             Insira o email do participante            ||");
        System.out.println("||-------------------------------------------------------||");
        System.out.print("|| Insira aqui: ");
        String emailParticipante = read.nextLine();

        return emailParticipante;
    }
    public String telefonelParticipante(){

        System.out.println("||-------------------------------------------------------||");
        System.out.println("||           Insira o telefone do participante           ||");
        System.out.println("||-------------------------------------------------------||");
        System.out.print("|| Insira aqui: ");
        String telefoneParticipante = read.nextLine();

        return telefoneParticipante;
    }
    public void messagemNomeParticipanteVazio(){

        System.err.println("||-------------------------------------------------------||");
        System.err.println("||      O campo do nome do participante está vazio       ||");
        System.err.println("||-------------------------------------------------------||");
    }
    public void messagemTelefoneParticipanteVazio(){

        System.err.println("||-------------------------------------------------------||");
        System.err.println("||    O campo do telefone do participante está vazio     ||");
        System.err.println("||-------------------------------------------------------||");
    }
    public void messagemNomeTelefoneParticipanteVazio(){

        System.err.println("||-------------------------------------------------------||");
        System.err.println("||O campo do telefone e email do participante está vazio ||");
        System.err.println("||-------------------------------------------------------||");
    }
    public void mensagemTelefoneJaCadastrado(){

        System.err.println("||-------------------------------------------------------||");
        System.err.println("||                Este telefone já Existe                ||");
        System.err.println("||-------------------------------------------------------||");
    }

}
